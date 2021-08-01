import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
public class cho {
    public static int dp(int sn,int mag,int[] mg,int[] red,int[] dam,int[] used){
        int k =0;
        for(int i=0;i<sn;i++){
            if(used[i]<red[i]&&mag-mg[i]>=0){
                int[] nu = new int[sn];
                for(int j=0;j<used.length;j++){
                    nu[j]=used[j];
                }
                nu[i] = nu[i]+1;
                k = Math.max(k,dam[i]+dp(sn,mag-mg[i],mg,red,dam,nu));
            }
        }
        return k;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(6%5);
        int skillNum = in.nextInt();
        int magic = in.nextInt();
        int t = in.nextInt();
        int[] dam = new int[skillNum];
        int[] used = new int[skillNum];
        int[] mg = new int[skillNum];
        int[] red = new int[skillNum];
        for (int i=0;i<skillNum;i++) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            dam[i] = in.nextInt();
            mg[i] = in.nextInt();
            int k = in.nextInt();
            if(t%k>0) {
                red[i] = t / k + 1;
            }else{
                red[i] = t/k;
            }
//            red[i] = t/in.nextInt();
            System.out.println("k");
            used[i]=0;
        }
        System.out.println("start");
        int out = dp(skillNum,magic,mg,red,dam,used);
        System.out.println(out);
    }

}
