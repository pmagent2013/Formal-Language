import java.awt.Color;
import java.util.ArrayList;

public class DFA {
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
    private static final int q10 = 10;
    private static final int q11 = 11;
    private static final int q12 = 12;
    private static final int q13 = 13;
    private static final int q14 = 14;
    private static final int q15 = 15;
    private static final int q16 = 16;
    private static final int q17 = 17;
    private static final int q18 = 18;
    private static final int q19 = 19;
    private static final int q20 = 20;
    private static final int q21 = 21;
    private static final int q22 = 22;
    private static final int q23 = 23;
    private static final int q24 = 24;
    private static final int q25 = 25;
    private static final int q26 = 26;
    private static final int q27 = 27;
    private static final int q28 = 28;
    private static final int q29 = 29;
    private static final int q30 = 30;
    private static final int q31 = 31;
    private static final int q32 = 32;
    private static final int q33 = 33;
    private static final int q34 = 34;
    private static final int q35 = 35;
    private static final int q36 = 36;
    private static final int q37 = 37;
    private static final int q38 = 38;
    private static final int q39 = 39;
    private static final int q40 = 40;
    private static final int q41 = 41;
    private static final int q42 = 42;
    private static final int q43 = 43;
    private static final int q44 = 44;
    private static final int q45 = 45;
    private static final int q46 = 46;
    private static final int q47 = 47;
    private static final int q48 = 48;
    private static final int qE = 49;
    private static final int q50 = 50;
    private static final int q51 = 51;
    
    public static ArrayList<Integer> statesVisited = new ArrayList<Integer>();

    
    //FormalLanguageMilestone2Frame testFrame = new FormalLanguageMilestone2Frame();

    static private int[][] delta = {
    		{q29, q29, q1,	q29, q29, q29, q29,	q24, q32, qE, qE, qE, qE, qE, qE, qE, qE, qE}, //0
    		{qE,	qE,	qE,	q2,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},		//1										
    		{qE,	qE,	qE,	qE,	q3,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	q4,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	q5,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q6,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q7,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q8,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q21,	q21,	q21,	q21,	q21,	q21,	q21,	q21,	qE,	qE,	q16, qE, qE,	qE,	q9,	qE,	qE,	qE},								
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q10,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q11,	q11,	q11,	q11,	q11,	q11,	q11,	q11,	qE,	qE,	qE,	q11,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{q11,	q11,	q11,	q11,	q11,	q11,	q11,	q11,	qE,	qE,	qE,	q12,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{q11,	q11,	q11,	q11,	q11,	q11,	q11,	q11,	qE,	qE,	qE,	q11,	qE,	qE,	q13,	qE,	qE,	qE},							
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q14,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q15,	qE,	qE,	qE,	qE},												
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},									
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q17,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q20,	qE,	q18,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q19,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q39,	q39,	q39,	q39,	q39,	q39,	q39,	q39,	qE,	qE,	q40,	qE,	qE,	qE,	q44,	qE,	qE,	qE},							
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},									
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q22,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q23,	qE,	qE,	qE,	qE},												
    		{q29, q29, q1, q29, q29, q29, q29, q24, q32 ,qE, qE, qE, qE, qE, qE, qE, qE, qE},													
    		{qE,	q25,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	q26,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q27,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q28,	q28,	q28,	q28,	q28,	q28,	q28,	q28,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},									
    		{q29,	q29,	q1,	qE,	qE,	qE,	qE,	q24,	q32,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q30,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q31,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q19,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q33,},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q34,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q35,	q35,	q35,	q35,	q35, q35,	q35,	q35,	qE,	qE,	qE,	q35,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{q35,	q35,	q35,	q35,	q35,	q35,	q35,	q35,	qE,	qE,	qE,	q36,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{q35,	q35,	q35,	q35,	q35,	q35,	q35,	q35,	qE,	qE,	qE,	q35,	qE,	qE,	qE,	qE,	qE,	q37},								
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q38,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE},									
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	q50,	qE,	qE,	qE,	qE,	qE,	qE},									
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	q41,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q15,	qE,	q42,	qE,	qE},												
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q43,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q39,	q39,	q39,	q39,	q39,	q39,	q39,	q39,	qE,	qE,	q40,	qE,	qE,	qE,	q44,	qE,	qE,	qE},							
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q45,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q46,	q46,	q46,	q46,	q46,	q46,	q46,	q46,	qE,	qE,	qE,	q46,	qE,	qE,	qE,	qE,	qE,	qE},								
    		{q46,	q46,	q46,	q46,	q46,	q46,	q46,	q46,	qE,	qE,	qE,	q47,	qE,	qE,	qE,	qE,	qE,	qE},												
    		{q46,	q46,	q46,	q46,	q46,	q46,	q46,	q46,	qE,	qE,	qE,	q46,	qE,	qE,	q48,	qE,	qE,	qE},							
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	q50,	qE,	qE,	qE,	qE,	qE,	qE}, //48
    		{qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE, qE}, //49
    		{qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	q51,	qE,	qE,	qE,	qE},							//50				
    		{q29,	q29,	q1,	q29,	q29,	q29,	q29,	q24,	q32,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE,	qE}, //51
    };

    //define the initial state
    static int state = q0;
    
    public void process(String in){
        int item = 0;
        state = q0;
        statesVisited.clear();
        for(int i=0; i<in.length(); i++){
            char c = in.charAt(i);
            //[b-z] -p,r,i,n,t,v
            if (c == '\n'){
            	System.out.println("enter");
            	statesVisited.add(99);
            }
            else{
            	if(c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l'
                		|| c == 'm' || c == 'o' || c == 'q' || c == 's' || c == 'u' || c == 'w' || c == 'x'
                		|| c == 'y' || c == 'z'){ 
                    item = 0;
                }
                else if(c == 'a'){
                    item = 1;
                }
                else if(c == 'p'){ 
                    item = 2;
                }
                else if(c == 'r'){ 
                    item = 3;
                }
                else if(c == 'i'){ 
                    item = 4;
                }
                else if(c == 'n'){ 
                    item = 5;
                }
                else if(c == 't'){ 
                    item = 6;
                }
                else if(c == 'v'){ 
                    item = 7;
                }
                else if(c == '*'){ 
                    item = 8;
                }
                else if(c == '/'){ 
                    item = 9;
                }
                else if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9'){ 
                    item = 10;
                }
                else if(c == ' '){ 
                    item = 11;
                }
                else if(c == '('){ 
                    item = 12;
                }
                else if(c == ')'){ 
                    item = 13;
                }
                else if(c == '"'){ 
                    item = 14;
                }
                else if(c == '+'){ 
                    item = 15;
                }
                else if(c == '='){ 
                    item = 16;
                }
                else if(c == '-'){ 
                    item = 17;
                }
                System.out.println("item is" + item);
                //System.out.println(state + "" + item);
                //move through the dfa going from state to state based on the user input
                try{
                    state = delta[state][item];
                    statesVisited.add(state);
                    //System.out.println(statesVisited);
                }catch(ArrayIndexOutOfBoundsException ex){
                    state = delta[state][item]; //possible solution
                    statesVisited.add(state);
                }
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
    /*
    public void setColor(int state){
    	if(state == 1){
    		testFrame.getFrame().setForeground(Color.GREEN);
    		System.out.println(testFrame.getForeground());
    	}
    	else if(state == 2){
    		testFrame.getFrame().setForeground(Color.BLUE);
    		testFrame.setForeground(Color.BLUE);
    		System.out.println(testFrame.getForeground());
    	}
    }
    */

    public static boolean isCorrect(){
    	System.out.println(state);
    	if(state == q28 || state == q38 || state == q20 || state == q23 || state == q15 || state == q39 || state == q40 || state == q48 || state == q51){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    public ArrayList<Integer> getStateList(){
    	return statesVisited;
    }


}
