package com.matillion.task1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringComparisonTest
{
    @Test
    public void passSameStringsGetCharDiffCount0()
    {
        StringComparison stringComparison = new StringComparison();
        int count = stringComparison.countNumberOfCharDifferences("Hello","Hello");
        assertEquals(0, count);
    }
}
