/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

void calc(int a[],int i){
    int c=0,v=0;
    for(i=i-1;i>=0;i--){
        if(a[i]==1){
            c++;
              if(v<c){
            v=c;
            }
        }
        else if(a[i]==0){
            if(v<c){
            v=c;
            }
            c=0;
        }
    }
    printf("\n\n %d",v);
}
void binary(int n){
    int i,j,a[10];
    for(i=0;n>0;i++){
        a[i]=n%2;
        n=n/2;
    }
    j=i;
    // printf("%d",a[2]);
    for(i=i-1;i>=0;i--)
    {
        printf("%d",a[i]);
       
    }
    calc(a,j);
}


int main()
{
    int n;
    printf("Enter a number:\t");
    scanf("%d",&n);
    binary(n);
    
    return 0;
}



