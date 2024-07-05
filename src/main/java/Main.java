import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Race race24HeuresduMans = new Race();

        for (int i = 0; i < 3; i++){
            System.out.println("Введите название машины №"+(i+1)+":");
            String carName = scanner.next();

            System.out.println("Введите скорость машины №"+(i+1)+":");


            int carSpeed;

            do {
                if (scanner.hasNextInt()) {
                    carSpeed = scanner.nextInt();
                } else {
                    System.err.print(scanner.next() + " не является числом");
                    continue;
                }

                if (carSpeed <= 0 || carSpeed > 250) {
                    System.err.println("Неправильная скорость");
                    System.out.println("Введите скорость машины №"+(i+1)+":");
                    continue;
                }

                break;

            } while (true);

            race24HeuresduMans.addCar(new Car(carName, carSpeed));

        }

        System.out.println("Самая быстрая машина: " + race24HeuresduMans.getWinner().name);

    }
}
