package DIP;

public class Test {

    //Car класс верхнего уровня, который соединяется с классами нижнего уровня интерфейсом engine
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
