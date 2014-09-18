package sonora;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;

public class Explosao {

	public static void main(String[] args) throws FileNotFoundException,
			JavaLayerException {
		final String explosao1 = "explosion.mp3";
		final String explosao2 = "explosion1.mp3";

		Som mp3;

		mp3 = new Som(explosao1);
		mp3.play();

		mp3 = new Som(explosao2);
		mp3.play();
		
		
		
		
	}
}