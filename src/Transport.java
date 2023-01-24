public abstract class Transport {
    private int ID;
    private String yearOfProduction;
    private String color;
    private String number;

    public Transport(int ID, String yearOfProduction, String color, String number) {
        this.ID = ID;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.number = number;
    }

    public Transport(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract void Go();

    public abstract void Stop();
}
