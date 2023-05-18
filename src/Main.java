import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PetrolCar honda = new PetrolCar("Honda", "civic","SPI11424",2004,90,2000 ,1400,60);
        System.out.println(honda);
        PetrolCar honda2 = new PetrolCar("Honda", "civic","SPI11424",2004,90,2000 ,1400,60);

        System.out.println(honda.equals(honda2));

        }

    }
