package org.diginamic.demo_tests_unitaires;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		assertEquals(StringUtils.levenshteinDistance("chat", "chats"), 1);
		assertEquals(StringUtils.levenshteinDistance("aviron", "avion"), 1);
		assertEquals(StringUtils.levenshteinDistance("distance", "instance"), 2);
		assertEquals(StringUtils.levenshteinDistance("chien", "chine"), 2);
		assertEquals(StringUtils.levenshteinDistance("", "a"), 1);
		assertEquals(StringUtils.levenshteinDistance("a", ""), 1);
		
	}
	
	@Test
	public void testLevenshteinDistanceAdd() {assertEquals(StringUtils.levenshteinDistance("chat", "chats"), 1);}
	
	@Test
	public void testLevenshteinDistanceRemove() {assertEquals(StringUtils.levenshteinDistance("aviron", "avion"), 1);}
	
	@Test
	public void testLevenshteinDistanceChange() {assertEquals(StringUtils.levenshteinDistance("distance", "instance"), 2);}
	
	@Test
	public void testLevenshteinDistanceMove() {assertEquals(StringUtils.levenshteinDistance("chien", "chine"), 2);}
	
	@Test
	public void testLevenshteinDistanceFromEmpty() {assertEquals(StringUtils.levenshteinDistance("", "a"), 1);}
	
	@Test
	public void testLevenshteinDistanceToEmpty() {assertEquals(StringUtils.levenshteinDistance("a", ""), 1);}
	
	@Test
	public void testLevenshteinDistanceFromNull() {assertEquals(StringUtils.levenshteinDistance(null, "a"), 1);}
	
	@Test
	public void testLevenshteinDistanceToNull() {assertEquals(StringUtils.levenshteinDistance("a", null), 1);}

}
