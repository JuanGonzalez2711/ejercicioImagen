package Controlador;

import java.io.IOException;
import javax.swing.JFrame;

import Modelo.ImagenModelo;
import Vista.ImagenVista;

public class ImagenControlador{
	private ImagenModelo modelo;
	  private ImagenVista vista;

	  public ImagenControlador(ImagenModelo modelo, ImagenVista vista) {
	    this.modelo = modelo;
	    this.vista = vista;
	  }

	  public void cargarImagen(String ruta) {
	    try {
	      modelo.cargarImagen(ruta);
	      vista.repaint();
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
	  }

	  public void mostrarVentana() {
	    JFrame ventana = new JFrame("Visor de Imágenes");
	    ventana.add(vista);
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setSize(800, 600);
	    ventana.setVisible(true);
	  }
}
