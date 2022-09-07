class Solution{
    public static void main(String[] args){
        int a[]={343,54,434,433};
        int b=45;
        int c=0;
        try{
            //System.out.println(b/c);
            //System.out.println(a[5]);
        }
        catch(NullPointerException e){
            System.out.println("nul pointer");
        }
        catch(ArithmeticException f){
            System.out.println(f);
        }
        catch(ClassCastException g){
            System.out.println("Clsaa cast");
        }
        catch(ArrayIndexOutOfBoundsException h){
            System.out.println(h);
        }
        catch(Exception k){
            System.out.println("array");
        }
        finally{
            System.out.println("hi");
        }
    }
}