package grupoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("sumaNumeros")
	void testSumaNumeros(int num, int esperado) {
		
		SumaNumeros suma = new SumaNumeros();
		
		int resultado = suma.sumaNumeros(num);
		
		assertEquals(esperado, resultado);
	}
	
	private static Stream<Arguments> sumaNumeros(){
		return Stream.of(
				Arguments.of(1, 0),
				Arguments.of(2, 1),
				Arguments.of(3, 1),
				Arguments.of(11, 36),
				Arguments.of(0, 0),
				Arguments.of(-1, 0));
		
	}

}
