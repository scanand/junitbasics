package com.soagile.testspring.basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by soagile-pc on 15/09/2016.
 */
public class SetupAndTeardownTest {

    @BeforeClass
    public static void beforeAllTestMethods() {
        System.out.println("Invoked once before all test methods");
    }

    @Before
    public void beforeEachTestMethod() {
        System.out.println("Invoked before each test method");
    }

    @After
    public void afterEachTestMethod() {
        System.out.println("Invoked after each test method");
    }

    @AfterClass
    public static void afterAllTestMethods() {
        System.out.println("Invoked once after all test methods");
    }

    @Test
    public void testOne() {
        System.out.println("Test One");
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two");
    }

}
