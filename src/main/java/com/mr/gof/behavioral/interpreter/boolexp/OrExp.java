package com.mr.gof.behavioral.interpreter.boolexp;

public class OrExp implements BooleanExp {

    private final BooleanExp operand1;

    private final BooleanExp operand2;

    public OrExp(BooleanExp operand1, BooleanExp operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public boolean evaluate(Context context) {
        return operand1.evaluate(context) || operand2.evaluate(context);
    }

    @Override
    public BooleanExp replace(String name, BooleanExp booleanExp) {
        return new OrExp(operand1.replace(name, booleanExp), operand2.replace(name, booleanExp));
    }

    @Override
    public BooleanExp copy() {
        return new OrExp(operand1.copy(), operand2.copy());
    }

    @Override
    public String string() {
        return "( " + operand1.string() + " or " + operand2.string() + " )";
    }
}
