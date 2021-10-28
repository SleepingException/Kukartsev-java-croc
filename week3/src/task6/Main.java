package task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String source = "/*\n" +
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n"; // test data
        String noComments = removeJavaComments(source);
        System.out.println(noComments);
    }
    private static String removeJavaComments(String source){
        String regex1 = "/.+[*/]+\n?";
        String regex2 = "//.+\n?\\s+";
        String regex3 = "[/\\*].+\\n";
        source = source.replaceAll(regex1, "");
        source = source.replaceAll(regex2, "");
        source = source.replaceAll(regex3, "");
        return source;
    }
}
