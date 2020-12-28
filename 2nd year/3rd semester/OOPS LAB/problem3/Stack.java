package javaprograms.lab.problem3;

public class Stack {
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
