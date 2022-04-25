public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishmentAmount = 1200;
        int min = 1000;
        boolean replenishes = true;
        int sum = balance + replenishmentAmount;
        int bonus = replenishmentAmount / 100;
        int percent = replenishes ? bonus : sum;
        int check = percent + sum;
        if (sum > min) {

        } else {
            check = sum;
        }
        System.out.println("Итоговая сумма на счету: " + check + " руб.");

        System.out.println("Бонусные рубли: " + bonus + " руб.");

    }
}
