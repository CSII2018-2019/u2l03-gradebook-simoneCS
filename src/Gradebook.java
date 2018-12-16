/*
 * GradeBook
 */

import javax.swing.JOptionPane;

public class Gradebook {

    public static void main(String[] args) {
       /* //create a GradedActivity object, uses default constructor
        GradedActivity test1 = new GradedActivity();
        
        //get a testscore
        String input = JOptionPane.showInputDialog(null,
                "Enter a numeric test score: ");
        double testScore = Double.parseDouble(input);
        
        //store the score in the grade object
        test1.setScore(testScore);
        
        //print out info
        JOptionPane.showMessageDialog(null, "Test 1: " + test1);
    */
    	
    	//testing FinalExam out 
    	FinalExam math = new FinalExam(50,4);
    	JOptionPane.showMessageDialog(null, " Math Exam: " + math);
    } 
    
}