import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;

public class ImagePixelColor {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/assets/supersentaicraft/textures/armor/belts/timeranger_belt.png");
        BufferedImage image = ImageIO.read(file);
        
        int rgb22 = image.getRGB(2, 2);
        int rgb33 = image.getRGB(3, 3);
        
        Color c22 = new Color(rgb22, true);
        Color c33 = new Color(rgb33, true);
        
        System.out.println("[2,2] -> R:" + c22.getRed() + " G:" + c22.getGreen() + " B:" + c22.getBlue() + " A:" + c22.getAlpha());
        System.out.println("[3,3] -> R:" + c33.getRed() + " G:" + c33.getGreen() + " B:" + c33.getBlue() + " A:" + c33.getAlpha());
    }
}
