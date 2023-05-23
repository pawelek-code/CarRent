import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PetrolCar honda = new PetrolCar("Honda", "civic", "SPI11424", 2005, 90, 2000, 1400, 60);
        System.out.println(honda);
        PetrolCar honda2 = new PetrolCar("Honda", "civic", "SPI11424", 2005, 90, 2000, 1400, 60);

        System.out.println(honda.equals(honda2));
        CarRent januszex = new CarRent();
        PetrolCar ford = new PetrolCar("Ford", "Focus", "SPI21808", 2012, 150, 2000, 1600, 30);
        System.out.println(ford);
        januszex.addCar(ford);
        januszex.addCar(honda);
        Scanner scanner = new Scanner(System.in);
        boolean running=true;
        while (running == true){
        System.out.println("What do you want to do?\n" +
                "1. Add new petrol car\n" +
                "2.  Add new electric car\n" +
                "3.  Add new Motorbike\n" +
                "4. Close the program");
        int tmp = scanner.nextInt();


            switch (tmp) {
                case 1:
                    PetrolCar petrolCar = new PetrolCar();
                    System.out.println("add engine capacity");
                    int tmpEngCap = scanner.nextInt();
                    petrolCar.setEngCapacity(tmpEngCap);

                    System.out.println("choose brand");
                    String branTemp = scanner.nextLine();
                    scanner.nextLine();
                    petrolCar.setBrand(branTemp);

                    System.out.println("choose model");
                    String modeltemp = scanner.nextLine();

                    petrolCar.setModel(modeltemp);

                    System.out.println("add Production year");
                    int prodTemp = scanner.nextInt();

                    petrolCar.setProdYear(prodTemp);

                    System.out.println(" power");
                    int powTemp = scanner.nextInt();

                    petrolCar.setPower(powTemp);

                    System.out.println("plates number");
                    String plaTemp = scanner.nextLine();
                    scanner.nextLine();
                    petrolCar.setPlates(plaTemp);

                    System.out.println("choose kmlimit");
                    int limTemp = scanner.nextInt();

                    petrolCar.setKmLimit(limTemp);

                    System.out.println("Fuel percentage");
                    int fuelTemp = scanner.nextInt();

                    petrolCar.setFuelPrecent(fuelTemp);
                    januszex.addCar(petrolCar);
                    break;
                case 2:
                    ElectricCar electricCar = new ElectricCar();
                    System.out.println("battery lvl");
                    int tmpBatlvl = scanner.nextInt();
                    electricCar.setBatteryLvl(tmpBatlvl);
                    System.out.println("choose brand");
                    String bran1Temp = scanner.nextLine();
                    electricCar.setBrand(bran1Temp);
                    System.out.println("choose model");
                    String model1temp = scanner.nextLine();
                    electricCar.setModel(model1temp);
                    System.out.println("add Production year");
                    int prod1Temp = scanner.nextInt();
                    electricCar.setProdYear(prod1Temp);
                    System.out.println(" power");
                    int pow1Temp = scanner.nextInt();
                    electricCar.setPower(pow1Temp);
                    System.out.println("plates number");
                    String pla1Temp = scanner.nextLine();
                    electricCar.setPlates(pla1Temp);
                    System.out.println("choose kmlimit");
                    int lim1Temp = scanner.nextInt();
                    electricCar.setKmLimit(lim1Temp);
                    januszex.addCar(electricCar);
                    break;
                case 3:
                    Motorbike motorbike = new Motorbike();
                    System.out.println("choose brand");
                    String bran2Temp = scanner.nextLine();
                    motorbike.setBrand(bran2Temp);
                    System.out.println("choose model");
                    String model2temp = scanner.nextLine();
                    motorbike.setModel(model2temp);
                    System.out.println("add Production year");
                    int prod2Temp = scanner.nextInt();
                    motorbike.setProdYear(prod2Temp);
                    System.out.println(" power");
                    int pow2Temp = scanner.nextInt();
                    motorbike.setPower(pow2Temp);
                    System.out.println("plates number");
                    String pla2Temp = scanner.nextLine();
                    motorbike.setPlates(pla2Temp);
                    System.out.println("choose kmlimit");
                    int lim2Temp = scanner.nextInt();
                    motorbike.setKmLimit(lim2Temp);
                    System.out.println("Motor type");
                    String typTemp = scanner.nextLine();
                    motorbike.setType(typTemp);
                    januszex.addCar(motorbike);
                    break;

                case 4:
                    running=false;
                    break;
                default:
                    System.out.println("wrong number");
            }
        }
    }

    }
