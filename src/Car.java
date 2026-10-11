import java.time.Year;

public class Car {
    String brand;
    Year year;
    int mileage;
// the method for displaying
    void display(){
        System.out.println(this.brand+" "+ this.year+" "+this.mileage);
    }

    public  static void main(String[] args){

//     creating 3 Cars
        Car lambo = new Car();
        Car cruiser = new Car();
        Car gd6 = new Car();

// assigning the cars
        lambo.brand="lamboghini";
        lambo.year= Year.of(2026);
        lambo.mileage=200398;

        cruiser.brand="Cruiser Mhani";
        cruiser.year= Year.of(2023);
        cruiser.mileage=2789;

        gd6.brand="Toyota hilux";
        gd6.year= Year.of(2000);
        gd6.mileage=102;

// displaying the car's information or details
        lambo.display();
        cruiser.display();
        gd6.display();
    }
}
