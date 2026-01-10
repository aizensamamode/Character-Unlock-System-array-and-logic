public class Submain {
    boolean locker;
    String name;
    String checklocking;

    Submain (String name){
        this.name = name;
        this.locker = false;
    }

    String getlocked(){
        return locker ? "unlocked" : "locked";
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



   