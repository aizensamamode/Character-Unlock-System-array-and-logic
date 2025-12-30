import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main{
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //declaration
       
        String[]  box  = {"king van","darklord mark", "soldiers"};
        boolean[] checklist = {true, true, true};
        String [] unlocked = {"LOCKED", "UNLOCKED"} ;
        int i = 0;
        boolean key = true;
        while (key) {   
        System.out.println("SPIN THE WHEEL");
        System.out.println("1.) SPIN");
        System.out.println("2.) UNLOCKED"); 


        int choice = scanner.nextInt();

        if (choice == 1) {

            String yougot = box [random.nextInt(box.length)];
            if (yougot.equalsIgnoreCase("king van")) {
                checklist [0]= false;
            }
            if (yougot.equalsIgnoreCase("darklord mark")) {
                checklist [1]= false;
            }
            if (yougot.equalsIgnoreCase("soldiers")) {
                checklist [2]= false;
            }
            System.out.println("YOU PULLED: " + yougot);

        }
        if (choice == 2){

            if (checklist[0]) {
                System.out.println(unlocked[0]+" "+box[0]);
            }
            if (!checklist[0]) {
                System.out.println(unlocked[1]+" "+box[0]);
            }
            if (checklist[1]) {
                System.out.println(unlocked[0]+" "+box[1]);
            }
            if (!checklist[1]) {
                System.out.println(unlocked[1]+" "+box[1]);
            }
            if (checklist[2]) {
                System.out.println(unlocked[0]+" "+box[2]);
            }
            if (!checklist[2]) {
                System.out.println(unlocked[1]+" "+box[2]);
            }

        }
        if(!checklist[0]&&!checklist[1]&&!checklist[2]){
          key = false;
        }
    }
    
    }
}