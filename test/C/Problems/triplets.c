/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include<stdlib.h>
#define max 10^5

void triplets(int a[max],int n){
    int i,j,m,v,k;
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            for(k=j+1;k<n;k++){
            m=a[i]+a[j]+a[k];
            if(m==n)
            {
                printf("The triplets is :%d\t%d\t%d",a[i],a[j],a[k]);
                exit(0);
            }
            }
        }
    }
}

int main()
{
    int i,j,n,a[max];
    printf("\nEnter the array size:");
    scanf("%d",&n);
    printf("\nEnter %d value:\n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("\nEnter a value to find trtiplets:");
    scanf("%d",&j);
    triplets(a,j);
    return 0;
}


