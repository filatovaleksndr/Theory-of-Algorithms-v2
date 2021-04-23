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
        
        assertEquals(Float.MAX_VALUE, calculator.CalculateFormula(0));
        assertEquals(0, calculator.CalculateFormula(0.5f));
        assertEquals(0.05f, calculator.CalculateFormula(2));
    }
//    
//    @Test
//    void Laba3Test()
//    {
//        
//    }
}
