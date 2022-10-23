public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    /* Creates a LinearEquation object
       PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
       this precondition is not violated) */
    public LinearEquation (int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double slopeY = y2 - y1;
        double slopeX = x2 - x1;
        double slope = slopeY / slopeX;
        return roundedToHundredth(slope);
    }

    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        double powX = Math.pow(x2 - x1, 2);
        double powY = Math.pow(y2 - y1, 2);
        return roundedToHundredth(Math.sqrt(powX + powY));
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double yIntercept = x1 * slope();
        return  roundedToHundredth(y1 - yIntercept);
    }



    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded(
    to the nearest hundredth */
    public double roundedToHundredth(double toRound) {
        double round = Math.round(toRound * 100);
        return round / 100;
    }

    /* Returns a String that represents the linear equation of the line through points
   (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5" */
    public String equation() {
        String finalSlope = "";
        String slopeString = Double.toString(slope());
        int slopeCheck = slopeString.indexOf(".0");
        if (slopeCheck != -1) {
            finalSlope = slopeString.substring(0, slopeCheck);
        } else if (slope() == 0) {
            finalSlope = "y = x" + yIntercept();
        }  else {
                double slopeY = y2 - y1;
                double slopeX = x2 - x1;
                int divisor = 1;
                double checkY = 1;
                double checkX = 1;
                String stringY = "";
                String stringX = "";
                while( stringY.indexOf("0") == -1 && stringX.indexOf("0") == -1) {
                    divisor++;
                    checkY = slopeY / divisor;
                    checkX = slopeX / divisor;
                    stringY =  Double.toString(checkY);
                    stringX =  Double.toString(checkX);
                }
                if (stringX.indexOf("-") != -1) {
                    slopeX *= -1;
                }
                finalSlope =  Math.round (slopeY) + "/" + Math.round (slopeX);

            }
        String interceptString = Double.toString(yIntercept());
        if (interceptString.indexOf("-") != -1 ) {
            return finalSlope + "x - " + interceptString.substring(1);
        } else {
            return finalSlope + "x + " + yIntercept();
        }
    }


    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method) */
    public String lineInfo() {
        String info = "The two points are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")";
        info += "\nThe equation of the line between these points is: y = " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of the is: " + yIntercept();
        info += "\nThe distance between the two points is: " + distance();
        return info;
    }

}


