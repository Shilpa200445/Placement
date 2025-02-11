import java.util.Scanner;
import java.util.regex.Pattern;

public class IPaddress {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String pattern = "^[0-255]{0,3}+\\.[0-255]{0,3}+\\.[0-255]{0,3}+\\.[0-255]{0,3}$";
        String address="";
        System.out.println("Enter the IPv4 address");
        address = scanner.next();
        System.out.println("Is IP address is valid: "+Pattern.matches(pattern,address));
        scanner.close();
    }
    
}