public class Main {
    public static void main(String[] args) {
        int price = 710; // стоимость билета
        int mileCount = 20; // количество рублей для начисления одной мили
        int bonusMiles = price / mileCount; // количество бонусных миль
        System.out.println(bonusMiles + " мили бонусом");
    }
}
