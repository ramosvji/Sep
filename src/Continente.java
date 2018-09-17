import java.util.List;

public class Continente {
	
	public String idContinente;
	public String nombre;
	public List<Pais> ListPaises;
	
	public Continente(String idContinente, String nombre) {
		super();
		this.idContinente = idContinente;
		this.nombre = nombre;
	}
	
	public String getIdContinente() {
		return idContinente;
	}
	
	public void setIdContinente(String idContinente) {
		this.idContinente = idContinente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pais> getListPaises() {
		return ListPaises;
	}

	public void setListPaises(List<Pais> listPaises) {
		ListPaises = listPaises;
	}
	
	

}
