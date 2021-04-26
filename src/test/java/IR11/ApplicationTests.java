package IR11;
import IR11.Lab2.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Test
    void contextLoads() {
    }

    @Test
    void Laba2Test()
    {
        Calculator calculator = new Calculator();
        
        assertEquals(Float.MAX_VALUE, calculator.CalculateFormula(0f));
        assertEquals(0, calculator.CalculateFormula(0.5f));
        assertEquals(0.05f, calculator.CalculateFormula(2f));
    }
    
    @Test
    void Laba3Test()
    {
        IR11.Lab3.Calculator calculator = new IR11.Lab3.Calculator(new int[]{
            6, 74, 54, 30, 29, 36, 67, 50, 76, 99, 14, 66, 48, 34, 18, 77, 58,
            88, 77, 4, 81, 68, 66, 5, 56, 43, 93, 26, 71, 69, 52, 16, 75, 77, 37,
            32, 46, 22, 94, 48, 86, 91, 89, 11, 20, 23, 59, 23, 32, 30, 17, 10, 0,
            44, 4, 28, 77, 38, 21, 21, 35, 46, 98, 6, 65, 52
        });
        assertEquals("[99, 98, 94]", calculator.BiggestNumbers(3));

        calculator = new IR11.Lab3.Calculator(new int[]{
            3, 53, 56, 77, 59, 45, 1, 96, 47, 43, 42, 29, 31, 62, 87, 28, 51, 0, 
            23, 50, 62, 82, 96, 54, 2, 96, 40, 36, 29, 66, 28, 61, 80, 24, 21, 33,
            85, 23, 6, 6, 86, 60, 52, 25, 2, 74, 51, 58, 7, 42, 91, 62, 87, 53,
            80, 11, 0, 11, 74, 54, 48, 92, 39, 25, 65, 86
        });
        assertEquals("[96, 96, 96]", calculator.BiggestNumbers(3));
        
        calculator = new IR11.Lab3.Calculator(new int[]{
            93, 53, 91, 77, 79, 99, 84, 22, 86, 31, 77, 2, 82, 66, 51, 93, 22, 
            63, 34, 9, 26, 86, 68, 17, 85, 93, 13, 69, 97, 20, 97, 54, 59, 98, 
            57, 26, 60, 50, 4, 26, 85, 52, 32, 86, 87, 28, 90, 1, 29, 74, 99, 
            99, 69, 62, 35, 20, 61, 32, 62, 0, 55, 50, 41, 73, 86, 16
        });
        assertEquals("[99, 99, 99]", calculator.BiggestNumbers(3));
    }
}
