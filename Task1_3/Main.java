package Task1_3;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {

	public static void main(String[] args) {

        City minsk = new City("Minsk");
        Country belarus = new Country("Belarus", minsk);

        belarus.addRegion(new Region("Minskaya oblast ", minsk, 39.854));
        belarus.addRegion(new Region("Brestskaya oblast ", new City("Brest"), 32.787));
        belarus.addRegion(new Region("Vitebskaya oblast ", new City("Vitebsk"), 40.051));
        belarus.addRegion(new Region("Gomelskaya oblast ", new City("Gomel"), 40.372));
        belarus.addRegion(new Region("Grodnenskaya oblast ", new City("Grodno"), 25.127));
        belarus.addRegion(new Region("Mogilevskaya oblast ", new City("Mogilev"), 29.068));

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegionCenters();

    }
}
//The capital of Belarus is  Minsk
//There are 6 regions in Belarus
//The area of Belarus is 207.25900000000001 thousand square kilometers.
//Regional centers of the Belarus:
//Minsk, Brest, Vitebsk, Gomel, Grodno, Mogilev, 