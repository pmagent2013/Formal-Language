import java.util.Scanner;

/**
 * Created by mike on 2/14/2016.
 */
public class driverDFA {

    public static void main(String[] args){
        //instantiate a new scanner in order to read user input
        Scanner in = new Scanner(System.in);
        //prompt the user for input
        System.out.println("Input your solution for the man, goat, wolf, cabbage problem. only type the first character for each item. IE for 'goat' type 'g'");
        //read the user input
        String input = in.nextLine();
        //It's a ManBearPig, Al Gore was right
        ManWolf manWolfObject = new ManWolf();
        //check to see if the user input is correct and output the result
        manWolfObject.process(input);
    }



}
