package org.jabref.gui.util.comparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumericFieldComparatorTest {

    private final NumericFieldComparator comparator = new NumericFieldComparator();

    @Test
    public void compareTwoNumericInputs() {
        assertEquals(2, comparator.compare("4", "2"));
    }

    @Test
    public void compareTwoNullInputs() {
        assertEquals(0, comparator.compare(null, null));
    }

    @Test
    public void compareTwoInputsWithFirstNull() {
        assertEquals(-1, comparator.compare(null, "2"));
    }

    @Test
    public void compareTwoInputsWithSecondNull() {
        assertEquals(1, comparator.compare("4", null));
    }

    @Test
    public void compareTwoNotNumericInputs() {
        assertEquals(-32, comparator.compare("HELLO", "hello"));
    }

    @Test
    public void compareStringWithInteger() {
        assertEquals(-1, comparator.compare("hi", "2"));
    }

    @Test
    public void compareIntegerWithString() {
        assertEquals(1, comparator.compare("4", "hi"));
    }

    @Test
    public void compareNegativeInteger() {
        assertEquals(1, comparator.compare("-4", "-5"));
    }

    @Test
    public void compareWithMinusString() {
        assertEquals(-1, comparator.compare("-", "-5"));
    }

    @Test
    public void compareWithPlusString() {
        assertEquals(-1, comparator.compare("+", "-5"));
    }

    @Test
    public void compareWordWithMinus() {
        assertEquals(-1, comparator.compare("-abc", "-5"));
    }
    @Test
    public void compareTwoInputsWithFirstNullAndSeven() { // Teste1 Eduardo null e 7
        assertEquals(-1, comparator.compare(null, "7"));
    }

    @Test
    public void compareNullInputs() { // Teste2 Eduardo
        assertEquals(0, comparator.compare(null, null));
    }

    @Test
    public void compareTwoInputsWithFirstSevenAndNull() { // Teste3 Eduardo 7 e null
        assertEquals(-1, comparator.compare("7", null));
    }

    @Test
    public void compareTwoInputsWithFirstTextoAndTwo() { // Teste4 Eduardo texto e null
        assertEquals(-1, comparator.compare("texto", null));
    }

    @Test
    public void compareTwoInputsWithFirstEightAndOi() { // Teste5 Eduardo oito e oi
        assertEquals(-1, comparator.compare("8", "oi"));
    }

    @Test
    public void compareTwoInputsWithFirstNegativeEightAndFive() { // Teste6 Eduardo -8 e -5
        assertEquals(-1, comparator.compare("-8", "-5"));
    }

    @Test
    public void compareTwoInputsWithNegativeTextAndTen() { // Teste7 Eduardo -texto e -10
        assertEquals(-1, comparator.compare("-texto", "-10"));
    }

}

