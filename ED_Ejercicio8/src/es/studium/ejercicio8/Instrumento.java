package es.studium.ejercicio8;
/**
 * Claudia Palazón Gómez
 * @author 98cla
 *
 */

public class Instrumento
{
	//Atributos
	
	private String nombre;
	private char afinacion; //en el constructor vacío, al iniciarlo como nulo debemos poner un espacio, es decir: char afinacion = ' ';
	
	//Constructor por parámetros
	
	public Instrumento(String nombre, char afinacion)
	{
		this.nombre = nombre;
		this.afinacion = afinacion;
	}
	
	
	//Métodos

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public char getAfinacion()
	{
		return afinacion;
	}

	public void setAfinacion(char afinacion)
	{
		this.afinacion = afinacion;
	}
	
	
	
}
