import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Path.of("file2.txt"));
        for (String string : strings) {
            System.out.println(solve(string));
        }
    }

    private static double solve(String line) {
        String[] s = line.split(" ");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[2]);
        switch (s[1]) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                if (a == 0 || b == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя");
                } else {
                    return a / b;
                }
            }
            default -> {
                return 0;
            }
        }
        return -1;
    }
}
