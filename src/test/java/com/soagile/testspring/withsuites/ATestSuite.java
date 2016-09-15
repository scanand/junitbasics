package com.soagile.testspring.withsuites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by soagile-pc on 15/09/2016.
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(CategoryA.class)
@Suite.SuiteClasses({ATest.class, BTest.class})
public class ATestSuite {

}
