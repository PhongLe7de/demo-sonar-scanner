package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {

    @Test
    void testSum() {
        assertEquals(5, Caculator.sum(2, 3));
        assertEquals(-1, Caculator.sum(-2, 1));
    }

    @Test
    void testSubstract() {
        assertEquals(2, Caculator.substract(5, 3));
        assertEquals(-3, Caculator.substract(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(6, Caculator.multiply(2, 3));
        assertEquals(-2, Caculator.multiply(-2, 1));
    }

    @Test
    void testDivide() {
        assertEquals(2, Caculator.divide(6, 3));
        assertEquals(-2, Caculator.divide(-4, 2));
    }

}



