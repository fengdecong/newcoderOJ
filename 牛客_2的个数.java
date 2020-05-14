import java.util.*;
public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        int m = 1;
        while(n / m != 0){
            int num = n / m;
            int cur = num % 10;
            int high = num /10;
            int low = n % m;
            if(cur < 2){
                count += high * m;
            }
            else if(cur == 2){
                count += high*m + (low + 1);
            }
            else{
                count += (high+1)*m;
            }
            if(n / m < 20)
                break;
            m = m*10;
        }
        return count;
    }
}