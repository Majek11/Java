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
