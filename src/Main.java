

public class Main {

    public static void main(String[] args) {
//        int ticketPrice = 100;
//        int bonusCount = 20;
//        int bonus = ticketPrice / bonusCount;
//        System.out.println(bonus);

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;

        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
