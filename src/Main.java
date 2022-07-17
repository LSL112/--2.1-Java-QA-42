public class Main {

    public static void main(String[] args) {
        int check = 200;
        int pay = 1200;
        int total;
        int bonus = pay / 100;

        if ( 1100 <= pay) {
            total = bonus + check + pay;
            System.out.println("Клиент пополнил счёт на " + pay + " рублей " + " - бонус равен " + bonus + " рублей, итоговая сумма на счету клиента - " + total + " рублей");
        }
        else {
            total = check + pay;
            System.out.println("Клиент пополнил счёт на " + pay + " рублей " + " - бонусов нет , итоговая сумма на счету клиента - " + total + " рублей");
        }
    }
}
