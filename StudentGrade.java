import java.util.Scanner;

public class StudentGrade {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int row;
  int column;
  double total = 0;
  
  System.out.println("Welcome to Lagbaja Schools Student Management Application 🏫");
  
  System.out.println("How many students do you have?");
  int numberOfStudents = input.nextInt();
  
  while ( numberOfStudents <= 0 ) {
      System.out.println("Invalid number");
      System.out.println("How many students do you have?");
      numberOfStudents = input.nextInt();
  }
  
  System.out.println("How many subjects do they offer: ");
  int numberOfSubjects = input.nextInt();
  
  while ( numberOfSubjects <= 0 ) {
    System.out.println("Invalid number");
    numberOfSubjects = input.nextInt();
  }
  
  System.out.println("""
  Saving>>>>>>>>>>>>>>>
  Saved successfully  
  """);
  
  int[][] scoreOfStudents = new int [numberOfStudents][numberOfSubjects];
  
  for ( row = 0; row < scoreOfStudents.length; row++) {
    for ( column = 0; column < scoreOfStudents[row].length; column++ ) {
      System.out.println("Entering score for student " + ( row + 1 ));
      System.out.println("Enter score for subject " + ( column + 1 ) + ": ");
      scoreOfStudents[row][column] = input.nextInt();
    }
  }
  
  
  int[] totalScores = new int[numberOfStudents];
  int[] averages = new int[numberOfStudents];
  int[] subjectAverages = new int[numberOfSubjects];
  int totalScore = 0;
  
  for ( row = 0; row < numberOfStudents; row++ ) {
    int studentTotal = 0;
    for ( row = 0; row < numberOfSubjects; row++ ) {
      studentTotal += scoreOfStudents[numberOfStudents][numberOfSubjects];
      System.out.println(studentTotal);
    }
  }
  }
}
