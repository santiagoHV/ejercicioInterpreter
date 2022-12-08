package model;

import controller.Context;

class PowerExpression extends NonTerminalExpression {
    public PowerExpression(Expression l, Expression r) {
        super(l, r);
    }

    public int evaluate(Context c) {
        return (int) Math.pow(getLeftNode().evaluate(c), getRightNode().evaluate(c));
    }
}// PowerExpression
