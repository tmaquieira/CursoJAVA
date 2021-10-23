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
	public boolean equals(Object obj){
		boolean bln=false;
		if(obj instanceof Profesor){
			Profesor profe = (Profesor) obj;
			bln = super.equals(profe) && obj instanceof Profesor && ((Profesor) obj).getIosfa() == iosfa;
		}
		return bln;
	} 
	
	public int hashCode(){
		return super.hashCode() + (iosfa == null ? 0 : iosfa.hashCode()); 
		//sacado de https://stackoverflow.com/questions/19622646/use-string-attribute-to-override-hashcode-function/48108835
	}	
	
	public String toString(){
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", Iosfa = ");
		sb.append(iosfa);
		return sb.toString();
	}
}
