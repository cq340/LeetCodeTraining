package June;

public class FinalTest {
    final String str;

    private static String str2;

    public FinalTest(){
        str="asd";
        str2=str;
    }

    public static void main(String[] args) {
        System.out.println(str2);
    }
}
