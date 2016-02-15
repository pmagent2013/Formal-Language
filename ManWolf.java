/**
 * Created by mike on 2/14/2016.
 */
public class ManWolf {
    //declare all the states including the error state
    private static final int q0 = 0;
    private static final int q1 = 1;
    private static final int q2 = 2;
    private static final int q3 = 3;
    private static final int q4 = 4;
    private static final int q5 = 5;
    private static final int q6 = 6;
    private static final int q7 = 7;
    private static final int q8 = 8;
    private static final int q9 = 9;
    private static final int qE = 10;

    static private int[][] delta = {
           // g,  w,  c,  n
            {q1, qE, qE, qE}, //q0
            {q0, qE, qE, q2}, //q1
            {qE, q3, q4, q1}, //q2
            {q5, q2, qE, qE}, //q3
            {q6, qE, q2, qE}, //q4
            {q3, qE, q2, qE}, //q5
            {q4, q7, qE, qE}, //q6
            {qE, q6, q5, q8}, //q7
            {q9, qE, qE, q7}, //q8
            {q8, qE, qE, qE}, //q9
            {qE, qE, qE, qE}, //qE aka Error State
    };

    //define the initial state
    static int state = q0;

    //
    public static void process(String in){
        //define the inital item
        int item = 0;
        for(int i=0; i<in.length(); i++){
            char c = in.charAt(i);

            if(c == 'g'){ //goat
                item = 0;
            }
            else if(c == 'w'){ //wolf
                item = 1;
            }
            else if(c == 'c'){ //cabbage
                item = 2;
            }
            else if(c == 'n'){ //nothing
                item = 3;
            }
            //move through the dfa going from state to state based on the user input
            try{
                state = delta[state][item];
            }catch(ArrayIndexOutOfBoundsException ex){
                state = delta[state][item]; //possible solution
                //System.out.println("You fucked up");
            }
        }
        //Return the result of the check
        if(isCorrect()){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Fail!");
        }
    }

    public static boolean isCorrect(){
        return state == q9;
    }

}
