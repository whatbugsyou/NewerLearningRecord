package MD5;
import java.security.MessageDigest;
public class MD5Util {
    private static char[] sHexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String getMD5(String source) {
        try {
            byte[] bytes = source.getBytes();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(bytes);
            char[] chars = new char[32];
            int k = 0;
            for (byte byte0 : md.digest()) {
                int i = k + 1;
                chars[k] = sHexDigits[(byte0 >>> 4) & 15];
                k = i + 1;
                chars[i] = sHexDigits[byte0 & 15];
            }
            return new String(chars);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    public static String getPullMD5() {
//        String token = "AAAAAAAA";
//        if (!TextUtils.isEmpty(AppConfig.getInstance().getToken())) {
//            token = AppConfig.getInstance().getToken();
//        }
//        return getMD5(token + "-" + System.currentTimeMillis());
//    }
}
