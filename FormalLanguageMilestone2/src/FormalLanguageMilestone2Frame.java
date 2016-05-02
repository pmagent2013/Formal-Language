import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

public class FormalLanguageMilestone2Frame extends JFrame {

	private JPanel contentPane;
	private static JTextPane textPane;
	public static ArrayList<Integer> statesVisited = new ArrayList<Integer>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormalLanguageMilestone2Frame frame = new FormalLanguageMilestone2Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormalLanguageMilestone2Frame() {
		setTitle("McGindog's Editor");
		contentPane = new JPanel();        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);            

        textPane = new JTextPane();
        textPane.setPreferredSize(new Dimension(500, 250));
        textPane.setBorder(new EmptyBorder(0, 0, 100, 100));
        textPane.setMargin(new Insets(0, 0, 0, 0));

        contentPane.add(textPane);

        getContentPane().add(contentPane);

        pack();
        setVisible(true);   
		
		
        textPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String whatToEvaluate = textPane.getText();
				parse(whatToEvaluate);
			}
		});
	}
	
	public static void parse(String input){
		 DFA dfaObject = new DFA();
	        //check to see if the user input is correct and output the result
		 dfaObject.process(input);
		 statesVisited = dfaObject.getStateList();
		 System.out.println(statesVisited);
		 String charToAdd = "";
		 for(int i = 0; i < statesVisited.size(); i++){
			 Document doc = textPane.getDocument();
			 try {
				charToAdd = doc.getText(doc.getLength() - 1, 1);	
				doc.remove(doc.getLength()-1, 1);
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(statesVisited.get(i) == 1 || statesVisited.get(i) == 2 || statesVisited.get(i) == 3 || statesVisited.get(i) == 4 || statesVisited.get(i) == 5){
				 appendToPane(textPane, charToAdd, Color.BLUE, doc.getLength());
			 }
			 else if(statesVisited.get(i) == 32 || statesVisited.get(i) == 33 || statesVisited.get(i) == 34 || statesVisited.get(i) == 35
					 || statesVisited.get(i) == 36 || statesVisited.get(i) == 37 || statesVisited.get(i) == 38){
				 appendToPane(textPane, charToAdd, Color.GREEN, doc.getLength());
			 }
			 else if(statesVisited.get(i) == 24 || statesVisited.get(i) == 25 || statesVisited.get(i) == 26 || statesVisited.get(i) == 10
					 || statesVisited.get(i) == 11 || statesVisited.get(i) == 12 || statesVisited.get(i) == 13 || statesVisited.get(i) == 9
					 || statesVisited.get(i) == 14 || statesVisited.get(i) == 44 || statesVisited.get(i) == 45 || statesVisited.get(i) == 46
					 || statesVisited.get(i) == 47 || statesVisited.get(i) == 48){
				 appendToPane(textPane, charToAdd, Color.CYAN, doc.getLength());
			 }
			 else if(statesVisited.get(i) == 29 || statesVisited.get(i) == 28 || statesVisited.get(i) == 21 || statesVisited.get(i) == 39){
				 appendToPane(textPane, charToAdd, Color.MAGENTA, doc.getLength());
			 }
			 else if(statesVisited.get(i) == 31 || statesVisited.get(i) == 7 || statesVisited.get(i) == 9 || statesVisited.get(i) == 13
					 || statesVisited.get(i) == 48 || statesVisited.get(i) == 18 || statesVisited.get(i) == 23 || statesVisited.get(i) == 20
					 || statesVisited.get(i) == 42 || statesVisited.get(i) == 15 || statesVisited.get(i) == 30 || statesVisited.get(i) == 8
					 || statesVisited.get(i) == 19 || statesVisited.get(i) == 99 || statesVisited.get(i) == 6 || statesVisited.get(i) == 16 
					 || statesVisited.get(i) == 40 || statesVisited.get(i) == 41 || statesVisited.get(i) == 43 || statesVisited.get(i) == 27
					 || statesVisited.get(i) == 22 || statesVisited.get(i) == 17 || statesVisited.get(i) == 50 || statesVisited.get(i) == 51){
				 appendToPane(textPane, charToAdd, Color.BLACK, doc.getLength());
			 }
			 else{
				 appendToPane(textPane, charToAdd, Color.RED, doc.getLength());
			 }
			 
		 }
	}
	
	private static void appendToPane(JTextPane tp, String msg, Color c, int location)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        //int len = tp.getDocument().getLength();
        tp.setCaretPosition(location);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }

}
