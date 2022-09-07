struct arr{
    int *a;
    int size;
    int top;
};

struct arr *create(int si){
    struct arr *s=(struct arr*)malloc(sizeof(struct arr));
    s->size=si;
    s->top=-1;
    s->a=(int*)malloc(si * sizeof(int));
    return s;
}

int isEmpty(struct arr *s){
    if(s->top==-1){
        return 1;
    }
    return 0;
}

void push(int data,struct arr *s){
    if(s->top == (s->size)-1){
        printf("\nStack Overflow");
    }
    s->a[++(s->top)]=data;
}

int pop(struct arr *s){
    int ele;
    if(isEmpty(s)){
        printf("\nStack underflow");
    }
    ele=s->a[(s->top)--];
    printf("\n\nTop element is deleted\n");
    return ele;
}

void peek(struct arr *s){
    if(isEmpty(s)){
        printf("\nStack underflow");
    }
    printf("\nThe top element is:%d",s->a[s->top]);
}

void display(struct arr *s){
    int i;
    printf("\nThe elements of array is:");

    for(i=s->top;i>=0;i--){
        printf("%d\t",s->a[i]);
    }
}






