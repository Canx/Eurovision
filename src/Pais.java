import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pais {
	private String nombre;
	private Integer votosRecibidos;
	private List<Integer> puntuaciones = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,10,12));
	private List<Pais> paises;
	private List<Pais> paisesVotados = new ArrayList<Pais>();
	
	public Pais(String nombre, List<Pais> paises) {
		this.setNombre(nombre);
		this.paises = paises;
		this.votosRecibidos = 0;
	}
	
	public List<Voto> votar() {
		List<Voto> votos = new ArrayList<Voto>();
		
		Random rand = new Random();
		System.out.println("\nVa a votar " + this.nombre);
		for(Integer puntuacion : puntuaciones) {
			 Pais pais = this.paises.get(rand.nextInt(paises.size()));
			 
			 while (paisesVotados.contains(pais) || pais == this) {
				 pais = this.paises.get(rand.nextInt(paises.size()));
			 }
			 System.out.println(pais.getNombre() + ", " + puntuacion + " puntos.");
			 this.paisesVotados.add(pais);
			 votos.add(new Voto(pais, puntuacion));
		}
		return votos;
	}
	
	public void add(Integer puntuacion) {
		this.votosRecibidos += puntuacion;
	}

	public Integer getVotosRecibidos() {
		return votosRecibidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNombre() + ", " + this.getVotosRecibidos() + " puntos.";
	}

}
