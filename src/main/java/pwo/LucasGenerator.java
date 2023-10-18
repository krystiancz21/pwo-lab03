package pwo;
 
import java.math.BigDecimal;
 
public class LucasGenerator {
 
    private int lastIndex = 0;
    private BigDecimal current = new BigDecimal(0);
    private BigDecimal lucasN = new BigDecimal(3);  // Poprawiona inicjalizacja
    private BigDecimal lucasNMinus1 = new BigDecimal(4);  // Poprawiona inicjalizacja
    private BigDecimal lucasNMinus2 = new BigDecimal(7);  // Poprawiona inicjalizacja
 
    public void reset() {
        lastIndex = 0;
        current = new BigDecimal(0);
        lucasN = new BigDecimal(3);  // Poprawiona inicjalizacja
        lucasNMinus1 = new BigDecimal(4);  // Poprawiona inicjalizacja
        lucasNMinus2 = new BigDecimal(7);  // Poprawiona inicjalizacja
    }
 
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            lucasN = lucasNMinus1.add(lucasNMinus2);
            lucasNMinus2 = lucasNMinus1;
            lucasNMinus1 = lucasN;
            current = lucasN;
        } else if (lastIndex == 1) {
            current = new BigDecimal(4);  // Poprawiona inicjalizacja
        } else {
            current = new BigDecimal(3);  // Poprawiona inicjalizacja
        }
        lastIndex++;
        return current;
    }
 
    public BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}
