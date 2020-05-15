//一次可上1,2或者3个台阶;此题类似斐波那契数列
public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        long[] m = {1,2,4};   //当n=1,2,3时的结果
        if(n <= 0)return 0;
        else if(n <= 3)return (int)m[n-1];
        else{
            for(int i = 4;i <= n;i++){
               long tmp = (m[0] + m[1] + m[2]) % 1000000007;
                m[0] = m[1];
                m[1] = m[2];
                m[2] = tmp;
            }
        }
        return (int)m[2];
    }
}