class AccountDriver{
    public static void main(String[] args){
        Account a=new Account(1234567,"Str321","ABC","qwertyu","mijar");
        System.out.println(a.getdata());

        a.setPassword("123STR");
        System.out.println(a.getdata());

        a.setCity("mangalore");
        System.out.println(a.getdata());

        a.setBranchOfBank("DK");
        System.out.println(a.getdata());
    }
}


class Account{
    private long accNo;
    private String passwd;
    private String name;
    private String city;
    private String branchOfBank;
    Account(){}
    Account(long accNo,String passwd,String name,String city,String branchOfBank){
        this.accNo=accNo;
        this.passwd=passwd;
        this.name=name;
        this.city=city;
        this.branchOfBank=branchOfBank;
    }

    public String getdata(){
        return accNo+"\n"+name+"\n"+city+"\n"+branchOfBank+"\n";
    } 

    public void setPassword(String passwd){
        this.passwd=passwd;
    }

    public void setCity(String city){
        this.city=city;
    }

    public void setBranchOfBank(String bob){
        this.branchOfBank=bob;
    }
    
}