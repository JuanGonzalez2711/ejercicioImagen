package Modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagenModelo {
	private BufferedImage imagen;

	  public void cargarImagen(String ruta) throws IOException {
	    imagen = ImageIO.read(new File(ruta));
	  }

	  public BufferedImage getImagen() {
	    return imagen;
	  }
}
