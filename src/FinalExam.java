
public class FinalExam extends GradedActivity{
	//extends means inheritance 
	//this means that FinalExam comes w/all the benefits of GradedActivity 
	
	//MEMBER VARIABLES 
	private int numQuestions; 
	private double pointsEach; 
	private int numMissed; 
	
	//MEMBER FUNCTIONS 
	//constructor --> same name as class 
	public FinalExam(int q, int m) {
		//calls superclass constructor (in this case, GradedActivity) 
		//forced call to superclass constructor (must be first!): 
		//super(_____) 
		
		setNumQuestionsAndPoints(q); 
		setNumMissed(m); 
		setScore(((double)numQuestions - numMissed)/numQuestions *100 ); //gets setscore from graded activity 
		//sending it new # 
	}

	public void setNumQuestionsAndPoints(int q) { 
		if (q> 0) { 
			numQuestions = q; 
		} else { 
			numQuestions = 75; 
			System.out.println(" Defaulting to 75 questions ");
		}
		pointsEach = 100/numQuestions; 
	}

	public void setNumMissed(int m) { 
		if (m <= numQuestions && m >= 0) { 
			numMissed = m; 
		} else { 
			numMissed = 0; 
			System.out.println(" Defaulting to 0 missed ");
		}
	}
	 public double getPointsEach() { 
		 return numMissed; 
	 }
	 
	 public int getNumQuestions() { 
		 return numQuestions; 
	 }

}
