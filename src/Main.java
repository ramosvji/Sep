import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<PrimaryCursor> source= new ArrayList<PrimaryCursor>();
		source.add(new PrimaryCursor("AM","America","MX","México","Tol","Toluca"));
		source.add(new PrimaryCursor("AM","America","EU","Estados Unidos","SD","San Diego"));
		source.add(new PrimaryCursor("EU","Europa","FR","Francia","PA","Paris"));
		source.add(new PrimaryCursor("AS","Asia","JA","Japon","TK","Tokio"));
		source.add(new PrimaryCursor("AM","America","CA","Canada","QB","Quebec"));
		source.add(new PrimaryCursor("AM","America","MX","México","CDM","Ciudad de México"));
		source.add(new PrimaryCursor("AM","America","EU","Estados Unidos","NY","Ney York"));
		source.add(new PrimaryCursor("AS","Asia","JA","Japon","KI","Kioto"));
		source.add(new PrimaryCursor("AM","America","MX","México","Tol","Toluca"));
		source.add(new PrimaryCursor("AF","Africa","EJ","Ejipto","Ca","El Cairo"));
		source.add(new PrimaryCursor("AM","America","MX","Mexico","QR","Queretaro"));
		source.add(new PrimaryCursor("AM","America","","Mexico","GD","Guadalajara"));
		
		List<Continente> continentes = new ArrayList<Continente>();
		
		for(PrimaryCursor pc : source) {
			int indexContinente = Main.buscarContinente(continentes, pc.getIdContinente());
			if(indexContinente == -1) {
				Continente continente = new Continente(pc.getIdContinente(),pc.getNombreContinente());
				
				Ciudad ciudad = new Ciudad(pc.getIdCiudad(),pc.getCiudad());
				List<Ciudad> ciudades = new ArrayList<Ciudad>();
				ciudades.add(ciudad);
				
				Pais pais = new Pais(pc.getIdPais(),pc.getNombrePais());
				pais.setListCiudades(ciudades);
				
				List<Pais> paises = new ArrayList<Pais>();
				paises.add(pais);
				continente.setListPaises(paises);
			
				continentes.add(continente);
				
				
			} else {
				int indexPais=Main.buscarPais(continentes.get(indexContinente).getListPaises(), pc.getIdPais());
				
				if(indexPais==-1) {
					Pais  pais= new Pais(pc.getIdPais(),pc.getNombrePais());
					
					List<Ciudad> ciudades = new ArrayList<Ciudad>();
					ciudades.add(new Ciudad(pc.getIdCiudad(),pc.getCiudad()));
					pais.setListCiudades(ciudades);
					
					continentes.get(indexContinente).getListPaises().add(pais);
				} else {
					int indexCiudad = 
							Main.buscarCiudad(continentes.get(indexContinente).getListPaises().get(indexPais).getListCiudades(), pc.getIdCiudad());
					if(indexCiudad == -1) {
						Ciudad ciudad = new Ciudad(pc.getIdCiudad(),pc.getCiudad());
						continentes.get(indexContinente).getListPaises().get(indexPais).getListCiudades().add(ciudad);
					}
				}
			}
			
		}
		
		System.out.println("----");
		for(Continente c: continentes) {
			System.out.println("-> "+c.idContinente);
			
			for(Pais p:c.getListPaises()) {
				System.out.println("---> "+p.getIdPais());
				
				for(Ciudad ciudad: p.getListCiudades()) {
					System.out.println("----->" + ciudad.getIdCiudad());
				}
			}
		}

	}
	
	static int buscarContinente(List<Continente> continentes, String id) {
		for (int i = 0; i < continentes.size(); i++) {
			if(continentes.get(i).getIdContinente().equals(id)) {
				return i;
			}
		}
	
		return -1;
	}
	
	static int buscarPais(List<Pais> paises, String id) {
		for (int i = 0; i < paises.size(); i++) {
			if(paises.get(i).getIdPais().equals(id)) {
				return i;
			}
		}
		
		return -1;
	}
	
	static int buscarCiudad(List<Ciudad> ciudades, String id) {
		for (int i = 0; i < ciudades.size(); i++) {
			if(ciudades.get(i).getIdCiudad().equals(id)) {
				return i;
			}
		}
		
		return -1;
	}

}
