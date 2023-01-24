public class Car extends Transport{
    private TaxiDriver taxiDriver;
    private BusDriver busDriver;
    public Car(int ID, String yearOfProduction, String color, String number) {
        super(ID, yearOfProduction, color, number);
    }

    public Car() {
    }

    @Override
    public void Go() {
        System.out.println("Car is going");
    }

    @Override
    public void Stop() {
        System.out.println("Car is stopped");
    }

}
