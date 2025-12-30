import java.util.Random;
import java.util.Scanner;

// Class to represent each item in the wheel
class Item {
    String name;
    boolean unlocked;

    Item(String name) {
        this.name = name;
        this.unlocked = false; // initially locked
    }
}

public class gptcode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Create items (you can add more without changing logic)
        Item[] box = {
            new Item("King Van"),
            new Item("Darklord Mark"),
            new Item("Soldiers")
        };

        boolean allUnlocked = false;

        while (!allUnlocked) {
            System.out.println("\n--- SPIN THE WHEEL ---");
            System.out.println("1.) SPIN");
            System.out.println("2.) SHOW UNLOCKED ITEMS");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Pick a random item
                Item youGot;
                do {
                    youGot = box[random.nextInt(box.length)];
                } while (youGot.unlocked); // avoid picking already unlocked item

                youGot.unlocked = true; // unlock the item
                System.out.println("YOU PULLED: " + youGot.name);

            } else if (choice == 2) {
                System.out.println("\n--- ITEM STATUS ---");
                for (Item item : box) {
                    String status = item.unlocked ? "UNLOCKED" : "LOCKED";
                    System.out.println(status + " - " + item.name);
                }
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            // Check if all items are unlocked
            allUnlocked = true;
            for (Item item : box) {
                if (!item.unlocked) {
                    allUnlocked = false;
                    break;
                }
            }

            if (allUnlocked) {
                System.out.println("\n🎉 CONGRATULATIONS! All items unlocked!");
            }
        }

        scanner.close();
    }
}
