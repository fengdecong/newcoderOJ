//找出红包里金额出现次数超过一半的金额
public class Gift {
    public int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            if(map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i])+1);
            }else{
                map.put(gifts[i],1);
            }
        }
        for(int i = 0;i < n;i++){
            if(map.get(gifts[i]) > n/2) return gifts[i];
        }
        return 0;
    }
}