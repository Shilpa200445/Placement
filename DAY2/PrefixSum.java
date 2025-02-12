public class PrefixSum {
    public static void main(String args[]){
        int[] sales={10,20,15,30,25};
        int n=sales.length;
        int[] prefixSum=new int[n];
        prefixSum[0]=sales[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+sales[i];
        }
        System.out.print("prefix[]={");
        for(int i=0;i<prefixSum.length;i++){
            System.out.print(prefixSum[i]);
            if(i<prefixSum.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
