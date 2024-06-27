import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bai5 {
    public List<String> wordBreak(String s,Set<String> wordDict){
        List<String> result= new ArrayList<>();

        if(s==null||s.length()==0||wordDict.isEmpty()){
            return result;
        }

        int n=s.length();
        boolean[] dp= new boolean[n+1];
        dp[0]=true;

        for(int end=1;end<=n;end++){
            for(int start=0 ; start < end; start++){
                if(dp[start]&wordDict.contains(s.substring(start,end))){
                    dp[end]=true;
                    break;
                }
            }
        }

        List<String> current = new ArrayList<>();
        generateSentences(s, n, wordDict, dp, 0, current, result);

        return result;
    }

    private void generateSentences(String s,int n,Set<String> wordDict,boolean[] dp,
                                   int start,List<String> current,List<String> resutl){
        if (start == n) {
            resutl.add(String.join(" ", current));
            return;
        }

        for (int end=start+1;end<=n;end++){
            if(dp[end]){
                String word=s.substring(start,end);
                if(wordDict.contains(word)){
                    current.add(word);
                    generateSentences(s,n,wordDict,dp,end,current,resutl);
                    current.remove(current.size()-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        bai5 bai5 = new bai5();
        String s = "catsanddog";
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        List<String> sentences= bai5.wordBreak(s,wordDict);
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }

}
