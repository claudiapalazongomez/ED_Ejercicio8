package es.studium.ejercicio8;

public class Musico
{
	//Atributos
	
	private String nombre;
	private char sexo;
	
	//Constructor por parámetros
	
	public Musico(String nombre, char sexo)
	{
		this.nombre = nombre;
		this.sexo = sexo;
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

	public char getSexo()
	{
		return sexo;
	}

	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	
	
	
	
}
