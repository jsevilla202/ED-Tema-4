package grupob;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("cuentaImpares")
	void testCuentaImpares(int num, int esperado) {
		
		CuentaImpares cuenta = new CuentaImpares();
		
		int resultado = cuenta.cuentaImpares(num);
		
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> cuentaImpares(){
		return Stream.of(
				Arguments.of(1, 0),
				Arguments.of(2, 1),
				Arguments.of(3, 1),
				Arguments.of(11, 5),
				Arguments.of(0, 0),
				Arguments.of(-1, 0));
	}

}
