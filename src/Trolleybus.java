public class Trolleybus extends Transport{

    public Trolleybus(int ID, String yearOfProduction, String color, String number) {
        super(ID, yearOfProduction, color, number);
    }

    public Trolleybus() {
    }

    @Override
    public void Go() {
        System.out.println("Trolleybus is going");
    }

    @Override
    public void Stop() {
        System.out.println("Trolleybus is stopped");
    }
}
