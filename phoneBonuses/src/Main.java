public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int payment = 200;

        boolean rechargeAmount = payment > 1000;

        int calculateBonus;
        if (rechargeAmount) {
            calculateBonus = payment / 100;
        } else {
            calculateBonus = 0;
        }

        int finalScore = amount + payment + calculateBonus;
        System.out.println("бонус равен: " +  calculateBonus + " рублей, итоговая сумма на счету клиента: " + finalScore + " рублей");
    }
}