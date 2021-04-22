/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR11.Lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Alex
 */
public class Calculator {
    private float _a;
    private float _b;
    private float _c;
    private float _d;
    
    public Calculator()
    {
        _a = -1;
        _b = -4;
        _c = 6;
        _d = 6;
    }

    public Calculator(float a, float b, float c, float d) {
        _a = a;
        _b = b;
        _c = c;
        _d = d;
    }
    
    public Float CalculateFormula(float x){
        float numerator = (float)Math.log(_d * x);
        float denominator = (_a * (float)Math.pow(x, 2) + _b * x + _c);
        if(denominator == 0)
            return Float.MAX_VALUE;
        float result = (float)(numerator/denominator);
        BigDecimal bigDecimal = new BigDecimal(Float.toString(result));
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.floatValue();
    }
    
    public float CalculateFormula(float a, float b, float c, float d, float x){
        _a = a;
        _b = b;
        _c = c;
        _d = d;
        return CalculateFormula(x);
    }

    public float getA() {
        return _a;
    }

    public void setA(float a) {
        _a = a;
    }

    public float getB() {
        return _b;
    }

    public void setB(float b) {
        _b = b;
    }

    public float getC() {
        return _c;
    }

    public void setC(float c) {
        _c = c;
    }

    public float getD() {
        return _d;
    }

    public void setD(float d) {
        _d = d;
    }
    
}
