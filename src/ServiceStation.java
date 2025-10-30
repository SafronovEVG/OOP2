public class ServiceStation implements ServiceInterface {
    @Override
    public void check(Transport object) {
        System.out.println("Обслуживаем " + object.getModelName());
        for (int i = 0; i < object.getWheelsCount(); i++) {
            object.updateTyre();
        }
        if (object instanceof PrintService) {
            ((PrintService) object).check();
        }
    }
}