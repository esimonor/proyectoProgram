package eval2;

public class Persona {
	private String nombre;
	private String direccion;
	private int cod_pos;
	private String ciudad;
	private int edad;
	
	public Persona(String nombre, String direccion, int codigoPostal, String ciudad, int edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.cod_pos = codigoPostal;
		this.ciudad = ciudad;
		this.edad = edad;
	}
	
	 public String getNombre() {
	        return nombre;
	    } 
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    } 
	    public String getCiudad() {
	        return ciudad;
	    }
	    public void setCiudad(String ciudad) {
	        this.ciudad = ciudad;
	    }
	    public String getDireccion() {
	        return direccion;
	    } 
	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    } 
	    public int getEdad() {
	        return edad;
	    }
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public int getcod_pos() {
	        return cod_pos;
	    }
	    public void setcod_pos(int cod_pos) {
	        this.cod_pos = cod_pos;
	    }
	    public Persona (String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }   
	    public Persona(String nombre) {
	        this.nombre = nombre;
	        this.edad = 18;
	    }
	    public boolean escorrectocodpostal() {
	    	if (cod_pos>=0 || cod_pos<=20000) {
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    }
	    @Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", codigoPostal=" + cod_pos + ", ciudad="
					+ ciudad + ", edad=" + edad + "]";
		}
}
