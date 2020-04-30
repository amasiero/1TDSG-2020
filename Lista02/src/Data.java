
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		// Verifica dia entre 01 e 31
		boolean diaValido = dia > 0 && dia <= 31;
		// Verifica mes entre 01 e 12
		boolean mesValido = mes > 0 && mes <= 12;
		// Verifica ano a partir 1900
		boolean anoValido = ano >= 1900;
		// válido atribuo os parametro aos atributos
		if(diaValido && mesValido && anoValido) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
		// nao válido atribuo a data 01/01/0001 aos atributos
			this.dia = 01;
			this.mes = 01;
			this.ano = 0001;
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public String getMesExtenso() {
		
		switch(this.mes) {
			case 1:
				return "Janeiro";
			case 2:
				return "Fevereiro";
			case 3:
				return "Março";
			case 4:
				return "Abril";
			case 5:
				return "Maio";
			case 6:
				return "Junho";
			case 7:
				return "Julho";
			case 8:
				return "Agosto";
			case 9:
				return "Setembro";
			case 10:
				return "Outubro";
			case 11:
				return "Novembro";
			case 12:
				return "Dezembro";
			default:
				return "Indefinido";
		}
		
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public boolean isBissexto() {
		// Resto Divisao por 4
		int restoDiv4 = this.ano % 4;
		// Resto divisao por 100
		int restoDiv100 = this.ano % 100;
		// Sair com a comparacao
		return restoDiv4 == 0 && restoDiv100 != 0;
	}
	
	public Data clone() {
		return new Data(this.dia, this.mes, this.ano);
	}
	
	public int compara(Data data) {
		// Diferenca dia
		int diffDia = this.dia - data.getDia();
		// Diferenca mes
		int diffMes = this.mes - data.getMes();
		// Diferenca ano
		int diffAno = this.ano - data.getAno();
		// Comparo diferenca de ano com 0
		if (diffAno > 0) {
			return 1;
		} else if(diffAno < 0){
			return -1;
		}
		// Comparo diferenca de mes com 0
		if (diffMes > 0) {
			return 1;
		} else if (diffMes < 0){
			return -1;
		}
		// Comparo diferenca de dia com 0
		if (diffDia > 0) {
			return 1;
		} else if (diffDia < 0){
			return -1;
		}
		// Tudo igual 0
		return 0;
	}

}
