public class Debits {
    public static void main(String args[])
    {
        double money[]={900,1500,600,1200,400,200};
        int count=0;
        int size =money.length;
        int j=1;
        for(int i=0;i<size-1;i++)
        {
                if(money[i]>money[j])
                {
                    count++;
                }
                j++;
        }
        System.out.println(count);
    } 
}