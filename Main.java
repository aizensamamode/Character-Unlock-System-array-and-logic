import java.util.Scanner;
import java.util.Random;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    static int showing(){
    System.out.println("SPIN BOX");
    System.out.println("1.) SPIN ");
    System.out.println("1.) STORAGE ");
    int number = scanner.nextInt();
    return number;
    }
    public static void main(String[] args) {
        Random random = new Random();
        
        Submain  listbox [] = {
        new Submain ("COMMON"),
        new Submain("RARE"),
        new Submain("EPIC"),
        new Submain("LEGEND"),
        new Submain("MYTHIC")
        };
        int number = showing();
        System.out.println(number);

        
        
    scanner.close();
    
    }
}