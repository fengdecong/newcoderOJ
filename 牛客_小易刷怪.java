import java.util.Scanner;
public class Main {
    public static int energy(int n, int a, int[] b) {
        for (int i = 0; i < n; i++) {
            if (a >= b[i]) {
                a += b[i];
            }else{
                a += maxCommonNum(b[i], a);
            }
        }
            return a;
    }
    //求最大公约数
    public static int maxCommonNum(int m, int n) {
        if (m < n) {// 保证m>n,若m<n,则进行数据交换
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) // 若余数为0,返回最大公约数
            return n;
        else // 否则,进行递归,把n赋给m,把余数赋给n
            return maxCommonNum(n, m % n);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();  //多少个怪物
            int a = sc.nextInt();  //初始法力值
            //存放怪兽防御
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();
            System.out.println(energy(n, a, b));
        }
    }
}