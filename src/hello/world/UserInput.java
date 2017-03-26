package hello.world;

import java.util.Scanner;

public class UserInput {

    public static String getUserInput() {
        
        System.out.print("Please enter a string to check: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
