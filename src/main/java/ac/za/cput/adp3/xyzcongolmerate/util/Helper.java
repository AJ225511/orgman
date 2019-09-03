package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?> aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        //Returns only the capital letters of the class name, for instance GenderFactory will return as GF
        StringBuilder builder = new StringBuilder();
        for (final char c : className.toCharArray())
            if (Character.isUpperCase(c))
                builder.append(c);
        return builder.toString();
    }
}
