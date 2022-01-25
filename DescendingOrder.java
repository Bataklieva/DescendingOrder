import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String collect = Arrays.stream(String.valueOf(num).split("")).sorted().collect(Collectors.joining());

        String highest = "";

        for (int i = collect.length() - 1; i >= 0 ; i--) {

            highest += collect.charAt(i);
        }

        System.out.println(highest);
    }
}
