package com.sergio.javacourse.pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PkgTest {

	/**
	 * Look for the correct Pkg class in the package com.sergio.javacourse.pkg which returns 30. 
	 */
	@Test
	public void testPkg() {
		assertEquals(30, com.sergio.javacourse.pkg.three.Pkg.one());
	}
	
	/**
	 * Look for the correct Pkg class in the package com.sergio.javacourse.pkg which returns 15. 
	 */
	@Test
	public void testTwo() {
		assertEquals(15, com.sergio.javacourse.pkg.one.Pkg.one());
	}
	
	/**
	 * Look for the correct Pkg class in the package com.sergio.javacourse.pkg which returns 10. 
	 */
	@Test
	public void testThree() {
		assertEquals(10, com.sergio.javacourse.pkg.Pkg.one());
	}
	
	/**
	 * Look for the correct Pkg class in the package com.sergio.javacourse.pkg which returns 20. 
	 */
	@Test
	public void testFour() {
		assertEquals(20, com.sergio.javacourse.pkg.two.Pkg.one());
	}
}
