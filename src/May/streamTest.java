package May;

import java.util.ArrayList;

public class streamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ad11");
        list.add("bb");
        list.add("cc");
        list.add("ac00");
        list.stream().sorted().filter(s->s.startsWith("a")).forEach(System.out::println);
    }

}
