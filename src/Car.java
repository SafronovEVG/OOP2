public class Car extends Transport implements PrintService {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Проверяем двигатель");
    }
}