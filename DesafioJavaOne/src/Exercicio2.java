
public class Exercicio2 {
	
	double celsius;
	double fahrenheit;
	
	void celsiusParaFahrenheit() {
		fahrenheit = celsius * 9 / 5 + 32;
	}
	
	void fahrenheitParaCelsius() {
		celsius = 5 / 9 * (fahrenheit - 32);
	}
}
