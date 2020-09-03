package Task1_5;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {
        TravelAgency alatan = new TravelAgency("Sandy.Tour");   //Alatan by.epam.Tour
        alatan.addTour(new Tour("Hawaii", TypeOfTour.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 12, 1000.99));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.RECREATION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 14, 854));
        alatan.addTour(new Tour("Italy", TypeOfTour.EXCURSION,
                Transport.BUS, Food.ALL_INCLUSIVE, 10, 300.2));
        alatan.addTour(new Tour("Italy", TypeOfTour.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 20, 865.95));
        alatan.addTour(new Tour("Italy", TypeOfTour.SHOPPING,
                Transport.PLANE, Food.BREAKFAST, 3, 399.99));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.EXCURSION,
                Transport.PLANE, Food.NOT_INCLUDED, 5, 987.15));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.RECREATION,
                Transport.CAR, Food.BREAKFAST, 15, 600.3));
        alatan.addTour(new Tour("Hawaii", TypeOfTour.TREATMENT,
                Transport.SHIP, Food.ALL_INCLUSIVE, 8, 500.80));
        alatan.addTour(new Tour("Italy", TypeOfTour.TREATMENT,
                Transport.TRAIN, Food.ALL_INCLUSIVE, 13, 1099.11));
        alatan.addTour(new Tour("Italy", TypeOfTour.SHOPPING,
                Transport.CAR, Food.NOT_INCLUDED, 5, 599.50));

        Client client = new Client("Aleksandr", "Sanych");
        alatan.addClient(client);
        alatan.sortToursByPrice();
        alatan.searchWithCountry("italy");
        client.setTour(alatan.getTourById(101));
        System.out.println(client);

    }
}
//id= 102, country= Italy, type= excursion, transport= bus, food= all inclusive, numberOfDays= 10, price= 300.2
//id= 104, country= Italy, type= shopping, transport= plane, food= breakfast, numberOfDays= 3, price= 399.99
//id= 109, country= Italy, type= shopping, transport= car, food= not included, numberOfDays= 5, price= 599.5
//id= 103, country= Italy, type= cruise, transport= ship, food= breakfast, numberOfDays= 20, price= 865.95
//id= 108, country= Italy, type= treatment, transport= train, food= all inclusive, numberOfDays= 13, price= 1099.11
//id=1, firstName= Aleksandr, lastName= Sanych, tour: id= 101, country= Hawaii, type= recreation, transport= plane, food= all inclusive, numberOfDays= 14, price= 854.0

