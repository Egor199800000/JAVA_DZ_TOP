package Test;

 public class Banks {
     String name;

     public Banks(String name) {
         this.name=name;
     }
 }
class Clients extends Banks{

    public Clients(String name) {
        super(name);
        System.out.println(name);
    }
}

class ClientsTestDrive {
    public static void main(String[] args) {

        Banks a=new Clients("Igor");
    }
}