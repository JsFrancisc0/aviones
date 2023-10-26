import java.util.*;

public class Vuelo {

	private Ciudad ciudadOrigen;
	private Collection<Piloto> pilotos;
	private Collection<Pasajero> pasajeros;
	private Ciudad ciudadDestino;
	private Date horaVuelo;

	public Date getHoraVuelo() {
		return this.horaVuelo;
	}

	/**
	 * 
	 * @param horaVuelo
	 */
	public void setHoraVuelo(Date horaVuelo) {
		this.horaVuelo = horaVuelo;
	}

}