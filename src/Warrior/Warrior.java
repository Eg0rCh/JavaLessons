package Warrior;

import java.util.Random;

public class Warrior {
    String name;
    int hp;
    int damage;

    public Warrior(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Warrior other) {


        System.out.println("Воин " + this + " атакует " + other + " наносит " + damage + " урона.");
        other.setHp(other.getHp() - damage);
        System.out.println("Воин " + other + "  " + other.getHp() + " здоровья осталось.");

    }

    public static void main(String[] args) {
        Random random = new Random();
        Warrior russ = new Warrior("Рус", 50, 15);
        Warrior lizard = new Warrior("Ящур", 50, 10);


        while (russ.getHp() > 0 && lizard.getHp() > 0) {
            if (random.nextBoolean()) {
                russ.attack(lizard);
            } else {
                lizard.attack(russ);
            }
        }

        if (russ.getHp() > 0) {
            System.out.println("Резня Русы победили!");
        } else {
            System.out.println("Ящурские фокусы!");
        }

    }
}
