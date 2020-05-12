import java.util.Scanner;
public class Main{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String[] A = a.split("\\s+");  //以 \s 作为没一个数组空间的分割
            for(int i = A.length - 1;i > 0; i--){
                System.out.print(A[i] + " ");
            }
            System.out.println(A[0]);
        }
    }
}