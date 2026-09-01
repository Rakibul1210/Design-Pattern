import java.util.Objects;

public abstract class BinaryExpression implements Expression {
    private final Expression left;
    private final Expression right;

    protected BinaryExpression(Expression left, Expression right) {
        this.left = Objects.requireNonNull(left);
        this.right = Objects.requireNonNull(right);
    }

    protected final Expression getLeft() {
        return left;
    }

    protected final Expression getRight() {
        return right;
    }
}
