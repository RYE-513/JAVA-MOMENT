import java.io.IOException;
import java.util.Scanner;

public class TESTSCORE {
	public static void main(String[] args) throws IOException {
		
	try {
		Scanner input = new Scanner(System.in);
		int i, score = 0;
		
		String ques[] = new String[3];
		String choice[] = new String[3];
		
		ques[0] = "HOW MANY COUTRIES ARE PART OF \"USSR\"?";
		choice[0] = "A. 14 B. 9 C. 15 D. 20";
		
		ques[1] = "WHAT PARALLEL THAT SOKOR AND NOKOR DIVIDED";
		choice[1] = "A. 38th PARALLEL B. 9th PARALLEL C. 1st PARALLEL D. NO PARALLEL";
		
		ques[2] = "CAPITAL OF RUSSIA";
		choice[2] = "A. ASTRAKHAN B. VOLVOGRAD C. MOSCOW D. SAKHA";
		
		char answers[] = {'C', 'A', 'C'};
		for(i = 0; i < 3; i++) {
			System.out.println(ques[i]);
			System.out.println(choice[1]);
			System.out.println("ENTER UR ANSWER!");
			
			char option = input.next().charAt(0);
			if(option == answers[1]) {
				score++;
			}
			
		public static void newTEST() {
			Question[] questions = new Question[5];
		    
			public static void main(String args[]) throws IOException {
		    	
				NEW_CONSOLE_TESTEUGENE quiz = new NEW_CONSOLE_TESTEUGENE(); 
		        quiz.createQuestionBank(); 
		        System.out.println("Welcome Potterheads!"); 
		        System.out.println("Let's have some fun!"); 
		        System.out.println(); 
		        quiz.displayQuiz(); 
		    }
		    public void displayQuiz() {
		        Scanner in = new Scanner(System.in); 
		        String choice = ""; 
		        String[] options; 
		        int countCorrectAnswers = 0; 
		        for(int i=0; i<questions.length; i++) {
		            Question q = (Question)questions[i]; 
		            System.out.println(q.getQuesDesc()); 
		            options = q.getOptions();
		            for(int j=0; j<options.length; j++) {
		                 System.out.println(options[j]); 
		            }
		            choice = in.nextLine(); 
		            if(!"".equals(choice) && ("a".compareTo(choice.toLowerCase())>0 || "c".compareTo(choice.toLowerCase())<0)) {  System.out.println("Incorrect Choice. Choose Again!!!");
		            i--;
		        } else {
		            if(!"".equals(choice) && q.getAnswerOption().equalsIgnoreCase(choice)) {
		                System.out.println("Well Done!\n"); 
		                countCorrectAnswers++; 
		            } else {
		                System.out.println("Ooff Wrong Answer! uWu\n"); 
		            }
		        }
		    }
		     System.out.println("You scored: "+ countCorrectAnswers +" out of "+questions.length);
		}
		public void createQuestionBank() {
		    String quesDesc="1. What is the name of Harry Potter's owl?"; 
		    String[] options = new String[3]; 
		    options[0]="a) Hedwig"; 
		    options[1]="b) Snow"; 
		    options[2]="c) Wyvern"; 
		    String answerOption = "a"; 
		    Question q = createQuestion(quesDesc, options, answerOption); 
		    questions[0]=q; 
		    
		    quesDesc="2. What is the name of Harry Potter's father?"; 
		    options = new String[3]; 
		    options[0]="a) John"; 
		    options[1]="b) James"; 
		    options[2]="c) Jimmy"; 
		    answerOption = "b"; 
		    q = createQuestion(quesDesc, options, answerOption); 
		    questions[1]=q; 
		    
		    quesDesc="3. What is the name of Harry Potter's mother?"; 
		    options = new String[3]; 
		    options[0]="a) Lilia"; 
		    options[1]="b) Lisa"; 
		    options[2]="c) Lily"; 
		    answerOption = "c"; 
		    q = createQuestion(quesDesc, options, answerOption); 
		    questions[2]=q; 
		    
		    quesDesc="4. What is the name of Harry Potter's boy bestfriend?";  
		    options = new String[3]; 
		    options[0]="a) Draco"; 
		    options[1]="b) Ron"; 
		    options[2]="c) Fred";
		    
		    answerOption = "b"; 
		    q = createQuestion(quesDesc, options, answerOption); 
		    questions[3]=q; 
		    
		    quesDesc="5. What is the name of Harry Potter's girl bestfriend?"; 
		    options = new String[3]; 
		    options[0]="a) Luna"; 
		    options[1]="b) Hermione"; 
		    options[2]="c) Anna"; 
		    answerOption = "b"; 
		    q = createQuestion(quesDesc, options, answerOption); 
		    questions[4]=q; 
		}
		public Question createQuestion(String quesDesc, String[] options, String answerOption) {  Question q = new Question(); 
		q.setQuesDesc(quesDesc); 
		q.setOptions(options); 
		q.setAnswerOption(answerOption); 
		return q; 
		} 
		} 
		class Question {
		    private String quesDesc; 
		    private String options[]; 
		    private String answerOption;
		    public String getQuesDesc() {
		         return this.quesDesc; 
		    }
		    public void setQuesDesc(String quesDesc) {
		         this.quesDesc=quesDesc; 
		    }
		    public String[] getOptions() {
		         return options; 
		    } 
		    public void setOptions(String[] options) {
		         this.options=options; 
		    }
		    public String getAnswerOption() {
		         return this.answerOption; 
		    }
		    public void setAnswerOption(String answerOption) {
		         this.answerOption=answerOption;
		    }
		}

		}
			
			
			}
			System.out.println("SCORE " +score);
			
	}catch(Exception e)
	{return;};
		
	}	