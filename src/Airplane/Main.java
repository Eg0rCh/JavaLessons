package Airplane;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Миг", 2020, 50, 10000);
        Airplane airplane2 = new Airplane("Ту-166",1985, 33,10000);
        Airplane airplane3 = new Airplane("Руслан", 2010, 69, 392000);

        Airport airport = new Airport();

        airplane1.setFuel(80);
        airplane2.setFuel(60);

        int price = airport.addFuel(airplane1);
        System.out.println("Цена за бензин для самолета: " + price);

        int price2 = airport.addFuel(airplane2);
        System.out.println("Цена за бензин для самолета: " + price2);


        String lifetime = airport.checkYear(airplane1, 2023);
        System.out.println(lifetime);

        String lifetime2 = airport.checkYear(airplane2, 2023);
        System.out.println(lifetime2);

        Airplane[] airplanes = {airplane1, airplane2, airplane3};
        int count = airport.countPlanes(airplanes);
        System.out.println("Количество тяжелых самолетов: " + count);
    }
}
