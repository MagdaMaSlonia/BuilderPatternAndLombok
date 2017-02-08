package pl.magda;

public class TestBuilderPattern {

    public static void main(String[] args) {

        Employee emp = Employee.builder().empName("Deendaya").salary(100).build();
        System.out.println(emp);

        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.build();
        Car car = carBuilder.getCar();
        System.out.println(car);

        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.build();
        car = carBuilder.getCar();

        System.out.println(car);

        Bike bike = Bike.builder().rama("czarna").kierownica("baranek").kola("niebieskie").siodelko("brooksa").build();

    }

}
