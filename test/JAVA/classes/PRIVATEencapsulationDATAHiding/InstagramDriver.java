class InstagramDriver{
    public static void main(String[] args){
        Instagram i=new Instagram("ABC","abc123","abc123@gmail.com",1234567,"Mijar","Hello World!");
        Instagram i1= new Instagram("DEF","def456");
        Instagram i2= new Instagram("ghi789@gmail.com",987654321,"Mangalore");
        Instagram i3=new Instagram("zzzzz");

        System.out.println(i.getdata());
        
    }
}


class Instagram{
    private String username;
    private int cno;
    private String email;
    private String location;
    private String story;
    private String paswd;

    Instagram(){}

    Instagram(String username,String paswd,String email,int cno,String location,String story){
        this.username=username;
        this.paswd=paswd;
        this.story=story;
        this.email=email;
        this.cno=cno;
        this.location=location;
    }
    Instagram(String username,String paswd){
        this.username=username;
        this.paswd=paswd;
    }
    Instagram(String email,int cno,String location){
        this.email=email;
        this.cno=cno;
        this.location=location;
    }
    Instagram(String story){
        this.story=story;
    }

    public String getdata() {
        return username+"\n"+cno+"\n"+location+"\n"+story+"\n"+paswd+"\n";
    }

    public void setusername(String username){
        this.username=username;
    }
    public void setcno(int cno){
        this.cno=cno;
    }
    public void setloction(String location){
        this.location=location;
    }
    public void story(String story){
        this.story=story;
    }
}