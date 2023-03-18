public class Main {
    public static void main(String[] args) {
        /*Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(1)
                        .addOperand(15)
                        .calculate(Calculator.Operation.SUM)
                        .result()
        );*/

        Ints calc = new IntsCalculator();
        
        System.out.println(calc.sum(20,4));
        System.out.println(calc.mult(5,48));
        System.out.println(calc.pow(22,1));
    }
}