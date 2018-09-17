import java.util.List;

public class Pais {
	
	private String idPais;
	private String nombre;
	private List<Ciudad> ListCiudades;
	
	
	public Pais(String idPais, String nombre) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
	}
	
	public String getIdPais() {
		return idPais;
	}
	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getListCiudades() {
		return ListCiudades;
	}

	public void setListCiudades(List<Ciudad> listCiudades) {
		ListCiudades = listCiudades;
	}
	
	

}
