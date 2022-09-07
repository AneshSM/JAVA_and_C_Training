#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
void push(struct Node **first, int new_data){
    struct Node *new_node=(struct Node*)malloc(sizeof(struct Node));
    new_node->data=new_data;
    new_node->next=*first;
    *first = new_node;
}  
void printsll(struct Node *ptr){
    while(ptr->next!=NULL){
        printf("%d->",ptr->data);
        ptr=ptr->next;
    }
    printf("NULL");
}
int main(){
    struct Node *header=NULL;
    int n,a;
    printf("\nEnter the num of nodes");
    scanf("%d",&n);
    printf("\nEnter the values");
    while(n){
        scanf("%d",&a);
        push(&header,a);
        n--;
    }
    printsll(header);
    return 0;
}