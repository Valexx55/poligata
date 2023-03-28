package proyecto1;

import java.util.List;

public class Planeta extends Astro{
	
	private long distancia_sol;
	private long orbita_sol;
	private boolean tiene_satelites;
	
	private List<Satelite> lista_satelites;

	@Override
	public void muestra() {
		System.out.println("PLANETA " + this.getNombre());
		if (this.tiene_satelites)
		{
			for (Satelite s : lista_satelites)
			{
				System.out.println("SATELITE " + s.getNombre());
			}
		}
		
	}

	public long getDistancia_sol() {
		return distancia_sol;
	}

	public void setDistancia_sol(long distancia_sol) {
		this.distancia_sol = distancia_sol;
	}

	public long getOrbita_sol() {
		return orbita_sol;
	}

	public void setOrbita_sol(long orbita_sol) {
		this.orbita_sol = orbita_sol;
	}

	public boolean isTiene_satelites() {
		return tiene_satelites;
	}

	public void setTiene_satelites(boolean tiene_satelites) {
		this.tiene_satelites = tiene_satelites;
	}

	public List<Satelite> getLista_satelites() {
		return lista_satelites;
	}

	public void setLista_satelites(List<Satelite> lista_satelites) {
		this.lista_satelites = lista_satelites;
	}

	public Planeta(String nombre,long radio, long rotacion, long masa, int temperatura, float gravedad, long distancia_sol,
			long orbita_sol, boolean tiene_satelites, List<Satelite> lista_satelites) {
		super(nombre, radio, rotacion, masa, temperatura, gravedad);
		this.distancia_sol = distancia_sol;
		this.orbita_sol = orbita_sol;
		this.tiene_satelites = tiene_satelites;
		this.lista_satelites = lista_satelites;
	}

	public Planeta(String nombre, long radio, long rotacion, long masa, int temperatura, float gravedad) {
		super(nombre, radio, rotacion, masa, temperatura, gravedad);
	}

		

}
