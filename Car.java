// class is declared final
import java.util.Date;

final class Immutable {

    // private class members
    private String model;
    private int date;
    private int yil;
    private int kackisilik;
    private int km;

    Immutable(String model, int date,int yil,int kackisilik,int km) {

        // class members are initialized using constructor
        this.model = model;
        this.date = date;
        this.yil = yil;
        this.kackisilik = kackisilik;
        this.km = km;
    }

    // getter method returns the copy of class members
    public String getModel() {
        return model;
    }

    public int getDate() {
        return date;
    }
    public int getYil() {
        return yil;
    }
    public int getKackisilik() {
        return kackisilik;
    }
    public int getKm() {
        return km;
    }

}

class Main {
    public static void main(String[] args) {

        // create object of Immutable
        Immutable obj = new Immutable("Toyata", 2011,2,5,2000);

        System.out.println("Name: " + obj.getModel());
        System.out.println("Date: " + obj.getDate());
        System.out.println("Yil: " + +  obj.getYil());}
}
