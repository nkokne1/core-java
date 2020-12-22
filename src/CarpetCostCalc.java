import java.util.Scanner;

public class CarpetCostCalc {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the dimensions of the room");
        System.out.println("Please enter the length of the room ");

        double length = sc.nextDouble();

        System.out.println("Please enter the width of the room ");
        double width = sc.nextDouble();

        System.out.println("Please enter the cost per square foot of the room ");
        double cost = sc.nextDouble();

        RoomDimension roomDimension = new RoomDimension(length , width);
        RoomCarpet roomCarpet = new RoomCarpet(cost,roomDimension);

        System.out.println(" The cost of the carpet to cover the room with area " + roomDimension.getAreaOfRoom() + " is : "
                                +roomCarpet.TotalCostOfCarpet(roomDimension , cost));
    }
}
