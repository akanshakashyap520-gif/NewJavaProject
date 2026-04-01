package fundamental;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int addResult = cal.add(3, 7);
        int mulResult = cal.multiply(4, 8);
        System.out.println("add " + addResult + " mul "+mulResult);
    }
}
