#include<stdio.h>
#define MAX 10^5
int blown(int n,int a[]){
    int ele,j,i,c=0;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(a[i]>a[j]){
                ele=a[i];
            }
            else
                ele=a[j];
        }
    }

    for(i=0;i<n;i++){
        if(ele==a[i]){
                c=c+1;
            }
    }
    printf("The number of candles blown is:\t %d",c);
    return 0;
}

int main(){
    int n,i,a[MAX];
    printf("Enter your nieces age:\n");
    scanf("%d",&n);
    printf("Enter %d sizes of candels\n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    blown(n,a);
    return 0;
}