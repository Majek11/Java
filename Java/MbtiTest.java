import java.util.Scanner;

public class MbtiTest {
    public static void main(String[] args) {
        Scanner answerCollector = new Scanner(System.in);
        
        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.print("Please enter your name: ");
        String userName = answerCollector.nextLine();
        
        String[] answers = new String[20];
        String[] questions = {
            "1. When you go somewhere for the day, do you:\nA) Plan what you'll do and when\nB) Just go",
            "2. If you were a teacher, would you rather teach:\nA) Facts-based courses\nB) Courses involving opinion or theory",
            "3. Are you usually:\nA) A \"good mixer\" with groups of people\nB) Rather quiet and reserved",
            "4. Do you more often let:\nA) Your heart rule your head\nB) Your head rule your heart",
            "5. In doing something that many other people do, would you rather:\nA) Do it in the accepted way\nB) Invent a way of your own",
            "6. Among your friends are you:\nA) Full of news about everybody\nB) One of the last to hear what is going on",
            "7. Does new and non-routine interaction with others:\nA) Stimulate and energize you\nB) Tax your reserves",
            "8. Do you prefer to:\nA) Arrange dates, parties, etc., well in advance\nB) Be free to do whatever looks like fun when the time comes",
            "9. Are you more successful:\nA) At dealing with the unexpected\nB) At following a carefully worked out plan",
            "10. Are you more:\nA) Practical\nB) Imaginative",
            "11. In a large group, do you more often:\nA) Introduce others\nB) Get introduced",
            "12. Do you usually:\nA) Value emotion more than logic\nB) Value logic more than feelings",
            "13. Would you rather be considered:\nA) A practical person\nB) An ingenious person",
            "14. Do you:\nA) Speak easily to almost anyone for as long as you have to\nB) Find a lot to say only to certain people or under certain conditions",
            "15. Do you prefer:\nA) Many friends with brief contact\nB) A few friends with longer contact",
            "16. Do you usually:\nA) Make decisions after consulting with others\nB) Make decisions on your own",
            "17. Are you more comfortable:\nA) After a decision\nB) Before a decision",
            "18. When meeting new people, do you:\nA) Engage in open conversation\nB) Wait for them to make the first move",
            "19. Are you more:\nA) Factual\nB) Conceptual",
            "20. Do you prefer:\nA) Scheduled events\nB) Unplanned activities"
        };
        

          System.out.println("\nHello " + userName + "! Please answer each question with 'A' or 'B'");
        
        
        for (int i = 0; i < questions.length; i++) {
            String answer;
            do {
                System.out.println("\n" + questions[i]);
                System.out.print("Your answer (A/B): ");
                answer = answerCollector.nextLine();
                
                if (!answer.equals("A") && !answer.equals("B")) {
                    System.out.println("Please enter only A or B!");
                }
            } while (!answer.equals("A") && !answer.equals("B"));
            
            answers[i] = answer;
        }
        
      int extrovertScore = 0, introvertScore = 0;
      int sensingScore = 0, intuitionScore = 0;
      int thinkingScore = 0, feelingScore = 0;
      int judgingScore = 0, perceivingScore = 0;
        
        for (int questionIndex = 0; questionIndex < answers.length; questionIndex++) {
            switch (questionIndex % 5) {
                case 0: 
                    if (answers[questionIndex].equals("A")) extrovertScore++; 
                    else introvertScore++; 
                    break;
                case 1: 
                    if (answers[questionIndex].equals("A")) sensingScore++; 
                    else intuitionScore++; 
                    break;
                case 2: 
                    if (answers[questionIndex].equals("A")) feelingScore++; 
                    else thinkingScore++; 
                    break;
                case 3: 
                    if (answers[questionIndex].equals("A")) judgingScore++; 
                    else perceivingScore++; 
                    break;
                }
            }
           
        
        String personalityType = "";
        personalityType += (extrovertScore > introvertScore) ? "E" : "I";
        personalityType += (sensingScore > intuitionScore) ? "S" : "N";
        personalityType += (thinkingScore > feelingScore) ? "T" : "F";
        personalityType += (judgingScore > perceivingScore) ? "J" : "P";
        
        String personalityDescription = "";
        if (personalityType.equals("ISTJ")) {
            personalityDescription = "The Inspector: Practical, fact-minded, reliable. They value loyalty and traditions.";
        }
        
        System.out.println("\nYour answers:");
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + answers[i]);
        }
        
        System.out.println( userName + "\nYour personality type is: " + personalityType);
        System.out.println("\nThank you " + userName + " for taking the MBTI test!");
        
    }
}
