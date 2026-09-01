public class DivisionExpression extends BinaryExpression {
    public DivisionExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        int dividend = getLeft().interpret();
        int divisor = getRight().interpret();

        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return dividend / divisor;
    }
}
