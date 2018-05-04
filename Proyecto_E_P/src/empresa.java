
public class empresa {

	public static Object empresa;
	/* https://ws-api.iextrading.com/1.0/ref-data/symbols */
	String simbolo = "";
	String nombre = "";
	String fecha = "";
	boolean habilitado;
	String tipo = "";
	String iexID = "";
	int cantidad=0;
	
	empresa(){}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIexID() {
		return iexID;
	}

	public void setIexID(String iexID) {
		this.iexID = iexID;
	}

}
