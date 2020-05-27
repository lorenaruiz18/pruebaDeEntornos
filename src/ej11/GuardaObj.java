package ej11;

import java.io.*;

public class GuardaObj {
	public void gobj(Movil objeto) {
		try {
			ObjectOutputStream escribindo_fich = new ObjectOutputStream(new FileOutputStream("Movil.txt"));
			escribindo_fich.writeObject(objeto);
			escribindo_fich.close();
		} catch (Exception e) {
			System.err.println("Excepcion guardar");
		}
	}
}
