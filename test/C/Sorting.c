#include<stdio.h>
#include<stdlib.h>

void ask(){
    char ch,n;
    do
    {
        printf("Sort methods:\n1)Bubble Sort\n2)Insert Sort\n3)Selection Sort\n4)Quick Sort\n5)Mrerge Sort\n6)Jump Sort\n7)\nEnter the choice\t");
        scanf("%d",&n);
        switch (n)
        {
        case 1:bsort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        case 2:Insort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        case 3:selectsort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        case 4:Quicksort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        case 5:mergesort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        case 6:jsort();
            printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;    
        default:printf("\nInavalid Choice\nDo you want to continue:(Y/N):->");
            scanf(%s,ch);
            break;
        }
    }while(ch=='Y'||ch=='y');
    
}
void main()
{
    ask();
}
