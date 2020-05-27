
package ej11;

import java.io.*;

public class LeeObj {
	public Movil lobj() {
		Movil mov = null;
		try {
			ObjectInputStream recuperando_fich = new ObjectInputStream(new FileInputStream("Movil.txt"));
			mov = (Movil) recuperando_fich.readObject();
			recuperando_fich.close();
		} catch (Exception e) {
			System.err.println("Excepcion leer");
		}
		return mov;
	}
}
