package Test.packeti.pack1;

public class Protection {
    int n=1;
    private int privVar=3;
    protected int protVar=4;
    public int pubVar=5;

    public Protection(){
        System.out.println("Constructor of basic class");
        System.out.println("n = "+n);
        System.out.println(" privVar = "+ privVar);
        System.out.println("protVar  = "+ protVar);
        System.out.println("pubVar  = "+ pubVar);


    }
}
