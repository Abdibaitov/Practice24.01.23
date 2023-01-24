public class Bus extends Transport{
    private Seller seller;
    private BusDriver busDriver;

    public Bus(int ID, String yearOfProduction, String color, String number) {
        super(ID, yearOfProduction, color, number);
    }
    public Bus() {
    }

    @Override
    public void Go() {
        System.out.println("Bus is going");
    }

    @Override
    public void Stop() {
        System.out.println("Bus is stopped");
    }

}
