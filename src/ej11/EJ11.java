package ej11;

import java.io.*;
/**
 * 
 * @author Jose Maria 
 *
 */
public class EJ11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arma[] armeria_Leganes = new Arma[3];
		armeria_Leganes[0] = new Arma(30, "AK47", "Fusil", 70, 1);
		armeria_Leganes[1] = new Arma(7, "Desert Eagle", "Pistola", 25, 1);
		armeria_Leganes[2] = new Arma(30, "Barret", "Fusil de precision", 15, 3);

		try {
			// creamos este objeto que no permitira escribir el objeto.
			ObjectOutputStream escribiendo = new ObjectOutputStream(new FileOutputStream("EJ11.txt"));
			// creamos el metodo para poder escribir el objeto
			escribiendo.writeObject(armeria_Leganes);
			escribiendo.close();
			//creamos este objeto para que pueda leer nuestro objeto
			ObjectInputStream recuperando = new ObjectInputStream(new FileInputStream("EJ11.txt"));
			//hacemos el casting para que pueda ser un array
			Arma recuperoArma [] =  (Arma []) recuperando.readObject(); 
			recuperando.close();
			
			for (int i = 0; i < recuperoArma.length; i++) {
				System.out.println(recuperoArma[i]);
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class Armeria {

}

class Arma implements Serializable {
	private int municion;
	private String modelo;
	private String tipo;
	private int cadencia;
	private int alcance;
	private int numeroSerie;
	private static int contador = 0;

	public Arma(int municion, String modelo, String tipo, int cadencia, int alcance) {
		contador++;
		this.alcance = alcance;
		this.cadencia = cadencia;
		this.modelo = modelo;
		this.tipo = tipo;
		this.numeroSerie = contador;
		this.municion = municion;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCadencia() {
		return cadencia;
	}

	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}

	public String toString() {
		return "El arma " + this.modelo + " modelo " + this.modelo + " tipo " + this.tipo + " Municion " + this.municion
				+ " Alcance " + this.alcance + " Candecia " + this.cadencia + " Numero de serie " + this.numeroSerie;
	}

}
