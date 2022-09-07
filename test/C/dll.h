struct DNode{
int data;
struct DNode *llink;
struct Dnode *rlink;
};
struct DNode *create (int d){
        struct DNode *new=(struct DNode*)malloc(sizeof(struct DNode));
		new->data=d;
		new->rlink=NULL;
		new->llink=NULL;
    	return new;
}
  

//push      
void push(struct DNode **href,int data){
    struct DNode *new=create(data);
	// struct DNode *new=(struct DNode*)malloc(sizeof(struct DNode)) ;
	// new->data = data;
	// new->llink = NULL;

	new->rlink =href;
	if((href)!=NULL)
		(href)->llink = new;
	href= new;
}



//append
void append(struct DNode **href,int data){
        //struct DNode *href=hr ,new=create(&data);
	struct DNode *new=(struct DNode*)malloc(sizeof(struct DNode)),*last;
	new->data = data;
	new->rlink = NULL;
	last=*href;
	if(last==NULL){
		new->llink = last;
		(*href)=new;
	}
	while((last->rlink)!=NULL){
		last=(last)->rlink;
	}
	new->llink=last;
	last->rlink=new;
	
}



//traverse and add
struct DNode *traverse(struct DNode *search,int data){
	while(search->data != data){
		search=search->rlink;
	}
	return search;
}

void addafter(struct DNode **href,int finddata,int data){
	int v;
	struct DNode *node=traverse(*href,finddata);	
	if(node==NULL)	
	{
		printf("Destination not found");	
	}	
	struct DNode *new=(struct DNode*)malloc(sizeof(struct DNode)),*y;
	printf("\nChoose\n1.insert after node\n2.insert before node\n::");
	scanf("%d",&v);
	switch(v){
	case 1:	new->data=data;
		y=node->rlink;
		y->llink=new;
		new->rlink=node->rlink;
		node->rlink=new;
		new->llink=node;
		break;
	case 2:	new->data=data;
		node->llink->rlink=new;
		new->rlink=node;
		new->llink=node->llink;
		node->llink=new;
		break;
	default:printf("\n\nivalid choice\n\n");
	}
}

//print
void print(struct DNode *href){
	printf("NULL");
	while(href!=NULL){
		printf("<-%d->",href->data);
		href=href->rlink;
	}
	printf("NULL\n\n\n\n");
	
}