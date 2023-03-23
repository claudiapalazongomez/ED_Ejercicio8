package es.studium.ejercicio8;

public class TestOrquesta
{

	public static void main(String[] args)
	{
		Instrumento instrumento1 = new Instrumento("clarinete", 'D');
		Musico musico1 = new Musico("Javier", 'H');
		
		System.out.println("Hola, me llamo "+ musico1.getNombre() + " y toco el "+ instrumento1.getNombre());

	}

}
