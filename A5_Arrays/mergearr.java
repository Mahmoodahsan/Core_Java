package ROUGH;

public class mergearr {
       public static void main(String args[]) {
        int []nums1={7,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=0,n=0;//g=0,k=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0) {
                m++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=0) {
                n++;
            }
        }
        System.out.println(m+" "+n);
        for(int l=0;l<n+m;l++){
            System.out.println("hello");
        }
            
        }
    }
