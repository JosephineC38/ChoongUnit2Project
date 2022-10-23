import java.util.Scanner;
public class LinearEqautionRunner {
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

        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.next();
        scan.nextLine();
        int coord2Check = coord2.indexOf(",");
        int coord2Length = coord2.length() - 1;
        int x2 = Integer.parseInt(coord2.substring(1, coord2Check));
        int y2 = Integer.parseInt(coord2.substring(coord2Check + 1, coord2Length));
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0); //I found how to finish the program early because I don't want to write everything else in an if statement.
        }
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation.lineInfo());

        System.out.print("Enter a value for x: ");
        Double xValue = scan.nextDouble();

    }
}

