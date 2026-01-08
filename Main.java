import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
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
        ArrayList<Submain> submains = new ArrayList<>();
 
        boolean allUnlocked = false;

        Submain  listbox [] = {
        new Submain ("COMMON"),
        new Submain("RARE"),
        new Submain("EPIC"),
        new Submain("LEGEND"),
        new Submain("MYTHIC")
        };
        while (!allUnlocked) {
            
        
        int number = showing();
        //number 1
        if(number == 1){
    
            Submain picker = listbox[random.nextInt(listbox.length)];
            if(picker.locker == false){
            picker.locker = true;
            System.out.println(picker.name +" | "+ picker.locker);
            submains.add(new Submain(picker.name, picker.locker));
            }
            else{
            System.out.println(picker.name +" | "+ picker.locker);
            }
            System.out.println(submains);   
        }
        // number 2
        if(number == 2){
            for(int i= 0; i < listbox.length; i++){
            System.out.println(listbox[i]);
            }
        }
        if (number == 3) {
        allUnlocked = true;
        for(Submain checking : listbox ){
           if (!checking.locker) {
            allUnlocked = false;
            System.out.println(checking);
           }
        }
         
        }
        }
    }

        
    
}
