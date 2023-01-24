public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(12132435,"2019","red","111");
        System.out.println("ID: "+bus.getID()+", yearOfProduction: "+bus.getYearOfProduction()+", color: "+bus.getColor()+", number: "+bus.getColor());
        bus.Go();
        bus.Stop();

        Trolleybus trolleybus = new Trolleybus(12424256,"2018","white","2222");
        System.out.println("\nID: "+trolleybus.getID()+", yearOfProduction: "+trolleybus.getYearOfProduction()+", color: "+trolleybus.getColor()+", number: "+trolleybus.getColor());
        trolleybus.Go();
        trolleybus.Stop();

        Car car = new Car(526234141,"2022","yellow","777");
        System.out.println("\nID: "+car.getID()+", yearOfProduction: "+car.getYearOfProduction()+", color: "+car.getColor()+", number: "+car.getColor());
        car.Go();
        car.Stop();

        Seller seller1 = new Seller("Bazarbay","Seller",32);
        System.out.println("\nname: "+seller1.getName()+" job: "+seller1.getJob()+" age: "+seller1.getAge());

        BusDriver busDriver2 = new BusDriver("Murat","BusDriver",33);
        System.out.println("\nname: "+busDriver2.getName()+" job: "+busDriver2.getJob()+" age: "+busDriver2.getAge());

        TaxiDriver taxiDriver2 = new TaxiDriver("Kambar","TaxiDriver",29);
        System.out.println("\nname: "+taxiDriver2.getName()+" job: "+taxiDriver2.getJob()+" age: "+taxiDriver2.getAge());


    }
}