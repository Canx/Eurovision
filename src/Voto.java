
public class Voto {
	Pais pais;
	Integer puntuacion;
	
	public Voto(Pais pais, Integer puntuacion) {
		this.pais = pais;
		this.puntuacion = puntuacion;
	}

	public void actualizar() {
		this.pais.add(this.puntuacion);	
	}

}
