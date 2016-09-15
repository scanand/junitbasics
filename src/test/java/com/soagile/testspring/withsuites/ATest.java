package com.soagile.testspring.withsuites;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by soagile-pc on 15/09/2016.
 */
@Category(value = CategoryA.class)
public class ATest {

    @Test
    public void testA() {
        System.out.print("THis is category A Test");
    }
}
