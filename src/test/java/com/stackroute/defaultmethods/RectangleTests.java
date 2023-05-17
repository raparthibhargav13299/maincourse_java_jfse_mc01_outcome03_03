package com.stackroute.defaultmethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTestsTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() { rectangle=new Rectangle();
    }

    @AfterEach
    void tearDown() { rectangle=null;
    }
    @Test
    void ComputeRectangleArea()
    {
        assertEquals(10,rectangle.getArea());
    }

}