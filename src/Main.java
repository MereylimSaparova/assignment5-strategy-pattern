public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(
                new AddStrategy()
        );

        double a = 10;
        double b = 5;

        System.out.println("Strategy Pattern Demo");
        System.out.println("---------------------");

        System.out.println("Addition:");
        System.out.println(
                a + " + " + b + " = " +
                        calculator.calculate(a, b)
        );

        calculator.setStrategy(new SubtractStrategy());

        System.out.println("\nSubtraction:");
        System.out.println(
                a + " - " + b + " = " +
                        calculator.calculate(a, b)
        );

        calculator.setStrategy(new MultiplyStrategy());

        System.out.println("\nMultiplication:");
        System.out.println(
                a + " * " + b + " = " +
                        calculator.calculate(a, b)
        );

        System.out.println("\nStrategy changed successfully!");
    }
}