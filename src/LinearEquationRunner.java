import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.next();
        scan.nextLine();
        int coord1Check = coord1.indexOf(",");
        int coord1Length = coord1.length() - 1;
        int x1 = Integer.parseInt(coord1.substring(1, coord1Check));
        int x2 = Integer.parseInt(coord1.substring(coord1Check + 1, coord1Length));
        System.out.println(x1);
        System.out.println(x2);
    }
}
