import javax.swing.JOptionPane;

public class TesteVoo {

	public static void main(String[] args) {

		int numeroVoo = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do voo"));
		
		String dataString = JOptionPane.showInputDialog("Informe a data do voo (dd/MM/aaaa)");
		
		String[] valoresSeparados = dataString.split("/");
		
		int dia = Integer.parseInt(valoresSeparados[0]);
		int mes = Integer.parseInt(valoresSeparados[1]);
		int ano = Integer.parseInt(valoresSeparados[2]);
		
		Voo voo = new Voo(numeroVoo, new Data(dia, mes, ano));
		
		JOptionPane.showMessageDialog(null, "Temos " + voo.vagas() + " vagas disponíveis.");
		

	}

}
