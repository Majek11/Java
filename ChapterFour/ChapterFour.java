4.1 
a) All programs can be written in terms of three types of control structures: Sequence Controlled Structure, The Selection Controlled Structure and The Iteration Controlled Structure
b) The if...else double selection statement is used to execute an action when a condition is true and another when the condition is false.
c) Repeating a set of instructions a specific number of times is called 
d) When it’s not known in advance how many times a set of statements will be repeated, a(n) Sentinel value can be used to terminate the iteration.
e) The sequence structure is built into Java; by default, statements execute in the order they appear.
f) Instance variables of types char, byte, short, int, long, float and double are all given the value zero by default.
g) If the increment operator is prefixed to a variable, first the variable is incremented by 1, then its new value is used in the expression.
h) When the declaration int y = 5; is followed by the assignment y += 3.3; the value of y is 8.

4.2 
a) True
b) False. A set of statements contained within a pair of braces ({ and }) is called a block.
c) False. An iteration statement specifies that an action is to be repeated while some condition remains true.
d) True
e) True
f) False. The primitive types (boolean, char, byte, short, int, long, float and double) are portable across all computer platforms that support Java.
g) True
h) False. The unary cast operator (double) creates a temporary floating-point copy of its operand.
i) False. Instance variables of type boolean are given the value false by default.
j) True

4.3 Write four different Java statements that each add 1 to integer variable x.
x = x + 1;
x += 1;
++x;
x++;

4.4 
a) Use one statement to assign the sum of x and y to z, then increment x by 1.
z = x++ + y;

b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
if ( count > 10 ) {
  System.out.println("Count is greater than 10")
}

c) Use one statement to decrement the variable x by 1, then subtract it from variable total and store the result in variable total.
total-= --x;

d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write this statement in two different ways.
q %= divisor;
q = q % divisor;

4.5 Write a Java statement to accomplish each of the following tasks
a) Declare variable sum of type int and initialize it to 0.
int sum = 0; 

b) Declare variable x of type int and initialize it to 1.
int x = 1;

c) Add variable x to variable sum, and assign the result to variable sum.
sum += x;

d) Print "The sum is: ", followed by the value of variable sum.
System.out.printf("The sum is: %d%n", sum);

4.8
a) Error: The closing right brace of the while statement’s body is missing.
Correction: Add a closing right brace after the statement ++c;.
b) Error: The semicolon after else results in a logic error. The second output statement will always be executed.
Correction: Remove the semicolon after else.

4.9
The value of the variable z is never changed in the while statement. Therefore, if the loop-continuation condition (z >= 0) is true, an infinite loop is created. To prevent an infinite loop from occurring, z must be decremented so that it eventually becomes less than 0.

4.10 Compare and contrast the if single-selection statement and the while iteration statement.
Similarity:
1. Both are control statements.
2. Both execute a block of code based on a condition.
3. If the condition evaluates to true, the code block is executed.

Difference:
1. The if statement executes its code block only once if the condition is true. It is used for decision-making.
2. The while statement executes its code block repeatedly as long as the condition is true. It is used for iteration.

4.11 Explain what happens when a Java program attempts to divide one integer by another.
When dividing one integer by another, Java performs integer division, where the fractional part (remainder) is truncated (discarded). For example, 7 / 3 evaluates to 2.
To retain the fractional part, you can convert one or both operands to a double or float before division.

4.12 Describe the two ways in which control statements can be combined.
1. Sequential Execution: Control statements are placed one after the other, and they execute in sequence.
Example:
if (x > 0) {
    System.out.println("Positive");
}
while (x > 0) {
    x--;
}
2. Nesting: One control statement is placed inside another.
Example:
while (x > 0) {
    if (x % 2 == 0) {
        System.out.println("Even");
    }
    x--;
}


Here are the detailed responses to each of the questions:

4.10 Compare and contrast the if single-selection statement and the while iteration statement.
Similarity:

Both are control statements.
Both execute a block of code based on a condition.
If the condition evaluates to true, the code block is executed.
Difference:

The if statement executes its code block only once if the condition is true. It is used for decision-making.
The while statement executes its code block repeatedly as long as the condition is true. It is used for iteration.
4.11 Explain what happens when a Java program attempts to divide one integer by another.
When dividing one integer by another, Java performs integer division, where the fractional part (remainder) is truncated (discarded). For example, 7 / 3 evaluates to 2.
To retain the fractional part, you can convert one or both operands to a double or float before division. For example:
java
Copy code
double result = 7 / 3.0; // result = 2.333...
4.12 Describe the two ways in which control statements can be combined.
Sequential Execution:

Control statements are placed one after the other, and they execute in sequence.
Example:
java
Copy code
if (x > 0) {
    System.out.println("Positive");
}
while (x > 0) {
    x--;
}
Nesting:

One control statement is placed inside another.
Example:
java
Copy code
while (x > 0) {
    if (x % 2 == 0) {
        System.out.println("Even");
    }
    x--;
}

4.13 Appropriate types of repetition: Input Until User Indicates No More Input:

1. Use a while or do-while loop, as the number of repetitions is unknown and depends on user input.
Example:
Scanner scanner = new Scanner(System.in);
String input;
do {
    System.out.println("Enter data (type 'exit' to stop):");
    input = scanner.nextLine();
} while (!input.equalsIgnoreCase("exit"));

2. Calculating Factorial of 5: Use a for loop, as the number of repetitions (5) is known.
Example:
int factorial = 1;
for (int i = 1; i <= 5; i++) {
    factorial *= i;
}
System.out.println("Factorial of 5 is: " + factorial);


Here are the detailed responses to each of the questions:

4.10 Compare and contrast the if single-selection statement and the while iteration statement.
Similarity:

Both are control statements.
Both execute a block of code based on a condition.
If the condition evaluates to true, the code block is executed.
Difference:

The if statement executes its code block only once if the condition is true. It is used for decision-making.
The while statement executes its code block repeatedly as long as the condition is true. It is used for iteration.
4.11 Explain what happens when a Java program attempts to divide one integer by another.
When dividing one integer by another, Java performs integer division, where the fractional part (remainder) is truncated (discarded). For example, 7 / 3 evaluates to 2.
To retain the fractional part, you can convert one or both operands to a double or float before division. For example:
java
Copy code
double result = 7 / 3.0; // result = 2.333...
4.12 Describe the two ways in which control statements can be combined.
Sequential Execution:

Control statements are placed one after the other, and they execute in sequence.
Example:
java
Copy code
if (x > 0) {
    System.out.println("Positive");
}
while (x > 0) {
    x--;
}
Nesting:

One control statement is placed inside another.
Example:
java
Copy code
while (x > 0) {
    if (x % 2 == 0) {
        System.out.println("Even");
    }
    x--;
}
4.13 Appropriate types of repetition:
Input Until User Indicates No More Input:

Use a while or do-while loop, as the number of repetitions is unknown and depends on user input.
Example:
java
Copy code
Scanner scanner = new Scanner(System.in);
String input;
do {
    System.out.println("Enter data (type 'exit' to stop):");
    input = scanner.nextLine();
} while (!input.equalsIgnoreCase("exit"));
Calculating Factorial of 5:

Use a for loop, as the number of repetitions (5) is known.
Example:
java
Copy code
int factorial = 1;
for (int i = 1; i <= 5; i++) {
    factorial *= i;
}
System.out.println("Factorial of 5 is: " + factorial);

4.14 What is the value of x after x = y++ and x = ++y if x = 7 and y = 3?
x = y++: Post-increment means the value of y is assigned to x first, then y is incremented.
x = 3 and y = 4.
x = ++y: Pre-increment means y is incremented first, then assigned to x.

4.15 Identify and correct the errors:
a) if (age >= 65) // Remove semicolon after the if condition
    System.out.println("Age is greater than or equal to 65");
else // Fix mismatched quotation mark in the else block
    System.out.println("Age is less than 65");

b) int x = 1, total = 0; // Replace == with = for variable initialization
while (x <= 10) {
    total += x; // Use += operator to add x to total
    x++; // Increment x
    System.out.println(x);
}

c) while (x <= 100) { // Add braces to define the loop body
    total += x;
    ++x;
}

d) while (y != 0) { // Fix the equality operator (=! should be !=)
    System.out.println(y);
}

4.16 Output: 

Y is: 0 and total is 0
Y is: 1 and total is 1
Y is: 2 and total is 3
Y is: 3 and total is 6
Y is: 4 and total is 10
Y is: 5 and total is 15
Y is: 6 and total is 21
Y is: 7 and total is 28
Y is: 8 and total is 36
Y is: 9 and total is 45
Y is: 10 and total is 55
Y is: 11 and total is 66
Y is: 12 and total is 78



