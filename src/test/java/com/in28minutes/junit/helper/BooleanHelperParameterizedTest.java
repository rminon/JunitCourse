package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BooleanHelperParameterizedTest {
	StringHelper helper = new StringHelper();
	
	private String input;
	
	public BooleanHelperParameterizedTest(String input) {
		this.input = input;
	}

	@Parameters
	public static Collection <String> getConditions(){
		String input[]= {"ABDC", "ABAB"};
		return Arrays.asList(input);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
}
