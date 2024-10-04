package WildAnimals
import java.util.Scanner;

public class WildAnimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = "";
        while (!animal.equals("exit")) {
            System.out.println("Enter animal name or 'exit' to stop:");
            animal = sc.nextLine();
            if (!animal.equals("exit")) {
                System.out.println("You added: " + animal);
            }
        }
        sc.close();
    }
}

