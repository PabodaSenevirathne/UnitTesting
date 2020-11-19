package com.example.UnitTesting;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class AddNumbersTest {


    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");

    }

    @Test
    public void twoAndThreeIsFive() throws Exception {
        final long result = new AddNumbers().add(2, 3);
        assertThat(result, is(5L));
    }

    @Test
    public void twoAndZeroIsTwo() throws Exception {
        final long result = new  AddNumbers().add(2, 0);
        assertThat(result, is(2L));
    }

    @Test
    public void twoAndMinusTwoIsZero() throws Exception {
        final long result = new  AddNumbers().add(2, -2);
        assertThat(result, is(0L));
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new  AddNumbers().subtract(3, 2);
        assertThat(result, is(1L));
    }

    @Test
    public void threeMinusThreeIsZero() throws Exception {
        final long result = new  AddNumbers().subtract(3, 3);
        assertThat(result, is(0L));
    }

    @Test
    public void threeMinusMinusThreeIsSix() throws Exception {
        final long result = new  AddNumbers().subtract(3, -3);
        assertThat(result, is(6L));
    }

    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new  AddNumbers().multiply(3, 3);
        assertThat(result, is(9L));
    }

    @Test
    public void threeXZeroIsZero() throws Exception {
        final long result = new  AddNumbers().multiply(3, 0);
        assertThat(result, is(0L));
    }

    @Test
    public void threeXMinusThreeIsMinusNine() throws Exception {
        final long result = new  AddNumbers().multiply(3, -3);
        assertThat(result, is(-9L));
    }


    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }

}
