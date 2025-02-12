public class stringRev{
    public static void main(String args[]){
        String s="customer";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
           
            System.out.print(s.charAt(i));
        }
        
    }
}