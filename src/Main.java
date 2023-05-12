public class Main {
    public static void main(String[] args) {
        int onTheAccount = 200;
        int refill = 1500;
        int bonus;
        int accountAfterRefill;

        if (refill > 1000) {
            bonus = refill / 100;
            accountAfterRefill = onTheAccount + refill + bonus;
        }
        else {
            bonus = 0;
            accountAfterRefill = onTheAccount + refill;
        }
        System.out.println("Количество начисленных бонусов:" + bonus);
        System.out.println("Итоговая сумма на счете:" + accountAfterRefill);

    }
}