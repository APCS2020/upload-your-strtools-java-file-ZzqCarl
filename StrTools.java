public class StrTools {
    public static boolean isPali(String str) {
        String half = str.substring(0, str.length() / 2);
        String Secondhalf = "";

        if (str.length() % 2 == 0) {
            Secondhalf = str.substring(str.length() / 2);
        } else {
            Secondhalf = str.substring(str.length() / 2 + 1);
        }
        return reverse(Secondhalf).equals(half);
    }

    public static String reverse(String str) {
        String tmp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tmp += str.substring(i, i + 1);
        }
        return tmp;
    }

    public static String changeFirstChar(String str) {
    String remainedStr = str.substring(1);
    String firstChar = str.substring(0, 1);
    return firstChar.toUpperCase() + remainedStr;
    return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String sddperiod(String str) {
        return str + ".";
    }

    public static String replace(String str, String target, String repl) {
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0, firstIndex);
        String secondPart = str.substring(secondIndex);
        return firstPart + repl + secondPart;
    }

    public static String PrintSingleChar(String str) {
        int index = 0;
        String tmp = "";
        while (index < str.length() - 1) {
            tmp += str.substring(0, 1);
            tmp += ",";
            tmp += " ";
        }
        return tmp + str.substring(str.length() - 1) + ".";
    }

    public static String parlidrom(String str) {
        String tmp = "";
        if (str.length() % 2 == 0)
            tmp = str.substring(0, str.length() / 2);
        else
            tmp = str.substring(0, str.length() / 2 + 1);
        return tmp + reverse(tmp);

    }

    public static void main(String[] args) {
    String a = "abcd";
    System.out.println(parlidrom(a));
    }

    public static void main(String[] args) {
        String str = "the dog is so cute";// change the first charactor 't'
        String tmp = replace(str, "dog", "cat");// tmp "The"
        System.out.println(tmp);
    }
}
