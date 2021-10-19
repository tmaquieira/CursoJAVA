package modulo7;

public class Profesor extends Persona {
	
	private String iosfa;
	
	//Constructores
	public Profesor(){ 
		super();
	}
	public Profesor(String unNombre, String unApellido, String unIosfa){
		super(unNombre, unApellido);
		iosfa = unIosfa;
	}
	
	//Getters
	public String getIosfa(){
		return iosfa ;
	}
	
	//Setters
	public void setIosfa (String unIosfa){
		iosfa = unIosfa;
	}

	//métodos
	public boolean equals(Object unProfesor){
		return false;
	}
	public int hashCode(){
		return this.hashCode();
	}
	public String toString(){
		return getNombre()+" "+getApellido()+" "+iosfa;  
		//return this.toString();
	}
}
