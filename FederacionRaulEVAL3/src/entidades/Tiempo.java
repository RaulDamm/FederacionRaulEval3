package entidades;

public class Tiempo {
	
	private Participante participante;
	private Prueba prueba;
	private int hora;
	private int minutos;
	private int segundos;
	private int centesimas;

	public Tiempo() {
	
	}

	public Tiempo(Participante participante, Prueba prueba, int hora, int minutos, int segundos, int centesimas ) {
		this.participante=participante;
		this.prueba=prueba;
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
		this.centesimas=centesimas;

	}

	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getCentesimas() {
		return centesimas;
	}

	public void setCentesimas(int centesimas) {
		this.centesimas = centesimas;
	}

	@Override
	public String toString() {
		return "Tiempo=" + hora + ":" + minutos + ":" + segundos + "," + centesimas;
	}


	
	
}
