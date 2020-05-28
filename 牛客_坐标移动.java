import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            String[] str=input.split(";");
            int x=0,y=0;
            for(int i = 0;i < str.length;i++){
                if(judge(str[i])){
                    if(str[i].charAt(0)=='A'){
                        x=x-Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='D'){
                        x=x+Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='W'){
                        y=y+Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='S'){
                        y=y-Integer.parseInt(str[i].substring(1));
                    }
                }
            }
            System.out.println(x+","+y);
        }
        sc.close();
    }
    public static boolean judge(String s){//判断是否合法有效
        int n = s.length();
        if(n<=3&&n>1){
            if(s.charAt(0)=='A'||s.charAt(0)=='D'||s.charAt(0)=='W'||s.charAt(0)=='S'){
                if(n==2&&Character.isDigit(s.charAt(1)));
                return true;
            }
            else if(n==3&&Character.isDigit(s.charAt(1))&&Character.isDigit(s.charAt(2))){
                return true;
            }
        }
        return false;
    }
}import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String input=sc.nextLine();
            String[] str=input.split(";");
            int x=0,y=0;
            for(int i = 0;i < str.length;i++){
                if(judge(str[i])){
                    if(str[i].charAt(0)=='A'){
                        x=x-Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='D'){
                        x=x+Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='W'){
                        y=y+Integer.parseInt(str[i].substring(1));
                    }
                    else if(str[i].charAt(0)=='S'){
                        y=y-Integer.parseInt(str[i].substring(1));
                    }
                }
            }
            System.out.println(x+","+y);
        }
        sc.close();
    }
    public static boolean judge(String s){//判断是否合法有效
        int n = s.length();
        if(n<=3&&n>1){
            if(s.charAt(0)=='A'||s.charAt(0)=='D'||s.charAt(0)=='W'||s.charAt(0)=='S'){
                if(n==2&&Character.isDigit(s.charAt(1)));
                return true;
            }
            else if(n==3&&Character.isDigit(s.charAt(1))&&Character.isDigit(s.charAt(2))){
                return true;
            }
        }
        return false;
    }
}