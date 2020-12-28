#include<stdio.h>
#include <stdlib.h>
#define size 5
int stack[size];
int top = -1;
int i;
int isEmpty(){
    if (top == -1){
        return 1;
    }
    return 0;
}
int isFull(){
    if (top == size - 1){
        return 1;
    }
    return 0;
}
void push(int num){
    if (isFull() == 1){
        printf("Stack Overflow");
    }
    else{
        stack[++top] = num;
    }
}
void pop(){
    if (isEmpty() == 1){
        printf("Stack Underflow\n");
    }
    else{
        printf("The number %d is popped. \n",stack[top]);
        top--;
    }
}
int peek(){
    if (isEmpty() == 1){
        printf("Stack is empty \n");
        return -1;
    }
    printf("%d",stack[top]);
    return stack[top];
}
void display(){
    if (isEmpty() == 1){
        printf("Stack is empty \n");
    }
    else{
        printf("The Elements are: \n");
        for(i = top; i >= 0; i--){
            printf("%d \n",stack[i]);
        }
    }
}
int main(){
        char s[] = "Please enter a number from 1 - 5\n1:Show the contents of the stack\n2:Push a value Into the stack\n3:Peek the topmost Value of the stack\n4:Pop the top of the stack\n5:Exit\n";
        int choice = 5,i;
     while(choice != -1)
    {
     switch (choice)
     {
         case -1: break;
         case 1 : display();
                  break;
         case 2 : printf("Enter the value\n");
                  scanf("%d",&i);
                  push(i);
                  break;
         case 3 : peek();
                break;
         case 4 :pop();break;
         case 5: break;
         default : printf("Enter a valid input");
         
     }
    printf("%s",s);
    scanf("%d",&choice);

    }
 
    return 0;
}
