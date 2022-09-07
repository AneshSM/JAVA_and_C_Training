#include <stdio.h>
#include<stdlib.h>
#define max 10 
int a[max][max];

void transpose(int n){
     int i,j,temp,first,last;
    printf("Matrix after 90 degree anti clock wise rotation:\n");
    for(i=0;i<n;i++){
      for(j=i;j<n;j++){
            temp=a[i][j];
            a[i][j]=a[j][i];        
            a[j][i]=temp;
      }
    }
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
}

void rev(int n){
    int i,j,temp,first,last;
    printf("Matrix after reverse:\n");
    for(i=0;i<n;i++){
        first=0;
        last=n-1;
        while(first<last){
           temp=a[i][first];
            a[i][first]=a[i][last];        
            a[i][last]=temp;
            first++;
            last--;
        }
    }
      for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
    transpose(n);
}

int main()
{
    int n,i,j;
    printf("\nEnter the size:\t");
    scanf("%d",&n);
    
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
    printf("\n");
    rev(n);
    return 0;
}









