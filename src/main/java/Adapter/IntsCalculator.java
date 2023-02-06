package Adapter;

public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return newOperation(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return newOperation(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {
        return newOperation(a, b, Calculator.Operation.MULT);
    }

    private int newOperation(int a, int b, Calculator.Operation operation) {
        return (int) target
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(operation)
                .result();
    }
}
