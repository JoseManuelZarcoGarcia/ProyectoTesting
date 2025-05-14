package serviciosTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import servicios.*;

public class MathUtilsTest {
	
	MathUtils mut = new MathUtils();
	
	@Test
	public void addCorrectoTest() {
		int resultadoAdd = mut.add(5, 4);
		assertEquals(9, resultadoAdd);
	}
	
	// La idea del metodo es que de error ya que da un resultado erróneo
	@Test
	public void addErrorTest() {
		int resultadoAdd = mut.add(5, 4);
		assertEquals(47, resultadoAdd);
	}
	
	// La idea del metodo es que de error ya que da un resultado no puede dar decimales
		@Test
		public void addErrorDecimalTest() {
			int resultadoAdd = mut.add(5, 4);
			assertEquals(47,5, resultadoAdd);
		}
	
	@Test
	public void divideCorrectoTest() {
		int resultadoDivide = mut.divide(10, 2);
		assertEquals(5, resultadoDivide);
	}
	
	// La idea del metodo es que de error ya que da un resultado erróneo
	@Test
	public void divideErrorTest() {
		int resultadoDivide = mut.divide(10, 2);
		assertEquals(48, resultadoDivide);
	}
	
	// La idea del metodo es que de error ya que un int no premite decimales
		@Test
		public void divideErrorDesimalTest() {
			int resultadoDivide = mut.divide(10, 2);
			assertEquals(48,5, resultadoDivide);
		}
	
	// La idea del metodo es que de error ya que no puede dar un resultado negativo
	@Test
	public void factorialNegativoTest() {
		int resultadoFactorial = mut.factorial(4);
		assertEquals(-4, resultadoFactorial);
	}
	
	// La idea del metodo es que de error ya que no puede dar 0
	@Test
	public void factorial0Test() {
		int resultadoFactorial = mut.factorial(4);
		assertEquals(0, resultadoFactorial);
	}
	
	@Test
	public void factorialCorrectoTest() {
		int resultadoFactorial = mut.factorial(4);
		assertEquals(24, resultadoFactorial);
	}
	

}
