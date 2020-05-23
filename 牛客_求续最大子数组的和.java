import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int sum = num[0];
        int max = num[0];
        for(int i=1; i<n; i++){
            sum = Math.max(sum,0)+num[i];
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}