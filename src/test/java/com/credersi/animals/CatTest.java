package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void catMinusOneLife() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		cat.runs();
		if(cat.howHungry() <= 100);
		assertEquals(cat.howHungry(), 50);
	}	
		
	@Test
	public void catMinusOFourLives() {
		Cat cat = new Cat();
		for(int i = 0; i < 4; i++) {
		cat.runs();
		cat.runs();
		}
		assertTrue(cat.isAlive());
	}
	
	@Test
	public void catMinusNineLives() {
		Cat cat = new Cat();
		for(int i = 0; i < 9; i++) {
		cat.runs();
		cat.runs();
		}
		assertTrue(!cat.isAlive());
	}
}
/*
@Test
public void testCatDead() {
	Cat cat = new Cat();
	assert (cat.isAlive());
	cat.runs();
	cat.runs();
	if(cat.howHungry() <= 100);
	assertTrue(cat.isAlive() == false);
*/