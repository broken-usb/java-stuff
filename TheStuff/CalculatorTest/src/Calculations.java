public class Calculations {
    Variables variables;
    private String operation;
    private double cache1 = variables.getN1();
    private double cache2 = variables.getN2();

    public double Sum(double n1, double n2) {
        return cache1 + cache2;
    }
}
