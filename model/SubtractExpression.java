package model;

import controller.Context;

class SubtractExpression extends NonTerminalExpression {
    public int evaluate(Context c) {
        return getLeftNode().evaluate(c) -
                getRightNode().evaluate(c);
    }

    public SubtractExpression(Expression l, Expression r) {
        super(l, r);
    }
}// SubtractExpression
