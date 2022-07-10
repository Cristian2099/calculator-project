package services;

import java.util.function.BiFunction;

public class CalculatorService {
    private int firstValue, secondValue;

    public CalculatorService(){
        this.firstValue = 0;
        this.secondValue = 0;
    }

    public CalculatorService(int firstValue, int secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int calculte(BiFunction<Integer, Integer, Integer> operation, int firstValue, int secondValue){
        var result = operation.apply(this.firstValue != 0 ? this.firstValue : firstValue,
                this.secondValue != 0 ? this.secondValue : secondValue);
        return result;
    }
}
