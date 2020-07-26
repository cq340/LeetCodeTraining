package February;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularMatch {
    public static void main(String[] args) {
        String target = "/ugc/v3/restaurants/E15704804360720475980/ratings/scores?latitude=31.82197952270508&longitude=119.9960708618164";
        Pattern pattern = Pattern.compile("latitude=(\\d+\\.\\d+)&longitude=(\\d+\\.\\d+)");
        Matcher matcher = pattern.matcher(target);
        if (matcher.find()) {
            System.out.println(matcher.group(1)+" "+matcher.group(2));
        }

        Pattern pat = Pattern.compile("latitude=(\\d+\\.\\d+)&longitude=(\\d+)");
        Matcher matchers = pat.matcher(target);
        if(matchers.find()){
            System.out.println(matchers.group(1)+matchers.group(2));
        }
    }
}