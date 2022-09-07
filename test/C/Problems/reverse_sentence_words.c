#include<stdio.h>
#include<string.h>
#define max 100

 void print(char str[max]){
     int i,end;
     for(i=0;str[i]!='\0';i++){
    }
    end=i-1;
    printf("\n%c",str[0]);
    for(i=end-1;i>0;i--){
            printf("%c",str[i]);
    }
        printf("%c",str[end]);
 }

void main(){
    char str[max],j,word[max],i;
    printf("Enter a statement:\n");
    //gets(str);
    scanf("%[^\n]s",str);
    //printf("%s\n",str);
    for(i=0;str[i]!='\0';i=j){
          for(j=i;str[j]!=' ';j++){
            word[j]=str[i];
        }
        print(word);
    }
    
    // for(i=0;str[i]!='\0';i++){
    //     for(j=i;str[j]!=' ';j++){
    //         word[j]=str[i];
    //     }
    // }
    // end=j-1;
    // printf("\n%c",word[0]);
    // for(i=end-1;i>0;i--){
    //         printf("%c",word[i]);
    // }
    // printf("%c",word[end]);
}






