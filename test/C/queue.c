#include<stdio.h>
#include<limits.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
}*front,*rear;


// struct queue{
//     struct queue *front;
//     struct queue *rear;
//     struct queue *size;
//     struct queue *rear=queue->size -1;
//     struct queue *curr;
// };

struct node *create(int data){
    struct node *n=(struct node*)malloc(sizeof(struct node));
    n->data=data;
    n->next=NULL;
    return n;
}
void enQueue(int data){
    struct node *n=create(data);
    if(n==NULL){
        printf("\nQueue is full\n");
    }
    if(front==NULL&&rear==NULL){
        front=n;
        rear=n;
        return;
    }
    rear->next=n;
    rear=rear->next;
}

void deQueue(){
    struct node *ptr;
    if(front==NULL)
        printf("Queue is empty");
    ptr=front;
    front=front->next;
    printf("The DeQueued element:\t%d",ptr->data);
    free(ptr);
}

int main(){
    int m,i,v;
    char *ch;
    printf("Enter the number of elements:");
    scanf("%d",&m);
    for(i=1;i<=m;i++){
        printf("Enter the node %d value:",i);
        scanf("%d",&v);
        enQueue(v);
    }do{
        printf("\nDeQueue?(Y/N):");
        scanf("%s",ch);
        deQueue();
        // if(ch!="Y")
        // {
        //     break;
        // }
    }while(1);
    
    return INT_MIN;
}





