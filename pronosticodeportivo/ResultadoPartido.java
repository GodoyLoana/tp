package pronosticodeportivo;

public class ResultadoPartido extends Equipo {

	private int goles;


	
	public ResultadoPartido(String nombre, String descripcion, int goles) {
		super(nombre, descripcion);
		this.goles = goles;
	}


	

	public int getGoles() {
		return goles;
	}




	public void setGoles(int goles) {
		this.goles = goles;
	}




	public String dameinformacion() {
		
		 return "pronosticoo:Nombre equipo"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+goles;
			
		}
	
	public  String acerto() {
		

		
			return "el equipo ganador es"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+goles;
		}
		
		
		
		
		
	}
	
	
	
	
