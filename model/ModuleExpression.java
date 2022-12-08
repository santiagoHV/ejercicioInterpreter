package model;

import controller.Context;

class ModuleExpression extends NonTerminalExpression {
    public ModuleExpression(Expression l, Expression r) {
        super(l, r);
    }

    public int evaluate(Context c) {
        return getLeftNode().evaluate(c) %
                getRightNode().evaluate(c);
    }
}// ModuleExpression
