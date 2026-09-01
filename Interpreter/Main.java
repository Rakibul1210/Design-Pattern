public class Main {
    public static void main(String[] args) {
        Expression firstExpression = new AdditionExpression(
                new NumberExpression(2),
                new MultiplicationExpression(
                        new NumberExpression(3),
                        new NumberExpression(4)
                )
        );

        System.out.println("Expression: 2 + 3 * 4");
        System.out.println("Result: " + firstExpression.interpret());

        Expression secondExpression = new DivisionExpression(
                new SubtractionExpression(
                        new NumberExpression(20),
                        new NumberExpression(4)
                ),
                new NumberExpression(2)
        );

        System.out.println("\nExpression: (20 - 4) / 2");
        System.out.println("Result: " + secondExpression.interpret());
    }
}
