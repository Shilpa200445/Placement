import java.util.Arrays;
class missingNumber {
    public static void main(String args[]){
        int arr[]={1,2,3,5};
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) {
                break;
            }
        }
        System.out.println(i+1);
    }
}
