import services.CalculatorService;

public class Main {
    public static void main(String[] args){
        CalculatorService calculatorService = new CalculatorService();
        var operationResultDiv = calculatorService.calculte(Math::divideExact, 40, 10);
        var operationResultSum = calculatorService.calculte(Integer::sum, 40, 10);
        System.out.println(operationResultDiv);
        System.out.println(operationResultSum);
    }
}
