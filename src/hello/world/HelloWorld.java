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
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = "";
        while (!input.matches("end")) {
            input = UserInput.getUserInput();
            if(input.matches("HelloWorld")){
                System.out.println("It matches :D");
            }
            else{
                System.out.println("It does not match :(");
            }
        }

    }

}
