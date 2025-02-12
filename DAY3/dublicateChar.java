public class dublicateChar {
    public static void main(String args[]){

        String s="apple";
        char[] chars = s.toCharArray();
        int length = chars.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            boolean found = false;

            // Check if character already exists in the result
            for (int j = 0; j < index; j++) {
                if (chars[i] == chars[j]) {
                    found = true;
                    break;
                }
            }
            // If not found, add it to the result
            if (!found) {
                chars[index++] = chars[i];
            }
            
        }
         // Convert only the valid part of the array to a string
         String result = new String(chars, 0, index);
         System.out.println(result);



    }
}
        
    
    
