import java.util.Scanner;
public class LinearEqautionRunner {
    public static void main(String[] args) {
        //creates Scanner object and welcomes user
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");

        //Asks user to enter coordinate 1 and separates the x and y points into int variables
        System.out.print("Enter coordinate 1: ");
        //For some reason, my entire program breaks if there is a space between coordinate. Fix that future me.
        String coord1Scan = scan.nextLine();

        //Before, if the user inputs "(1, -10)' instead of "(1,-10)", the program doesn't work. This fixes that problem
        if(coord1Scan.indexOf(" ") != -1) {
            coord1Scan = coord1Scan.substring(0,coord1Scan.indexOf(" ")) + coord1Scan.substring(coord1Scan.indexOf(" ") + 1);
        }
        String coord1 = coord1Scan;
        int coord1Check = coord1.indexOf(",");
        int coord1Length = coord1.length() - 1;
        int x1 = Integer.parseInt(coord1.substring(1, coord1Check));
        int y1 = Integer.parseInt(coord1.substring(coord1Check + 1, coord1Length));

        //Asks user to enter coordinate 2 and separates the x and y points into int variables
        System.out.print("Enter coordinate 2: ");
        String coord2Scan = scan.nextLine();

        if(coord2Scan.indexOf(" ") != -1) {
            coord2Scan = coord2Scan.substring(0,coord2Scan.indexOf(" ")) + coord2Scan.substring(coord2Scan.indexOf(" ") + 1);
        }

        String coord2 = coord2Scan;
        int coord2Check = coord2.indexOf(",");
        int coord2Length = coord2.length() - 1;
        int x2 = Integer.parseInt(coord2.substring(1, coord2Check));
        int y2 = Integer.parseInt(coord2.substring(coord2Check + 1, coord2Length));

        //checks if the points are on a vertical line
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0); //I found how to finish the program early because I don't want to write the rest in an if statement.
        }

        //creates an LinearEquation equation object and prints out the information for the line
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation.lineInfo());

        System.out.println("");
        System.out.print("Enter a value for x: ");
        Double xValue = scan.nextDouble();
        System.out.print("/n" + equation.coordinateForX(xValue));

    }
}

