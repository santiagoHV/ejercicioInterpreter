public abstract class NonTerminalExpression implements Expression {
  private Expression leftNode;
  private Expression rightNode;

  public NonTerminalExpression(Expression l, Expression r) {
    setLeftNode(l);
    setRightNode(r);
  }
  public void setLeftNode(Expression node) {
    leftNode = node;
  }
  public void setRightNode(Expression node) {
    rightNode = node;
  }
  public Expression getLeftNode() {
    return leftNode;
  }
  public Expression getRightNode() {
    return rightNode;
  }
}// NonTerminalExpression

class AddExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) +
           getRightNode().evaluate(c);
  }
  public AddExpression(Expression l, Expression r) {
    super(l, r);
  }
}// AddExpression

class SubtractExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) -
           getRightNode().evaluate(c);
  }
  public SubtractExpression(Expression l, Expression r) {
    super(l, r);
  }
}// SubtractExpression

class MultiplyExpression extends NonTerminalExpression {
  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) *
           getRightNode().evaluate(c);
  }
  public MultiplyExpression(Expression l, Expression r) {
    super(l, r);
  }

}// MultiplyExpression

class ModuleExpression extends NonTerminalExpression{
  public ModuleExpression(Expression l, Expression r) {
    super(l, r);
  }

  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) %
           getRightNode().evaluate(c);
  }
}// ModuleExpression

class IntegerDivisionExpression extends NonTerminalExpression{
  public IntegerDivisionExpression(Expression l, Expression r) {
    super(l, r);
  }

  public int evaluate(Context c) {
    return getLeftNode().evaluate(c) /
           getRightNode().evaluate(c);
  }
}// IntegerDivisionExpression

class PowerExpression extends NonTerminalExpression{
  public PowerExpression(Expression l, Expression r) {
    super(l, r);
  }

  public int evaluate(Context c) {
    return (int)Math.pow(getLeftNode().evaluate(c), getRightNode().evaluate(c));
  }
}// PowerExpression

