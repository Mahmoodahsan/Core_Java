class Count{
    static int  fun(int[] arr,int count,int key){
        for (int j : arr) {
            System.out.println(j);
            if (j == key) {
                count++;
            }
        }
        return count;
    }
        }
public class CountKeyElement {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,6,3,7,2,2};
        int key=2;
        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]==key){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(Count.fun(arr,count,key));
    }
}