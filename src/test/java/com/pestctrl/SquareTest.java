package com.pestctrl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void CanaryTest() {
        assert(true);
    }

    @Test
    void testToString() {
        Square sq = new Square();
        assert(sq.toString() == "I am a square!");
    }
}