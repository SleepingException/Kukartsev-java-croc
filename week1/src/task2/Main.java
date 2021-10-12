package task2;

public class Main {
    public static void printbytes(double bytes){
        int i = 0;
        String[] formats = {"B", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"};
        while ((int)(bytes/1024) > 0){
            bytes /= 1024;
            i++;
        }
        System.out.println(String.format("%.1f", bytes) + " " + formats[i]);
    }
    public static void main(String[] args) {
        printbytes(Double.parseDouble(args[0]));
    }
}
