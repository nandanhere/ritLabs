package javaprograms.lab.problem3;
import java.util.*;
 class Stack {
int[] stack;
int top;
Stack(int size)
{
    this.stack = new int[size];
    top = -1;
}
void push(int element){
    if(top == stack.length - 1)
    {
        System.out.println("Not possible! stack overflow");
    }
    else
    stack[++top] = element; 
}
void pop(){
    if(top == -1)
    {
        System.out.println("Not possible! stack underflow");
    }
    else
    System.out.println("Element popped is " + stack[top--] );

}
void display()
{
    int trail = top;
    String output = "";
    while (trail != -1)
    {
        output += stack[trail--] + " ";
    }
    System.out.println("Contents of stack from top to bottom are " + output);

}

}
public class SI
 {
    public static void main(String args[])
    {
        int input = -1;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the stack size" );
     int size = sc.nextInt();
     Stack s = new Stack(size);
      while(input != 4)
     {
        System.out.println("Enter the choice (1 : push, 2 : pop, 3 : display, 4 : exit )");

         input = sc.nextInt();

         switch (input)
         {
             case 1 : System.out.println("Enter the element to be pushed");
                    s.push(sc.nextInt());
                    break;
             case 2 : s.pop();
                    break;
             case 3 : s.display();
                        break;
             case 4 : break;
             default:         System.out.println("Enter a valid input");


         }
     }
     sc.close();
    }
}
