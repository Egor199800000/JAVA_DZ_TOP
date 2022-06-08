package Test.packeti.pack1;

public class Derived extends Protection{
    public Derived() {
        System.out.println("Constructor of basic class");
        System.out.println("n = "+n);
//        System.out.println(" privVar = "+ privVar); нет доступа к приватной переменной
        System.out.println("protVar  = "+ protVar);
        System.out.println("pubVar  = "+ pubVar);

    }
}
