package Vista;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import Modelo.ImagenModelo;

public class ImagenVista extends JPanel{
	private ImagenModelo modelo;

	  public ImagenVista(ImagenModelo modelo) {
	    this.modelo = modelo;
	  }

	  @Override
	  protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    BufferedImage imagen = modelo.getImagen();
	    if (imagen != null) {
	      g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
	    }
	  }
}
