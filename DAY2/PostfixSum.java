public class PostfixSum {
    public static void main(String args[]){
        int[] sales={10,20,15,30,25};
        int n=sales.length;
        int[] postfixSum=new int[n];
        postfixSum[n-1]=sales[n-1];
        for(int i=n-2;i>=0;i--){
            postfixSum[i]=postfixSum[i+1]+sales[i];
        }
        System.out.print("postfix[]={");
        for(int i=0;i<postfixSum.length;i++){
            System.out.print(postfixSum[i]);
            if(i<postfixSum.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
