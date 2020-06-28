package nexeo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class SandPileNexeoTest {

	@Test
	public void testAddSandOneTimeTo3_3() {
		int[][] pile = {{3,2,1},{3,3,2},{1,3,1}};
		SandPileNexeo.addSand(pile, 1);
		int[][] expectedPile = {{1,0,2},{1,3,3},{3,0,2}};
		assertArrayEquals(expectedPile,pile);
	}
	@Test
	public void testAddSandFiveTimeTo3_3() {
		int[][] pile = {{3,2,1},{3,3,2},{1,3,1}};
		SandPileNexeo.addSand(pile, 5);
		int[][] expectedPile = {{1,2,3},{3,0,1},{3,2,3}};
		assertArrayEquals(expectedPile,pile);
	}
	@Test
	public void testAddSandOneTimeTo5_5() {
		int[][] pile = {{1,2,1,3,1},{3,1,3,1,3},{1,3,3,1,2},{1,1,1,1,1},{1,1,1,1,1}};
		SandPileNexeo.addSand(pile, 1);
		int[][] expectedPile = {{1,2,2,3,1},{3,3,0,2,3},{2,0,2,2,2},{1,2,2,1,1},{1,1,1,1,1}};
		assertArrayEquals(expectedPile,pile);
	}
	@Test
	public void testAddSandThreeTimeTo5_5() {
		int[][] pile = {{1,2,1,3,1},{3,1,3,1,3},{1,3,3,1,2},{1,1,1,1,1},{1,1,1,1,1}};
		SandPileNexeo.addSand(pile, 3);
		int[][] expectedPile = {{1,2,2,3,1},{3,3,1,2,3},{2,1,0,3,2},{1,2,3,1,1},{1,1,1,1,1}};
		assertArrayEquals(expectedPile,pile);
	}
}
