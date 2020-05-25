import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        ArrayList<Character> list = new ArrayList<>();
        while (sc.hasNext()) {
            str1 = sc.nextLine();
            str2 = sc.nextLine();
            if(str1 == "") return;
            if(str2 == "") return;
            for (int i = 0; i < str1.length(); i++) {
                if (!(str2.contains(str1.charAt(i)+""))) {
                    list.add(str1.charAt(i));
                }
            }
           for(int i = 0;i<list.size();i++){
               System.out.print(list.get(i)+"");
            }
        }
    }
}