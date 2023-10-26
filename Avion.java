public class Avion {

	private Aeropuerto aeropuerto;
	private String nombre;
	private int anio;
	private double kmRecorridos;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return this.anio;
	}

	/**
	 * 
	 * @param anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getKmRecorridos() {
		return this.kmRecorridos;
	}

	/**
	 * 
	 * @param kmRecorridos
	 */
	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

}