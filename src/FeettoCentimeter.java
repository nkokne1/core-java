public class FeettoCentimeter {
    //Converting feet , inches to centimeters using Method Overloading

    public static void main(String[] args) {
         double inches = 9.50;
         double feet = 8.0;

         printInchesToCentimeter(inches);
         printFeetToCentimeter(feet,inches);

    }

    public static double feetToCentimeter(double inches)
    {
        if(inches !=0)
        {
            double feet = inches / 12 ;
            double inchesLeft = inches - (feet * 12);
            return feetToCentimeter(feet , inchesLeft);
        }
        return -1;
    }

    public static double feetToCentimeter(double feet, double inches)
    {
        double totalInches = feet * 12 + inches;
        double centimeter = totalInches * 2.54;
        return centimeter;
    }

    public static void printInchesToCentimeter(double inches)
    {
        double centimeter = feetToCentimeter(inches);
        System.out.println("The value of " +inches+ "in centimeter is: " +centimeter);
    }

    public static void printFeetToCentimeter(double feet, double inches)
    {
        double centimeter = feetToCentimeter(feet , inches);
        System.out.println("The value of " +feet+ "feet and "+ inches + " inches in centimeter is: " +centimeter);
    }


}
