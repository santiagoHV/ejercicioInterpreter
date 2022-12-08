package model;

import controller.Context;

class IntegerDivisionExpression extends NonTerminalExpression {
    public IntegerDivisionExpression(Expression l, Expression r) {
        super(l, r);
    }

    public int evaluate(Context c) {
        return getLeftNode().evaluate(c) /
                getRightNode().evaluate(c);
    }
}// IntegerDivisionExpression
