package Test.packeti.pack1;

public class SamePackage {
    public SamePackage() {
        //В не наследуемом классе от Protection нужно создавать переменную экземпляра этого класса
        Protection protection=new Protection();
        System.out.println("Constructor of basic class");
        System.out.println("n = "+protection.n);
//        System.out.println(" privVar = "+ privVar);
        System.out.println("protVar  = "+ protection.protVar);
        System.out.println("pubVar  = "+ protection.pubVar);

    }
}
