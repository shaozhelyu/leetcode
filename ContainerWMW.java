public class ContainerWMW {
    public ContainerWMW(){}
    public int maxArea(int[] height) {
        int con=0,newCon;

        for(int i=0;i<height.length;i++){
            for(int j=0;j<i;j++){
                newCon = Math.min(height[i],height[j])*(i-j);
//                System.out.println(newCon);
                con=Math.max(con,newCon);
            }
        }
        return con;
    }
    public int mArea(int[] height){
        int maxarea = 0,l=0,r=height.length-1;
        while(l<r){
            maxarea = Math.max(maxarea,Math.min(height[l], height[r]) * (r - l));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args){
        int[] h = {1,8,6,2,5,4,8,3,7};
        ContainerWMW w=new ContainerWMW();
        System.out.println(w.maxArea(h));
    }
}
