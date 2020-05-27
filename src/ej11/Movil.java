package ej11;

import java.io.*;

public class Movil implements Serializable {
	/**
	 * 
	 * En esta clase vamos a tener un constructor con todos los atributos menos el estado que por defecto
	 * estara false.
	 * Esta clase tendra un toString que devolvera todos los atributos, tambien tendra un metodo que apage el Movil
	 * (convierta a false el estado) y que encienda el Movil (que convierta a true el estado)
	 * aparte habra un metodo para agregar RAM al Movil.
	 * Habra una clase GuardaObjeto la cual guardara este objeto en la raiz del proyecto en un archivo llamado
	 * Movil.txt, tambien habra una clase LeeObj el cual devolvera un objeto Movil que leera en el archivo guardado
	 * en la raiz del proyecto llamado Movil.txt.
	 * En el main crearemos un objeto Movil y luego lo leeremos para guardarlo en otro objeto Movil vacio
	 * despues de leerlo y guardarlo utilizaremos algunos de los metodos de la clase Movil.
	 * 
	 **/
	private boolean estado;
	private double pantalla;
	private int ram;
	private String modelo;
	private String marca;

	public Movil(double pantalla, int ram, String modelo, String marca) {
		this.pantalla = pantalla;
		this.ram = ram;
		this.modelo = modelo;
		this.marca = marca;
		this.estado = false;

	}

	public void addRam(int ram) {
		this.ram += ram;
	}

	public void apaga() {
		if (this.estado == true) {
			this.estado = false;
		}
	}

	public void enciende() {
		if (this.estado == false) {
			this.estado = true;
		}
	}

	public String toString() {
		return "Modelo: " + this.modelo + " Marca:" + this.marca + " Ram:" + this.ram + " Pantalla:" + this.pantalla+" Estado:"+this.estado;
	}
	
	public static void main(String[]args) {
		Movil movil_recuperar;
		Movil movil_escribir = new Movil(10.5,16,"Samsumg","M30");
		GuardaObj guarda_objeto = new GuardaObj();
		guarda_objeto.gobj(movil_escribir);
		LeeObj lee_objeto = new LeeObj();
		movil_recuperar = lee_objeto.lobj();
		movil_recuperar.addRam(12);
		movil_recuperar.enciende();
		System.out.println(movil_recuperar.toString());

	}
}