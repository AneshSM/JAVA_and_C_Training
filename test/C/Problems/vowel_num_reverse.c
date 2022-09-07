#include<stdio.h>


//char a[10]={a,e,i,o,u,A,E,I,O,U};
// void replace(char str[50]){

//  }
  
        //for(j=0;a[j]!='\0';j++){
            //if(a[j]==str[i]){
              //c++;
              //if(c>9){
                 // c=1;
              //}
              //str[i]=c;
            //}
        //}

int main(){
   char str[50],c[10]={'1','2','3','4','5','6','7','8','9','\0'};
   int i,end,j=0;
   //c=1;
   printf("Enter a string\n");
   gets(str);
   //scanf("%s",str);
   //replace(str);
     
    for(i=0;str[i]!='\0';i++){
        if(c[j]!='\0'){
        str[i]= str[i]=='a'?c[j]:str[i]=='e'?c[j]:str[i]=='i'?c[j]:str[i]=='o'?c[j]:str[i]=='u'?c[j]:str[i];
        j++;
        }
        if(c[j]=='\0')
            j=0;
    }
    for(i=0;str[i]!='\0';i++){
    }
    end=i-1;
    for(i=end;i>=0;i--){
            printf("%c",str[i]);
    }
    return 0;
}



