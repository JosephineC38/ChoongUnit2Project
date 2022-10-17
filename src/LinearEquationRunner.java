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
        int y1 = Integer.parseInt(coord1.substring(coord1Check + 1, coord1Length));
        System.out.println(x1);
        System.out.println(y1);

        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.next();
        scan.nextLine();
        int coord2Check = coord2.indexOf(",");
        int coord2Length = coord2.length() - 1;
        int x2 = Integer.parseInt(coord2.substring(1, coord2Check));
        int y2 = Integer.parseInt(coord2.substring(coord2Check + 1, coord2Length));
        System.out.println(x2);
        System.out.println(y2);
    }
}
