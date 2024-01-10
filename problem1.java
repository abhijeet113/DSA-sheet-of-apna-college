/**
 * problem1
 * Maximum and minimum of an array using minimum number of comparisons
 */
import java.util.Scanner;
public class problem1 {
    static int minofarr(int[]arr){
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int maxofarr(int[]arr){
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(max<=arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]= new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
    }
    System.out.println("min= "+minofarr(arr));
    System.out.println("max= "+maxofarr(arr));


}
    
}