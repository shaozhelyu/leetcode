import java.util.HashMap;
public class Twosum {
    public Twosum (){
    }
    public int[] twosum(int[] nums, int target){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }

        }
        throw new IllegalArgumentException("No two sum result");
    }

    public int[] twosum_hash(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if (map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Twosum TS = new Twosum();
        int[] re = TS.twosum_hash(nums,target);
        if (re.length!=0){
            for (int j=0;j<re.length;j++){
                System.out.println(re[j]);
            }
        }
    }
}
