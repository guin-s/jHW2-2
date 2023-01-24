public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int adjunction = 50;
        int bonus;

        if (adjunction > 100) {
            bonus = adjunction / 100;
        } else {
            bonus = 0;
        }

        int newBalance = currentBalance + adjunction + bonus;

        System.out.println("начальный баланс: " + currentBalance + " руб.");
        System.out.println("сумма пополнения: " + adjunction + " руб.");
        System.out.println("сумма бонуса: " + bonus + " руб.");
        System.out.println("новый баланс: " + newBalance + " руб.");


    }
}
