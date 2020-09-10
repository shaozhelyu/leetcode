import java.util.*;

public class MergeInt {
    public MergeInt(){}
    private class IntervalComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] a,int[] b){
            if(a[0]>b[0]){
                return 1;
            }else if(a[0]<b[0]){
                return -1;
            }else{
                return 0;
            }
        }
    }
    public int[][] merge(int[][] intervals) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<int[]> l = new ArrayList<>();
        IntervalComparator ic = new IntervalComparator();
        for(int i=0;i<intervals.length;i++){
            int key = intervals[i][0];
            int value = intervals[i][1];
            if(map.containsKey(key)){
                int k = map.get(key);
                map.replace(key,Math.max(k,value));
            }else{
                map.put(key,value);
            }
        }
        System.out.println(map.size());
        for(int k:map.keySet()){
//            System.out.println();
            int[] e = new int[]{k,map.get(k)};
            l.add(e);
        }
        Collections.sort(l,ic);
        HashMap<Integer,Integer> Nmap = new HashMap<>();
        List<int[]> Nl = new ArrayList<>();
        int[] temp = l.get(0);
        for(int i =1;i<l.size()-1;i++){
            if(temp[1]>=l.get(i)[0]){
                temp = new int[]{temp[0],l.get(i)[1]};
            }else{
                Nl.add(temp);
            }
        }
        int len = Nl.size();
        int[][] out = new int[len][2];
        for(int i=0;i<len;i++){
            out[i] = Nl.get(i);
        }
        return out;
    }
    public int[][] mergee(int[][] intervals){
        Collections.sort(Arrays.asList(intervals),new IntervalComparator());
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval:intervals){
            if(merged.isEmpty()||merged.getLast()[1]<interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
    public static void main(String[] args){
        int[][] a = new int[][]{
                {1,3},{2,6},{8,10},{15,18}
        };
        MergeInt mi = new MergeInt();
        System.out.println(mi.merge(a));
    }
}
