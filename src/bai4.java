import java.util.Arrays;

public class bai4 {
    public static int searchmax(int[] arr){
        int max= 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void countingSort(int[] arr) {
        int max=searchmax(arr);

        int[] count= new int[max+1];

        for(int num:arr){
            count[num]++;
        }

        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        int[] output=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            int num=arr[i];
            output[count[num]-1]=num;
            count[num]--;
        }
        for(int num:output){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] arr={4,2,2,8,3,3,1};
        countingSort(arr);
    }
}
