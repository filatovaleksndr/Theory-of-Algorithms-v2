/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR11.Lab6;

/**
 *
 * @author Alex
 */
public class Digits {
    private String _digits;
    private int _digitsNumber;
    
    public Digits(int number)
    {
        _digits = Integer.toString(number);
        _digitsNumber = _digits.length();
    }
    
    public String OutputDigits()
    {
        int i = 0;
        return OutputDigitsInner(0);
    }
    
    private String OutputDigitsInner(int i)
    {
        if(i == _digitsNumber)
            return "";
        return _digits.charAt(i) + " " + OutputDigitsInner(i + 1);
    }
}
