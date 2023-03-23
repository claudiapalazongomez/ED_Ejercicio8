package es.studium.ejercicio8;
/**
 * Claudia Palaz�n G�mez
 * @author 98cla
 *
 */

public class Instrumento
{
	//Atributos
	
	private String nombre;
	private char afinacion; //en el constructor vac�o, al iniciarlo como nulo debemos poner un espacio, es decir: char afinacion = ' ';
	
	//Constructor por par�metros
	
	public Instrumento(String nombre, char afinacion)
	{
		this.nombre = nombre;
		this.afinacion = afinacion;
	}
	
	
	//M�todos

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
