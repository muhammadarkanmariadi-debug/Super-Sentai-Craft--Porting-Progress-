import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;

public class ImageColorCheck {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/assets/supersentaicraft/textures/armor/belts/timeranger_belt.png");
        BufferedImage image = ImageIO.read(file);
        
        System.out.println("Colors in region [48..64, 0..16]:");
        for (int y = 0; y < 16; y++) {
            for (int x = 48; x < 64; x++) {
                int rgb = image.getRGB(x, y);
                Color c = new Color(rgb, true);
                if (c.getAlpha() > 0 && c.getRed() != 0 || c.getGreen() != 0 || c.getBlue() != 0) {
                    System.out.println("NON-BLACK PIXEL: " + x + "," + y + " -> " + c.getRed() + "," + c.getGreen() + "," + c.getBlue());
                }
            }
        }
        
        System.out.println("Colors in region [48..64, 16..32]:");
        for (int y = 16; y < 32; y++) {
            for (int x = 48; x < 64; x++) {
                int rgb = image.getRGB(x, y);
                Color c = new Color(rgb, true);
                if (c.getAlpha() > 0 && c.getRed() != 0 || c.getGreen() != 0 || c.getBlue() != 0) {
                    System.out.println("NON-BLACK PIXEL: " + x + "," + y + " -> " + c.getRed() + "," + c.getGreen() + "," + c.getBlue());
                }
            }
        }
    }
}
