public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 30;
        long amount = 1000_60;
        boolean registered = true;

        long actual = service.calculate(amount, registered);

        boolean result = actual == expected;
        System.out.println(result);
    }
}

