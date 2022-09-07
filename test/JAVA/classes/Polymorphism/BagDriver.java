class Book{
    private double price;
    Book(){}
    Book(double price){
        this.price=price;
    }
    public double getprice() {
        return this.price;
    }
    public void setprice(double price){
        this.price=price;
    }
}


class HarryPotter extends Book{
    
}

class RomeoJuliet extends Book{

}

class Library{
    Book b;

    public void addBook(Book b){
        if(this.b==null){
            this.b=b;
            System.out.println("\nBook added");
        }
        else{
            if(b instanceof HarryPotter)
                System.out.println("\nHarryPotter's Book is present");
            else    
                System.out.println("\nHarryPotter's Book is present");
        }
    }
    
    public void removeBook(){
        if(this.b==null){
            System.out.println("\nNo books are present in bag");
        }
        else{
            if(b instanceof HarryPotter){
                this.b=null;
                System.out.println("\nHarryPotter's Book is removed");
            }
            else{    
                this.b=null;
                System.out.println("\nHarryPotter's Book is removed");
            }
        }
    }

    public void display(){
        if(this.b==null){
            System.out.println("\nNo books are present in bag");
        }
        else{
            if(b instanceof HarryPotter){
                System.out.println("\nBook:HarryPotter's Book\nAuthor:"++"\nPrice"+b.);
            }
            else{    
                this.b=null;
                System.out.println("\nHarryPotter's Book is removed");
            }
        }
    }
}