package com.soagile.testspring.withsuites;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.runners.Suite.*;

/**
 * Created by soagile-pc on 15/09/2016.
 */
@Category(value = CategoryB.class)
public class BTest {

    @Test
    public void testA() {
        System.out.print("THis is category B Test");
    }
}
