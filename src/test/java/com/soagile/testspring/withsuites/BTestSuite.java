package com.soagile.testspring.withsuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by soagile-pc on 15/09/2016.
 * RunWith(Categories) makes it selective test running as per marked by marker interfaces like CategoryB.class
 * RunWith(Suite) just runs all classes defined in SuiteClasses
 * There can be *only one* runner either BlockJUnit4ClassRunner, or Suite, which is specified by @RunWith
 *
 * BlockJUnit4ClassRunner is default runner and can be customised by rules
 */

@RunWith(Categories.class)
//@RunWith(Suite.class)
@Categories.IncludeCategory(CategoryB.class)
@SuiteClasses({ATest.class, BTest.class})
public class BTestSuite {

}
