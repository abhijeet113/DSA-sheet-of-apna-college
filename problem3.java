/*
 * Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.
 */
import java.util.Scanner;
public class problem3 {
        static int sum(int []nums ,int stidx,int lsidx){
            int s=0;
            for(int i=stidx;i<lsidx;i++){
                s+=nums[i];
            }
            return s;
        }
        static int maxSubArray(int[] nums) {
            int s=0 ,k=0 ,a=nums.length;
            for(int i=0;i<nums.length;i++){
                if(sum(nums,i,nums.length-1)>=s){
                    s=sum(nums,i,nums.length-1);
                    k=i;
                }
            }
            for(int i=0;i<a;i++){
                if(sum(nums,k,a-i)>s){
                    s=sum(nums,k,a-i);
                }
            }
            return s;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}
