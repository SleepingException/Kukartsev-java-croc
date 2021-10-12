package task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point c = new Point(scanner.nextDouble(), scanner.nextDouble());
        double p = (a.len(b) + b.len(c) + c.len(a))/2;
        double result = Math.sqrt(p*(p-a.len(b))*(p-b.len(c))*(p-c.len(a)));
        double n = Math.pow(10, 2);
        result *= n;
        result = Math.round(result) / n;
        System.out.println(result);
    }
}
