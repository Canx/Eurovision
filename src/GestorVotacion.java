import java.util.ArrayList;
import java.util.List;

public class GestorVotacion {
	public static final String[] nombrePaises = { "España", "Francia", "Italia", "Portugal", "Andorra", "Alemania", "Noruega", "Finlandia", "Israel", "Polonia", "Chequia", "Belgica", "Holanda", "Suiza" };
	public static void main(String args[]) {
		// 1.- Generar paises
		List<Pais> paises = new ArrayList<Pais>();
		
		for(String nombre : nombrePaises) {
			paises.add(new Pais(nombre, paises));
		}
		
		// 2.- Cada pais vota
		for(Pais pais : paises) {
			for(Voto voto : pais.votar()) {
				voto.actualizar();
			}
		}
		
		// 3.- Ordenamos por puntuacion puntuaciones
		paises.sort((Pais p1, Pais p2)-> p2.getVotosRecibidos()-p1.getVotosRecibidos());
		
		// 4.- Imprimimos
		System.out.println("\nTabla de puntaciones final:");
		for(Pais pais : paises) {
			System.out.println(pais);
		}
		
		
	}

}
