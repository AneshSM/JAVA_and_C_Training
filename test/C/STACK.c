#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
//#include<D:\Documents\Training\test\ARRstack.h>
#include<D:\Documents\Training\test\SLLstack.h>



int main(){
    
    // struct arr *st=create(5);
    // push(10,st);
    // push(20,st);
    // push(30,st);
    // display(st);
    // peek(st);
    // pop(st);
    // peek(st);
    // display(st);

    printf("\n\n\nho\n\n\n");

    SLLpush(10);
    SLLpush(20);
    SLLpush(30);
    SLLdisplay();
    SLLpeek();
    SLLpop();
    SLLpeek();
    SLLdisplay();
    return INT_MIN;
}