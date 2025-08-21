class TarSum{
    static int Sum(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
public class TargetSum {
    public static void main(String[] args) {
        int[] arr={4,2,3,5,4,3};
        int target_sum=7;
       int Answer= TarSum.Sum(arr,target_sum);
        System.out.println(Answer);
    }
}