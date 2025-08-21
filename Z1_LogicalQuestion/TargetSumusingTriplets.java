public class TargetSumusingTriplets {
    public static void main(String[] args) {
        //int[] arr={1,4,5,6,3};
        int[] arr={4,3,4,4,4};
        int target=12,ans=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}