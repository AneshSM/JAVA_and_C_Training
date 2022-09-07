#include<stdio.h>
#include<stdlib.h>


struct node{
    int data;
    struct node *right;
    struct node *left;
};

struct node *create(int n){
    struct node * new=(struct node*)malloc(sizeof(struct node));
    new->data=n;
    new->right=NULL;
    new->left=NULL;
    return new;
}

struct node *insert(struct node *h,int n){
    struct node *new=create(n);
    if(h==NULL){
        h=new;
    }
    else if(h->data>n){
        h->left=insert(h->left,n);
    }
     else if(h->data<n){
        h->right=insert(h->right,n);
    }
    return h;
}

void inorder(struct node *ptr){
    if(ptr==NULL){
        return;
    }
    inorder(ptr->left);
    printf("%d\t",ptr->data);
    inorder(ptr->right);
}

void preorder(struct node *ptr){
    if(ptr==NULL){
        return;
    }
    printf("%d\t",ptr->data);
    preorder(ptr->left);
    preorder(ptr->right);
}

void postorder(struct node *ptr){
    if(ptr==NULL){
        return;
    }
    postorder(ptr->left);
    postorder(ptr->right);
    printf("%d\t",ptr->data);
}


int height(struct node * n){
    int lheight=0,rheight=0,c=0;
    if(n==NULL){
        return 0;
    }
    lheight=height(n->left)+1;
    rheight=height(n->right)+1;
    
    // while(h->left != NULL){
    //     h=h->left;
    //     c++;
    // }
    // lheight=c;
    //  while(h->right != NULL){
    //     h=h->right;
    //     c++;
    // }
    // rheight=c;
    
    if(lheight>rheight)
        return lheight;
    else
        return rheight;
    
}

void main(){
    struct node *h=NULL;
    int n,i,v;
    printf("Enter the no of Nodes in a tree:\t");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&v);
        h=insert(h,v);
    }
    // h=insert(h,10);
    // h=insert(h,5);
    // h=insert(h,2);
    // h=insert(h,40);
    // h=insert(h,23);
    while(1){
    printf("Options:\n1)INorder\n2)PREorder\n3)POSTorder\n4)Exit\n\n OTHER Options:\n5)Height\n6)BT to DLL using inorder\n\nEnter your choice:\t");
    scanf("%d",&i);
    switch(i){
        case 1:    
            inorder(h);
            printf("\n");
            break;
        case 2:
            preorder(h);
            printf("\n");
            break;
        case 3:
            postorder(h);
            printf("\n");
            break;
        case 4:exit(0);
            break;
        case 5:
            v=height(h)-1;
            printf("%d",v);
            printf("\n");
            break;
        case 6:dll;
            break;
        default:printf("Invalid choice\n\n");
    }  }
}   
    




































// struct node{
//     int data;
//     struct node *right;
//     struct node *left;
// }*h,*p;
// struct node *n=NULL;
// struct node * init(int n){
//     struct node *new=(struct node *)malloc(sizeof(struct node));
//     new->data=n;
//     new->right=NULL;
//     new->left=NULL;
//     return new;
// }

// struct node * insert(struct node *p,int n){
//     struct node *new=init(n);
//     if(h==NULL){
//         p=h=new;
//     }
//     else if(p->data<n){
//         p->right=insert(p,n);
//         p=h;
//     }
//     else if(p->data>n){
//         p->left=insert(p,n);
//         p=h;
//     }
// }

// void inorder(struct node *ptr){
//     if(ptr==NULL){
//         return;
//     }
//     inorder(ptr->left);
//     printf("%d\t",ptr->data);
//     inorder(ptr->right);
// }

// void preorder(struct node *ptr){
//     if(ptr==NULL){
//         return;
//     }
//     printf("%d\t",ptr->data);
//     preorder(ptr->left);
//     preorder(ptr->right);
// }

// void postorder(struct node *ptr){
//     if(ptr==NULL){
//         return;
//     }
//     printf("%d\t",ptr->data);
//     postorder(ptr->left);
//     postorder(ptr->right);
// }


// // void printtree(){
    
// // }

// void main(){
//     insert(h,10);
//     insert(h,5);
//     insert(h,2);
//     insert(h,40);
//         insert(h,23);
//     insert(h,403);
//         insert(h,24);
//     insert(h,402);
//     inorder(h);
//      printf("\n");
//     preorder(h);
//     printf("\n");
//     postorder(h);
// }











