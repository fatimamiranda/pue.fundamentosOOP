package fundamentosOOP.model;

//es la clase cliente
//es un front que podr�a ser una web con JS donde un usuario est� creando
//un formulario
public class TestClass {

	public static void main(String[] args) {
		//Declarar e instanciar un objeto del tipo Alumno
		
		// Crea en memoria para guardar un alumno
		
		//Aunque por el momento est� vacio
		Alumno a1 = new Alumno();

		a1.setNombre("Luis Enrique");
		a1.setCurso("Java");
		a1.setDireccion("Plaza Urquinaona");
		a1.setFechaNacimiento(21, 8, 2020);
		System.out.println(a1.toString());
		System.out.println("programa finalizado");
	}

}
