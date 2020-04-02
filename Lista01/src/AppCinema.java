
public class AppCinema {

	public static void main(String[] args) {
		Sala sala = new Sala(20);
		Cinema cinema =  new Cinema(sala, 10.5);
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		cinema.vendeIngresso();
		System.out.println(cinema.finalizaSessao());
	}
}
