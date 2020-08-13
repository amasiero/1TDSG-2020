
public class Impar implements Predicado {

	@Override
	public boolean valida(Integer numero) {
		return numero % 2 == 1;
	}

}
