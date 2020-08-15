
public class Main {

	public static void main(String[] args) {

		Libros lbr1 = new Libros("LOS SIMPSON", 30);
		Libros lbr2 = new Libros("FRIDA KALOH", 24);
		
		CD CD1 = new CD("PAULO LONDRA", 15);
		CD CD2 = new CD("ANUEL", 20);

       
		System.out.println("VALOR A CANCELAR POR EL LIBRO DE LOS SIMPSON ES DE:" + lbr1.getValor1() +  "$");
		System.out.println("EL LIBRO DE FRIDA KALOH TIENE UN VALOR DE : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL VALOR DEL CD DE PAULO LONDRA ES :" +  CD1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD DE ANUEL ES : "  + CD2.getValorcd1() +  "$");
	}

}