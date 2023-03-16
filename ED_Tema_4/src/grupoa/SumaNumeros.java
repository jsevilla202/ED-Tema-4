package grupoa;

public class SumaNumeros {

	public int sumaNumeros(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
				suma += i;
		}
		return suma;
	}
}
