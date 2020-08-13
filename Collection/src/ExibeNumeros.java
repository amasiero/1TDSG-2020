import java.util.function.Consumer;

public class ExibeNumeros implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}
