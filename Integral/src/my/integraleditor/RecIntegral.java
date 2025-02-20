/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.integraleditor;

/**
 *
 * @author Ilya
 */
public class RecIntegral {
    double min_value=0;
    double max_value=0;
    double step=0;
    double result=0;

    RecIntegral(double min_value, double max_value, double step, double result) {
        this.min_value = min_value;
        this.max_value = max_value;
        this.step = step;
        this.result = result;
    }
    
    public double integral(){
        double value=min_value;
        double next_value=min_value;
        double sqrt;
        double new_sqrt;
        result=0;
        int max_i= (int)((max_value-min_value)/step);
        for (int i=1;i<=max_i+1;i++){
            next_value += step;
            if(next_value>max_value){
                next_value = max_value;
            }
            new_sqrt = Math.sqrt(next_value);
            sqrt=Math.sqrt(value);
            
            result += ((new_sqrt+sqrt)*(next_value-value))/2;
            
            value=next_value;
            
        }
        return result;
       
   }
     public double getMinValue() {
        return min_value;
    }

    public void setMinValue(double minValue) {
        this.min_value = minValue;
    }

    public double getMaxValue() {
        return max_value;
    }

    public void setMaxValue(double maxValue) {
        this.max_value = maxValue;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
