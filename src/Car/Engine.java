package Car;

public class Engine {
    public Engine(int durability) {
        this.durability = durability;
    }

    private int durability = 100;

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
