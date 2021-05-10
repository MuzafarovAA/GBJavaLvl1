package lesson7;

public class StringHomeWork {

    public static void main(String[] args) {
        textToString("I like Java!!!");

    }

    private static void textToString(String str) {
        System.out.println(str);
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replaceAll("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String cut = "Java";
        int strBegins = str.indexOf(cut);
        int strEnds = strBegins + cut.length();
        System.out.println(str.substring(0, strBegins) + str.substring(strEnds, str.length()));

    }
}
