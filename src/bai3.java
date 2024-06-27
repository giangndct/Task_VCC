public class bai3 {
    public static int binarysearchfirst(int[] a, int target){

        int pos=-1;
        int left=0;
        int right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target==a[mid]){
                pos=mid;
                right=mid-1;
            }else if (target>a[mid]){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return pos;

    }
    public static int binarysearchend(int[] a, int target){

        int pos=-1;
        int left=0;
        int right=a.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target==a[mid]){
                pos=mid;
                left=mid+1;
            }else if (target>a[mid]){
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return pos;

    }

    public static void main(String[] args) {
        int[] a={5,6,7,8,8,15};
        int target=8;
        System.out.println(binarysearchfirst(a,target));
        System.out.println(binarysearchend(a,target));


    }
}
