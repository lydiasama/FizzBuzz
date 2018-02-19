public class FizzBuzz {

    private String[] divisibleWith3 = {"Fizz"};
    private String[] divisibleWith5 = {"Buzz"};
    private String[] divisibleWith3and5 = {"FizzBuzz"};

    public String count(int input) {
        try {
            return checkDivisibleWith3and5(input % 15);
        } catch (Exception ignored) { }

        try {
            return checkDivisibleWith3(input % 3);
        } catch (Exception ignored) { }

        try {
            return checkDivisibleWith5(input % 5);
        } catch (Exception e) {
            return "" + input;
        }
    }

    private String checkDivisibleWith3(int result) throws Exception {
        return divisibleWith3[result];
    }

    private String checkDivisibleWith5(int result) throws Exception {
        return divisibleWith5[result];
    }

    private String checkDivisibleWith3and5(int result) throws Exception {
        return divisibleWith3and5[result];
    }
}
