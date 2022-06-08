package Test.PackegeExample;

public class Balance {
    String name;
    double balance;

    public Balance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void show(){
        if (balance<0){
            System.out.println("-->");
            System.out.println(name+";P"+balance);
        }
    }
}
