import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;

public class ImageRegionCheck {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/assets/supersentaicraft/textures/armor/belts/timeranger_belt.png");
        BufferedImage image = ImageIO.read(file);
        
        System.out.println("Checking region [48..64, 0..16]:");
        boolean hasPixel1 = false;
        for (int y = 0; y < 16; y++) {
            for (int x = 48; x < 64; x++) {
                if (x < image.getWidth() && y < image.getHeight()) {
                    int a = (image.getRGB(x, y) >> 24) & 0xff;
                    if (a > 0) hasPixel1 = true;
                }
            }
        }
        System.out.println("Has non-transparent pixel? " + hasPixel1);
        
        System.out.println("Checking region [48..64, 16..32]:");
        boolean hasPixel2 = false;
        for (int y = 16; y < 32; y++) {
            for (int x = 48; x < 64; x++) {
                if (x < image.getWidth() && y < image.getHeight()) {
                    int a = (image.getRGB(x, y) >> 24) & 0xff;
                    if (a > 0) hasPixel2 = true;
                }
            }
        }
        System.out.println("Has non-transparent pixel? " + hasPixel2);
    }
}
