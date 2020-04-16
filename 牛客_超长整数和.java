import java.util.*;
import java.math.*;
 
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a=sc.next();
            String b=sc.next();
                BigInteger sum1 = new BigInteger(a);
                BigInteger sum2 = new BigInteger(b);
                BigInteger sum = sum1.add(sum2);
                System.out.println(sum);
        }
    }
}