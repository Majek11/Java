import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[][] tasks = new String[100][2]; 
        int taskCount = 0;
        
        for (int i = 0; i < 29; i++) System.out.print("=");
        System.out.println();
        System.out.println("SEMICOLON TO-DO LIST MANAGER");
        for (int i = 0; i < 29; i++) System.out.print("=");
        System.out.println();
        System.out.println(" 1. Add a task ");
        System.out.println(" 2. View tasks ");
        System.out.println(" 3. Mark task as complete ");
        System.out.println(" 4. Delete a task ");
        System.out.println(" 5. Exit ");
        
        while (true) {
            System.out.print("Enter your choice: ");
            String option = input.nextLine();
            
            while (!(option.equals("1") || option.equals("2") || option.equals("3") || 
                    option.equals("4") || option.equals("5"))) {
                System.out.println("Choose the right options (1 - 5)");
                System.out.println("");
                System.out.print("Enter your choice: ");
                option = input.nextLine();
            }
            
            if (option.equals("1")) {
                System.out.print("Add a task: ");
                String taskName = input.nextLine();
                
                while (taskName.equals("")) {
                    System.out.println("You have to add a task");
                    System.out.print("Add a task: ");
                    taskName = input.nextLine();
                }
                
                tasks[taskCount][0] = taskName;
                tasks[taskCount][1] = "[]";
                taskCount++;
                
                System.out.print(taskName);
                System.out.println(">>>>>>>>>>>>>>>");
                System.out.println("Task added successfully!");
                
            } else if (option.equals("2")) {
                if (taskCount == 0) {
                    System.out.println("No task added yet");
                } else {
                    System.out.println("Tasks");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.print(tasks[i][0]);
                        System.out.print(" ");
                        System.out.println(tasks[i][1]);
                    }
                }
                
            } else if (option.equals("3")) {
                if (taskCount == 0) {
                    System.out.println("No task added yet");
                } else {
                    System.out.println("Tasks");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.print(tasks[i][0]);
                        System.out.print(" ");
                        System.out.println(tasks[i][1]);
                    }
                    
                    System.out.print("Enter the task number to mark as complete: ");
                    String input = input.nextLine();
                    int taskIndex = 0;
                    
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c >= '0' && c <= '9') {
                            taskIndex = taskIndex * 10 + (c - '0');
                        }
                    }
                    taskIndex = taskIndex - 1; 
                    
                    if (taskIndex >= 0 && taskIndex < taskCount) {
                        tasks[taskIndex][1] = "[X]";
                        System.out.print((taskIndex + 1) + ". ");
                        System.out.print(tasks[taskIndex][0]);
                        System.out.print(" ");
                        System.out.println(tasks[taskIndex][1]);
                        System.out.println("Task marked as complete!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                }
                
            } else if (option.equals("4")) {
                if (taskCount == 0) {
                    System.out.println("No task added yet");
                } else {
                    System.out.println("Tasks");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.print((i + 1) + ". ");
                        System.out.print(tasks[i][0]);
                        System.out.print(" ");
                        System.out.println(tasks[i][1]);
                    }
                    
                    System.out.print("Enter the task number to delete: ");
                    String input = input.nextLine();
                    int taskIndex = 0;
                    
                    for (int i = 0; i < input.length(); i++) {
                        char c = input.charAt(i);
                        if (c >= '0' && c <= '9') {
                            taskIndex = taskIndex * 10 + (c - '0');
                        }
                    }
                    taskIndex = taskIndex - 1; 
                    
                    if (taskIndex >= 0 && taskIndex < taskCount) {

                        for (int i = taskIndex; i < taskCount - 1; i++) {
                            tasks[i][0] = tasks[i + 1][0];
                            tasks[i][1] = tasks[i + 1][1];
                        }
                        tasks[taskCount - 1][0] = null;
                        tasks[taskCount - 1][1] = null;
                        taskCount--;
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                }
                
            } else if (option.equals("5")) {
                System.out.println("Exit");
                break;
            }
        }
    }
}
