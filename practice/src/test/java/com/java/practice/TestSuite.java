package com.java.practice;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
	TestOperation.class,
	Recerse_array.class
})
public class TestSuite {

}
