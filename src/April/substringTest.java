package April;

public class substringTest {
    public static void main(String[] args) {
        String str="abcdef12g";
        char[] chars = str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(Character.isDigit(chars[i])){
                System.out.println(chars[i]);
            }

        }
        System.out.println(str.substring(1,str.length()));
    }
}
