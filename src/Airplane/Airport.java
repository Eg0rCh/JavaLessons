package Airplane;

public class Airport {
    /**
     * Добавляет топливо в самолет, если его уровень топлива меньше 100.
     * @param airplane самолет, которому нужно добавить топливо
     * @return стоимость добавленного топлива в рублях
     */
    public int addFuel(Airplane airplane) {
        int fuelForRefueling = 100;
        int price = 0;
        if (airplane.getFuel() < 100) {
            int fuelAmount = fuelForRefueling-airplane.getFuel();
            airplane.setFuel(fuelAmount);
            price = fuelAmount * 56;
        }
        return price;
    }
    /**
     * Проверяет возраст самолета и возвращает соответствующее сообщение.
     * @param airplane самолет, возраст которого нужно проверить
     * @param currentYear текущий год
     * @return сообщение о состоянии самолета
     */
    public String checkYear(Airplane airplane,  int currentYear) {
        int age = currentYear - airplane.getYear();
        if (age > 30){
            return "Самолет пора в утиль";
        } else {
            return "Самолет ещё полетает";
        }
    }
    /**
     * Считает количество самолетов в массиве, вес которых больше 50000 кг.
     * @param airplanes массив самолетов, которые нужно проверить
     * @return количество самолетов с весом более 50000 кг
     */
    public int countPlanes(Airplane[] airplanes) {
        int count = 0;
        for (Airplane airplane : airplanes) {
            if (airplane.getWeight() > 50000) {
                count++;
            }
        }
        return count;
    }
}
