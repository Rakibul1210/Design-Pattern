public class AdditionExpression extends BinaryExpression {
    public AdditionExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return getLeft().interpret() + getRight().interpret();
    }
}
