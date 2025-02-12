class nonRepeating{
    public static void main(String args[]){
        String s="customer";
        int n=s.length();
        char result='\0';
        for (int i = 0; i < n-1; i++) {
            boolean found = false;
            for (int j =i+1; j < n; j++) {
                if ( s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
               result=s.charAt(i);
               break;
            }
        }
        if(result=='\0'){
            System.out.println(-1);

           }
           else{
            System.out.println(result);
           }

}
}

