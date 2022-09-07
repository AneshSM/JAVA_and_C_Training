class Solution{
    public static void main(String[] args){
        int a[]={64,43,23};
        try{
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handeled");
        }
    }
}