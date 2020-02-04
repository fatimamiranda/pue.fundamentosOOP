package fundamentosOOP.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Alumno {

	//Prohibido poner public delante de los atributos
	private String nombre, direccion, curso;
	private int dni;
	private Date fechaNacimiento;
	
	//Metodo que retorna el nombre
	public String getNombre() {
		//No te obliga pero es un campo de la clase y va bien ponerlo
		
		return this.nombre;
	}
	
	/**
	 * 
	 * Metodo que guardar el valor proporcionado en el campo "nombre"
	 * @param nombre El nombre a guardar (indicamos cada parametro)
	 * @exception RuntimeException Si el nombre tiene menos de 3 caracteres (Si el meodo lanza algun problema)
	 */
	
    // Generate JavaDoc
	
	//el metodo no va a devolver nada porque es un metodo que recibe un parametro y lo asigna
	public void setNombre(String nombre) {
		//metodo que devuelve un boolean diciendome 
		//si supera la longitud o almenos la iguala de 3 caracteres
		
		if (checkStringLenght(3,nombre)) {
			this.nombre = nombre;
		} else {
			//Lanzamos una excepción
			throw new RuntimeException("Nombre inválido");
		}
		
	}
	
	//metodo interno a la clase, no quiero que se vea desde cliente
	private boolean checkStringLenght(int minLength, String nombre) {
		// Quiero saber la longitud que tiene el nombre
		
		int longitud = nombre.length();
		if (longitud >= minLength) {
			return true;
		} else {
			return false;
		}
	}

	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(int dia, int mes, int any) {
		Calendar fecha = Calendar.getInstance();
		fecha.set(any,mes-1,dia);
		this.fechaNacimiento = fecha.getTime();
	}
	
	//Metodo toString
		
	//si mandamos a escribir un alumno, qué se debe mostrar del alumno?
		
	@Override
	public String toString() {
		
		String fechaBonita = 
				new SimpleDateFormat ("dd/MM/yyyy")
					.format(this.fechaNacimiento);
		
		return "Alumno [nombre=" + nombre + ", direccion=" + direccion + ", curso=" + curso + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	
	
}
