package com.pestctrl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square theSquare = null;

    @Test
    void CanaryTest() {
        assert(true);
    }

    @BeforeEach
    void setUp() {
        theSquare = new Square();
    }

    @AfterEach
    void tearDown() {
        return;
    }

    @Test
    void testToString() {
        assert(theSquare.toString() == "I am a square!");
    }

    @Test
    void testArea() {
        assert(theSquare.area() == 16);
    }

    @Test
    void testAreaBigger() {
        Square biggerSquare = new Square(8);
        assert(biggerSquare.area() == 64);
    }
}
