package proyecto1;

public abstract class Astro {
	
	private String nombre;
	private long radio;
	private long rotacion;
	private long masa;
	private int temperatura;
	private float gravedad;

	public abstract void muestra();

	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public long getRadio() {
		return radio;
	}

	public void setRadio(long radio) {
		this.radio = radio;
	}

	public long getRotacion() {
		return rotacion;
	}

	public void setRotacion(long rotacion) {
		this.rotacion = rotacion;
	}

	public long getMasa() {
		return masa;
	}

	public void setMasa(long masa) {
		this.masa = masa;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public float getGravedad() {
		return gravedad;
	}

	public void setGravedad(float gravedad) {
		this.gravedad = gravedad;
	}

	public Astro(String nombre,long radio, long rotacion, long masa, int temperatura, float gravedad) {
		super();
		this.nombre = nombre;
		this.radio = radio;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}

	public Astro() {
		super();
	}



	
	
}
