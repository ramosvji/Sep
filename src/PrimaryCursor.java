
public class PrimaryCursor {
	
	String idContinente;
	String nombreContinente;
	String idPais;
	String nombrePais;
	String idCiudad;
	String ciudad;
	
	public PrimaryCursor(String idContinente, String nombreContinente, String idPais, String nombrePais,
			String idCiudad, String ciudad) {
		super();
		this.idContinente = idContinente;
		this.nombreContinente = nombreContinente;
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.idCiudad = idCiudad;
		this.ciudad = ciudad;
	}
	
	public String getIdContinente() {
		return idContinente;
	}
	public void setIdContinente(String idContinente) {
		this.idContinente = idContinente;
	}
	public String getNombreContinente() {
		return nombreContinente;
	}
	public void setNombreContinente(String nombreContinente) {
		this.nombreContinente = nombreContinente;
	}
	public String getIdPais() {
		return idPais;
	}
	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}
	public String getNombrePais() {
		return nombrePais;
	}
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	public String getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(String idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((idCiudad == null) ? 0 : idCiudad.hashCode());
		result = prime * result + ((idContinente == null) ? 0 : idContinente.hashCode());
		result = prime * result + ((idPais == null) ? 0 : idPais.hashCode());
		result = prime * result + ((nombreContinente == null) ? 0 : nombreContinente.hashCode());
		result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimaryCursor other = (PrimaryCursor) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (idCiudad == null) {
			if (other.idCiudad != null)
				return false;
		} else if (!idCiudad.equals(other.idCiudad))
			return false;
		if (idContinente == null) {
			if (other.idContinente != null)
				return false;
		} else if (!idContinente.equals(other.idContinente))
			return false;
		if (idPais == null) {
			if (other.idPais != null)
				return false;
		} else if (!idPais.equals(other.idPais))
			return false;
		if (nombreContinente == null) {
			if (other.nombreContinente != null)
				return false;
		} else if (!nombreContinente.equals(other.nombreContinente))
			return false;
		if (nombrePais == null) {
			if (other.nombrePais != null)
				return false;
		} else if (!nombrePais.equals(other.nombrePais))
			return false;
		return true;
	}
	
	

}
