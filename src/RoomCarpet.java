public class RoomCarpet {

    private double costPerSquareFoot;
    RoomDimension roomDimension = new RoomDimension();

    public RoomCarpet(double costPerSquareFoot , RoomDimension roomDimension)
    {
        this.costPerSquareFoot = costPerSquareFoot;
        this.roomDimension = roomDimension;
    }

    public RoomCarpet() {

    }

    public double getCostPerSquareFoot()
    {
        return costPerSquareFoot;
    }

    public void setCostPerSquareFoot(double costPerSquareFoot)
    {
        this.costPerSquareFoot = costPerSquareFoot;
    }

    public double TotalCostOfCarpet(RoomDimension roomDimension ,double costPerSquareFoot)
    {
        double cost;
        cost = costPerSquareFoot * roomDimension.getAreaOfRoom();

        return cost;
    }
}
