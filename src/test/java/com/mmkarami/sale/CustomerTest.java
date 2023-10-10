package com.mmkarami.sale;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CustomerTest {

	@Test
	public void testEqualsBySameObjectReference_whenOperandsHaveSameReference_thenItMustReturnsTrue() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = customer0;

		// Act
		boolean result0 = customer0.equals(customer1);
		boolean result1 = customer1.equals(customer0);

		// Assert
		assertEquals(true, result0);
		assertEquals(true, result1);
	}

	@Test
	public void testEqualsByDifferentObjectReferenceButSameAttributesVales_whenOperandsHaveDifferentReferencesBustSameAttributesValue_thenItMustReturnsTrue() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = new Customer("Google", 111);

		// Act
		boolean result0 = customer0.equals(customer1);
		boolean result1 = customer1.equals(customer0);

		// Assert
		assertEquals(true, result0);
		assertEquals(true, result1);
	}

	@Test
	public void testEqualsByDifferentObjectTypes_whenOperandsHaveDifferentTyes_thenItMustReturnsFalse() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		String customer1 = "Google";

		// Act
		boolean result0 = customer0.equals(customer1);
		boolean result1 = customer1.equals(customer0);

		// Assert
		assertEquals(false, result0);
		assertEquals(false, result1);
	}

	@Test
	public void testEqualsByDifferentObjectReferenceAndAttributesVales_whenOperandsHaveDifferentReferencesAndAttributesValue_thenItMustReturnsFalse() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = new Customer("IBM", 111);

		// Act
		boolean result0 = customer0.equals(customer1);
		boolean result1 = customer1.equals(customer0);

		// Assert
		assertEquals(false, result0);
		assertEquals(false, result1);
	}

	@Test
	public void testEqualsByOneOperandAreNull_whenOneOperandsAreNull_thenItMustReturnsTrue() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = null;

		// Act
		boolean result0 = customer0.equals(customer1);

		// Assert
		assertEquals(false, result0);
	}

	@Test
	public void testHashCodeBySameObjectReferenceAndAttributesVales_whenVariablesHaveSameReference_thenTheirHashCodeMustBeSame() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = customer0;

		// Act
		int result0 = customer0.hashCode();
		int result1 = customer1.hashCode();

		// Assert
		assertEquals(true, result0 == result1);
	}

	@Test
	public void testHashCodeByDifferentObjectReferenceAndAttributesVales_whenVariablesHaveDifferentReferencesAndSameValues_thenTheirHashCodeMustBeSame() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = new Customer("Google", 111);

		// Act
		int result0 = customer0.hashCode();
		int result1 = customer1.hashCode();

		// Assert
		assertEquals(true, result0 == result1);
	}

	@Test
	public void testHashCodeByDifferentObjectReferenceAndDifferentAttributesVales_whenVariablesHaveDifferentReferencesAndDifferentValues_thenTheirHashCodeMustBeDifferent() {

		// Arrange
		Customer customer0 = new Customer("Google", 111);
		Customer customer1 = new Customer("IBM", 111);

		// Act
		int result0 = customer0.hashCode();
		int result1 = customer1.hashCode();

		// Assert
		assertEquals(false, result0 == result1);
	}
}