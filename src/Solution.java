import java.util.*;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()<nums.length){
            return true;
        }else{
            return false;
        }
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count= new int[100];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int n:count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new LinkedHashMap<>();

        for(int i=0;i<nums.length;i++){
            int check=target-nums[i];
            int num=nums[i];

            if(map.containsKey(check)){
                return new int[]{map.get(check),i};
            }
            map.put(num,i);


        }
        return new int[]{};
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,List<String>> map= new LinkedHashMap<>();
        for(String string:strs){
            int sum=0;
            for(char c:string.toCharArray()){
                sum+=c;
            }
            if(!map.containsKey(sum)){
                map.put(sum,new ArrayList<>());
            }
            map.get(sum).add(string);
        }
        return new ArrayList<>(map.values());
    }

    public static String encode(List<String> strs) {
        String res ="";
        for(String i:strs){
            res += i.length() +"#"+i;
        }
        return res;
    }

    public static List<String> decode(String str) {
        List<String> list= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while (str.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1+length;
            list.add(str.substring(j+1,i));

        }
        return list;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] arr= new int[nums.length];
        int l=1;int r=1;
        for(int i=0;i<nums.length;i++){
            arr[i]= l;
            l*=arr[i];
        }
        for (int i=nums.length-1;i>=0;i--){
            arr[i]*=r;
            r*=arr[i];
        }
        return arr;
    }
    public static boolean isPalindrome(String s) {
        String s1="";
        String s2="";

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' ||  s.charAt(i)>='A' && s.charAt(i)<='Z'||'0'<=s.charAt(i)&&s.charAt(i)<='9'){
                s1 += String.valueOf(s.charAt(i));
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' ||  s.charAt(i)>='A' && s.charAt(i)<='Z'||'0'<=s.charAt(i)&&s.charAt(i)<='9'){
                s2 += String.valueOf(s.charAt(i)) ;
            }
        }


        if(s1.equalsIgnoreCase(s2)){
            return true;
        }else {
            return false;
        }

    }

    public int[] twoSum1(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while (l<r){
            int sum=numbers[l]+numbers[r];
            if(sum<target){
                l++;
            } else if(sum==target){
                return new int[]{l+1,r+1};
            }
            else {
                r--;
            }

        }
        return new int[0];
    }
    public static void main(String[] args) {

    }
}
