public class Main {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={1,2,7};
        int[] returnarray=Solution.unionArray(nums1,nums2);
        for(int k=0;k<returnarray.length;k++) {
            if (returnarray[k] != 0) {
                System.out.println(returnarray[k]);
            }
        }
    }
}
class Solution {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int l1=nums1.length,l2=nums2.length,j=0,i=0;
        int[] temp=new int[l1+l2];
        for(i=0;i<(l1>l2?l1:l2);i++){
            if(nums1[i]<nums2[j] && i<l1 && j<l2){
                temp[i]=nums1[i];
            }
            else if(nums1[i]==nums2[j]){
                temp[i]=nums2[j++];

            }
            else{
                temp[i]=nums2[j++];
//                j++;
            }
        }
        while(i<l1){
            temp[i+j]=nums1[i++];
        }
        while(j<l2){
            temp[i+j]=nums2[j++];
        }
        return temp;
    }
}