package inc.cwg.persos_nf.utils;

import java.nio.charset.StandardCharsets;

public class Utils {
    public static String getUtf8(String rawString) {
        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);

        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);

        return utf8EncodedString;
    }
}
