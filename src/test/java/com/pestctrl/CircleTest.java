package com.pestctrl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c;

    @BeforeEach
    void setUp() {
        c = new Circle(2);
    }

    @AfterEach
    void tearDown() {
        return;
    }

    @Test
    void testArea() {
        assert(c.area() == 4);
    }

    @Test
    void testPerimeter() {
        assert(c.perimeter() == 8);
    }
}