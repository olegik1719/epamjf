package com.github.olegik1719.epamjf.hw01.task04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void max() {
        assertEquals(157, Main.max(12,22,123,34,12,43),0.00000001);
    }
}