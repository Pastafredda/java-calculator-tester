package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculatorTest {

    @Test
    @DisplayName("Addizione")
    void add() {
        assertEquals(8,4+4, "Il risultato deve essere 8");
    }

    @Test
    @DisplayName("Sottrazione")
    void subtract() {
        assertEquals(10, 15-5, "Il risultato deve essere 10");
    }

    @Test
    @DisplayName("Divisione")
    void divide() {
        assertEquals(3, 12/4, "Il risultato deve essere 3");
    }

    @Test
    @DisplayName("Eccezione divisione per 0")
    void divideException(){
        assertThrows(IllegalArgumentException.class, ()->{
            Calculator.divide(10,0);
        });
    }
    @Test
    @DisplayName("Moltiplicazione")
    void multiply() {
        assertEquals(20, 5*4, "Il risultato deve essere 20");
    }
}