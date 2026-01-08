public class Submain {
    boolean locker;
    String name;

    Submain (String name){
        this.name = name;
        this.locker = false;
    }

    Submain(String name, boolean value){
        this.name = name;
        this.locker = value;
    }
    @Override
public String toString() {
    return "\n"+name + " | Unlocked: " + locker + "";
}

  
}



   