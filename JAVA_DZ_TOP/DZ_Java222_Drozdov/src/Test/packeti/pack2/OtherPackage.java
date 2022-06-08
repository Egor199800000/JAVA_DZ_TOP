package Test.packeti.pack2;
import Test.packeti.pack1.Protection;

//Класс не наследуется от Protection и находитсся в другом пакете
public class OtherPackage {
    public OtherPackage() {
        Protection protection=new Protection();
        System.out.println("Constructor of basic class");
//        System.out.println("n = "+n);
//        System.out.println(" privVar = "+ privVar);
//        System.out.println("protVar  = "+ protVar);
//        System.out.println("pubVar  = "+ pubVar);

    }
}
