package Task1_4;

/**
 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {

	public static void main(String[] args) {
        Bank bgpb = new Bank("FIOBank");
        Client client1 = new Client("Gomozov", "Alexey", "MC2650374");
        client1.addAccount(new Account("123456789101112131415", "BYN", -150));
        client1.addAccount(new Account("124523548962156624521", "BYN", 100));
        client1.addAccount(new Account("324532655224589965485", "BYN", 1500));
        client1.addAccount(new Account("332140000052169416654", "BYN", -500));
        bgpb.addClient(client1);
        bgpb.getClientByPassportId("MC2650374").sortAccountsByAmount();
        System.out.println(bgpb.getClientByPassportId("MC2650374"));
        bgpb.getClientByPassportId("MC2650374").printAccounts();
        bgpb.getClientByPassportId("MC2650374").printSumOfNegativeAccounts();
        bgpb.getClientByPassportId("MC2650374").printSumOfPositiveAccounts();
        bgpb.getClientByPassportId("MC2650374").printSumOfAllAccounts();

    }
}
//name= Gomozov, lastname= Alexey, passportId= MC2650374
//accountNumber= 332140000052169416654, currency= BYN, status= true, amount= -500
//accountNumber= 123456789101112131415, currency= BYN, status= true, amount= -150
//accountNumber= 124523548962156624521, currency= BYN, status= true, amount= 100
//accountNumber= 324532655224589965485, currency= BYN, status= true, amount= 1500
//Negative sum: -650
//Positive sum: 1600
//Sum: 950