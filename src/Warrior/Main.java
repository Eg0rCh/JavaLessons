package Warrior;

import java.util.Random;

public class Main {
    /**
     * Имитируется битва между двумя объектами класса warriors, "Рус" и "Ящур".
     * Программа использует петлю while для продолжения битвы пока значение Hp одного из воинов не упадет до 0.
     * И выводит сообщения о нанесенном уроне и оставшемся здоровье Hp.
     */
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
