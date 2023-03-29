package pronosticodeportivo;

public class Pronostico extends Equipo{
	private int cantidad;

	public Pronostico(String nombre, String descripcion, int cantidad) {
		super(nombre, descripcion);
		this.cantidad = cantidad;
	}

	

public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



public String dameinformacion() {
	
 return "pronosticoo:Nombre equipo"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+cantidad;
	
}

public  String acerto() {
	

	
	return "el equipo ganador es"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+cantidad;
}








}




			
		





	

	
	

	
	
