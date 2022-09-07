class BagDriver{
    public static void main(String[] args){
    Bag b=new Bag("HP","Black",4,2000);
    System.out.println(b.bagbrand+" "+b.color+" "+b.numOfcompartments+" "+b.price);
    book bo=new book();
    bo.addBook("BOB","bob");
    }
}

class Bag{
    String bagbrand,color;
    int numOfcompartments,price;
    
    Bag(){}
    Bag(String bagbrand,String color,int numOfcompartments,int price){
        this.bagbrand=bagbrand;
        this.color=color;
        this.numOfcompartments=numOfcompartments;
        this.price=price;
    }
    
}

class book{
    private String title,author;
    private int price;

    book(){}
    book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public String addBook(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    System.out.println(this.title+" "+this.author+" "+this.price+" ");
    }

}