import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                int length = map.getOrDefault(a.charAt(i), 0);
                map.put(a.charAt(i), length + 1);
            }
            int n = 0; 
            for (int j = 0; j < b.length(); j++) {
                int len = map.getOrDefault(b.charAt(j), 0);
                if (len <= 0) {
                    n++;
                }
                map.put(b.charAt(j), len - 1);
            }
            if (n == 0) {
                System.out.println("Yes" + " " + (a.length() - b.length()));
            } else {
                System.out.println("No" + " " + n);
            }
        }
        sc.close();
    }
}