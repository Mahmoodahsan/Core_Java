public class Main {
    public static void main(String[] args) {
//        int[] nums={8,8,7,6,5};
        int[] nums={10,10,10,10,10};
        System.out.println(SecLarge.large(nums));
    }
}
class SecLarge{
    static int large(int[] nums){
        int l1=0,l2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l1){
                l1=nums[i];
            }

        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]<l1 && nums[j]>l2){
                l2=nums[j];
            }
        }
        if(l2<l1 && l2!=0){
            return l2;
        }
        return -1;
    }
}