public class MSA {
    public MSA (){}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans = 0,aMax,m,n;
        int[] A,B;
        if (n1>n2){
            A = nums2;
            B = nums1;
            aMax = n2;
            m = n2;
            n=n1;
        }else{
            A = nums1;
            B = nums2;
            aMax = n1;
            m = n1;
            n=n2;
        }
        if(m==0){
            if((m+n)%2==0){
                return (B[(m+n)/2]+B[(m+n)/2-1])/2.0;
            }else{
                return B[(m+n+1)/2-1];
            }
        }
        int a1=0,b1=0,aMin = 0;
        while(aMin<=aMax){
            a1 = (aMax+aMin)/2;
            b1 = (n1+n2+1)/2-a1;
            if(a1>aMin && A[a1-1]>B[b1]){
                aMax=a1-1;
            }else if(a1<aMax && A[a1]<B[b1-1]){
                aMin=a1+1;
            }else{
                double maxL = 0,minR = 0;
                if(a1==0){
                    maxL = B[b1-1];
                }else if(b1==0){
                    maxL=A[a1-1];
                }else{
                    maxL = Math.max(A[a1-1],B[b1-1]);
                }
                if(a1 == m){
                    minR = B[b1];
                }else if(b1==n){
                    minR = A[a1];
                }else{
                    minR = Math.min(A[a1],B[b1]);
                }
                if((n1+n2)%2==0){
                    return (maxL+minR)/2;
                }else{
                    return maxL;
                      }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] A = {};
        int[] B ={1};
        MSA m= new MSA();
        double y = m.findMedianSortedArrays(A,B);
        System.out.println(y);
    }
}
// break;
