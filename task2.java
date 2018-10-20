public class task2 {
    public static void main(String args[]) {
        int CountDestroyedTanksPlayer1 = 12;
        int CountDestroyedTanksPlayer2 = 12;
        int Sum1 = 0;
        int Sum2 = 0;
        for (int i = 1; i<=CountDestroyedTanksPlayer1; i++){
            Sum1 = Sum1 + 100;
        }
        for (int i = 1; i <= CountDestroyedTanksPlayer2; i++) {
            Sum2 = Sum2 + 100;
        }
        System.out.println("Количество очков у 1 - ого игрока: " + Sum1);
        System.out.println("Количество очков у 2 - ого игрока: " + Sum2);
        if (Sum1 > Sum2) {
            Sum1 = Sum1 + 1000;
            System.out.println("Количество очков у 1 - ого игрока(с учетом победных): " + Sum1);
        } else if (Sum1 < Sum2) {
            Sum2 = Sum2 + 1000;
            System.out.println("Количество очков у 2 - ого игрока(с учетом победных): " + Sum2);
        }
        if (Sum1 == Sum2) {
            System.out.println("Ничья: " + Sum2 + " points");
        }
    }
}