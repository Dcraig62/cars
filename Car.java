import java.util.Scanner;
public class Car{
    String model;
    String brand;
    double price;
    double mileage;
    int modelYear;
    boolean needsRepair;
    public static void main(String[] args){
        int x = 5;
        Car car1 = new Car("Stringray", "Corvette", 59995, 2000, 2020, false);
        Car car2 = new Car("Austin", "Mini Cooper", 22500, 120000, 1961, false);
        Car car3 = new Car("Van", "Volkswagen", 8560, 200000, 1970, true);
        System.out.println("You have three car offers!");
        Scanner myObj = new Scanner(System.in);
        while(x != 0){
            System.out.println("Enter 1, 2 or 3 to see them and 0 to quit: ");
            x = myObj.nextInt();
            if(x == 1){
                Car.display(car1);
            } else if (x == 2){
                Car.display(car2);
            } else if (x == 3){
                Car.display(car3);
            } else if (x == 0){
                break;
            }else{
                System.out.println("Not a valid input!");
            }
        }
    }
    public static void display(Car car){
        System.out.println("Model " + car.modelYear + " " + car.model + " Brand: " + car.brand);
        System.out.println("Mileage: " + car.mileage);
        if (car.needsRepair){
            System.out.println("This car needs repair");
        }
        System.out.printf("Price: $%,.2f%n", car.price);
    }
    public Car(String _model, String _brand, double _price, double _mileage, int year, boolean repair){
        model = _model;
        brand = _brand;
        price = _price;
        mileage = _mileage;
        modelYear = year;
        needsRepair = repair;

    }
}   