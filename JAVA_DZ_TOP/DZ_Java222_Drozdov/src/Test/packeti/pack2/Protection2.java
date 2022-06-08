package Test.packeti.pack2;
import Test.packeti.pack1.Protection;
public class Protection2 extends Protection {
    public Protection2() {
        System.out.println("Constructor of basic class in other package");
//        System.out.println("n = "+n); -не можем получить дефолтовую переменную
//        System.out.println(" privVar = "+ privVar); Привватную тем более, она доступна только из класса
        System.out.println("protVar  = "+ protVar);
        System.out.println("pubVar  = "+ pubVar);

    }
}
