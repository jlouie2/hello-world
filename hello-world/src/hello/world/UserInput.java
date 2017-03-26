/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author Jocelyn
 */
import java.util.Scanner;
public class UserInput {

    public static string getUserInput() {
        Scanner kybd = new Scaner(System.in);
        System.out.print("Type in a string: ");
        String in = kybd.nextLine();

        return in;
    }
}
