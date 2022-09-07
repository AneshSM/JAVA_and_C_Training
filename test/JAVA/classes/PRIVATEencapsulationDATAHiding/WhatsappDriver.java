class WhatsappDriver{
    public static void main(String[] args) {
    Whatsapp w= new Whatsapp("ABC",12345543,"XYZ");    
    System.out.println(w.getdata());
    w.setUsername("eeeeee");
    System.out.println(w.getdata());
    w.setContact(54321);
    System.out.println(w.getdata());
    }
}

class Whatsapp{
    private String username;
    private long cno;
    private String status;

    Whatsapp(){}
    Whatsapp(String username,long cno,String status){
        this.username=username;
        this.cno=cno;
        this.status=status;
    }
    public String getUsername() {
        return username;
    }
    public String getdata() {
        return username+" "+cno+" "+status;
    }
    public void setUsername(String status){
        //this.username=username;
        // this.cno=cno;
        this.status=status;
    }
    public void setContact(long cno){
        //this.username=username;
        this.cno=cno;
        //this.status=status;
    }
}