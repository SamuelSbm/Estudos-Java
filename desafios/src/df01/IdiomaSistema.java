package df01;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print(loc.getDisplayLanguage() + "-br");
    }
}
