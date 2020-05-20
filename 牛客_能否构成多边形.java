import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main{
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                 int n = sc.nextInt();
                 int[][] arr = new int[n][2];
                 for(int i = 0;i < n;i++){
                     arr[i][0] = sc.nextInt();
                     arr[i][1] = sc.nextInt();
                 }
                 stickPuzzle(n,arr);
            }
    }
	
	
    public static void stickPuzzle(int n,int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
           if(arr[i][0] == 1){
                   list.add(arr[i][1]); 
           }else{
                   list.remove(new Integer(arr[i][1]));
           }
           if (judgePolygon(list)) {
               System.out.println("Yes");
           } else {
               System.out.println("No");
           }
        }
    }

//判断能否构成多边形
    public static boolean judgePolygon(ArrayList<Integer> list){
        int l = list.size();
            Collections.sort(list);
            int maxNum = list.get(l-1);
            int sum = 0;
            for(int i = 0;i < l-1;i++){
                    sum += list.get(i);
            }
            return sum > maxNum;
    }
}