package Launcher;

import Controlador.ImagenControlador;
import Modelo.ImagenModelo;
import Vista.ImagenVista;

public class Lanzador {
	public static void main(String[] args) {
		  ImagenModelo modelo = new ImagenModelo();
		  ImagenVista vista = new ImagenVista(modelo);
		  ImagenControlador controlador = new ImagenControlador(modelo, vista);
		  controlador.mostrarVentana();
		  controlador.cargarImagen("C:\\Users\\Juan Jose Gonzalez\\Downloads\\LamborguiniAventador.jpg");
		}
}
