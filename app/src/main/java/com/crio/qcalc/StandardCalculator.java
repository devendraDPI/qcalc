package com.crio.qcalc;

public class StandardCalculator {
    public static void getVersion() {
        System.out.println("Standard Calculator v1.0.0");
    }

    private int result;

    public int getResult() {
        return result;
    }

    private void setResult(int result) {
        this.result = result;
    }

    public void clearResult() {
        setResult(0);
    }

    public void printResult() {
        System.out.println("Standard Calculator Result: " + getResult());
    }

    public void add(int num1, int num2) {
        setResult(num1 + num2);
    }

    public void subtract(int num1, int num2) {
        setResult(num1 - num2);
    }

    public void multiply(int num1, int num2) {
        setResult(num1 * num2);
    }

    public void divide(int num1, int num2) {
        setResult(num1 / num2);
    }
}
