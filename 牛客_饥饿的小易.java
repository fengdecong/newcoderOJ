//解题思路：4*x + 3 是2次2 * x + 1的结果，
//而8 * x + 7 是三次 2 * x + 1的结果，每次都进行2 * x + 1，
//最后再统计出来每次执行3次和执行2次的次数的和就是至少的所求、

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int count = 0;
        while (x0 != 0 && count <= 300000) {
            x0 = (x0 * 2 + 1) % 1000000007;
            count++;
        }
        int res = (count + 2) / 3;
        System.out.println(res > 100000 ? -1 : res);
    }
}