import java.util.TreeMap;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int num : array){
            if(true == map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > array.length / 2 ){
                return key;
            }
        }
        return 0;
    }
}