import java.util.Scanner;
public class Main {
    public static int search(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        for (i = 0; i < n; i++) {
            int m = sc.nextInt();
            arr[i] = m;
        }
        int x = sc.nextInt();
        System.out.println(search(arr,x));
    }
}