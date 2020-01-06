package renos;

public class Persona {

	
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private int peso;
	private int altura;
	
	
	
	
	public Persona(String nombre, int edad, String DNI, char sexo, int peso, int altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;		
	}
	
	
	
	
	
	
	public Persona (Persona p) {
		
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.DNI = p.DNI;
		this.sexo = p.sexo;
		this.peso = p.peso;
		this.altura = p.altura;			
	}
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
	
}
