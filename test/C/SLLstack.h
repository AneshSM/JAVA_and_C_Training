//Stack SLL

struct node{
    int data;
    struct node *next;
}*Top;

// struct node *SLLcreate(int data){
   
// }

int SLLisEmpty(){
    if(Top==NULL){
        return 1;
    }
    return 0;
}
void SLLpush( int data){
    // struct node *new=SLLcreate(data);
    struct node *new=(struct node*)malloc(sizeof(struct node));
    // if(new==NULL){
    //     printf("\nstack overflow\n");
    // }
    new->data=data;
    new->next=Top;
    Top=new;
    // return new;
}

int SLLpop(){
    int ele=Top->data;
    if(SLLisEmpty()){
        printf("\nStack is underflowing\n");
    }
    struct node *tmp=Top;
    Top=Top->next;
    free(tmp);
    return ele;
}  
void SLLpeek(){
    printf("\n\nThe Top element is:%d\n\n",Top->data);
}

void SLLdisplay(){
    struct node *ptr=Top;
    printf("The elements:\n");
    while(ptr!=NULL){
        printf("%d->",ptr->data);
        ptr=ptr->next;
    }
    printf("NULL");
}