package Car;

public class Car {
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private String model;
    private Engine engine;

    public void startMove(int km) {
        int deterioration = km / 1000 * 10;
        engine.setDurability(engine.getDurability() - deterioration);
    }
    public void showInfo(Engine engine) {
        System.out.println("Износ двигателя: " + engine.getDurability());
    }

}
