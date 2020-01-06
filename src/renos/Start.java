package renos;

public class Start {

	public static void main(String[] args) {
		
		
		Persona marcos = new Persona("Marcos Fernandez", 31, "98555333J",'H',70, 172);
		System.out.println(marcos);
		
		
		Persona carlos = new Persona(marcos);
		System.out.println(carlos);

	}

}
