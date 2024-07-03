package Bai1;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class bai1 {

    public static boolean binarysearch1(int[] a, int target){

            int left=0;
            int right=a.length-1;
            while (left<=right){
                int mid=(left+right)/2;
                if(target==a[mid]){
                    return true;
                }else if (target>a[mid]){
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }
            }
        return false;

    }
    public static List<Integer> searchnum(int[] a,int[] b){
        List<Integer> list= new ArrayList<>();
        for(int num:b){
            if(binarysearch1(a,num)){
                list.add(num);
            }
        }

        return list;
    }


    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={2,4,6,8,10,12,14};
        List<Integer> list= searchnum(a,b);
        for(int num:list){
            System.out.println(num);
        }

    }
}