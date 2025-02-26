import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Lagbaja Schools Student Management Application 🏫");

        // Ask for the number of students
        int studentCount;
        do {
            System.out.print("Enter the number of students: ");
            studentCount = input.nextInt();
            if (studentCount <= 0) {
                System.out.println("Invalid number! Please enter a valid number of students.");
            }
        } while (studentCount <= 0);

        // Ask for the number of subjects
        int subjectCount;
        do {
            System.out.print("Enter the number of subjects: ");
            subjectCount = input.nextInt();
            if (subjectCount <= 0) {
                System.out.println("Invalid number! Please enter a valid number of subjects.");
            }
        } while (subjectCount <= 0);

        System.out.println("\nSaving >>>>>>>>>>>>>>>");
        System.out.println("Saved successfully!\n");

        // Declare 2D array to store scores
        int[][] studentScores = new int[studentCount][subjectCount];
        int[] totalScores = new int[studentCount];

        // Collect scores for each student
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.println("Entering scores for Student " + (studentIndex + 1));

            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
                int score;
                do {
                    System.out.print("Enter score for Subject " + (subjectIndex + 1) + " (0-100): ");
                    score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Please enter a value between 0 and 100.");
                    }
                } while (score < 0 || score > 100);

                studentScores[studentIndex][subjectIndex] = score;
                totalScores[studentIndex] += score;
            }

            System.out.println("\nSaving >>>>>>>>>>>>>>>");
            System.out.println("Saved successfully!\n");
        }

        // Compute student averages
        double[] studentAverages = new double[studentCount];
          for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
      studentAverages[studentIndex] = (double) totalScores[studentIndex] / subjectCount;
    }

      // Calculate positions (manual sorting)
      int[] studentPositions = new int[studentCount];
          for (int currentStudent = 0; currentStudent < studentCount; currentStudent++) {
      int position = 1;
            for (int otherStudent = 0; otherStudent < studentCount; otherStudent++) {
        if (totalScores[otherStudent] > totalScores[currentStudent]) {
            position++;
        }
    }
    studentPositions[currentStudent] = position;
    }


        // Display Summary Table
        System.out.println("\n==================== CLASS SUMMARY ====================");
        System.out.printf("%-12s", "Student");
          for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
        System.out.printf("%-12s", "Sub " + (subjectIndex + 1));
    }
        System.out.printf("%-12s%-12s%-12s\n", "Total", "Average", "Position");
      System.out.println("=======================================================");

      for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
        System.out.printf("%-12s", "Student " + (studentIndex + 1));
      for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
        System.out.printf("%-12d", studentScores[studentIndex][subjectIndex]);
    }
    System.out.printf("%-12d%-12.2f%-12d\n", totalScores[studentIndex], studentAverages[studentIndex], studentPositions[studentIndex]);
  }

  System.out.println("=======================================================");

    }
}

