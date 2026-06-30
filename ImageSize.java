import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageSize {
    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/assets/supersentaicraft/textures/armor/belts/timeranger_belt.png");
        BufferedImage image = ImageIO.read(file);
        System.out.println("Width: " + image.getWidth());
        System.out.println("Height: " + image.getHeight());
    }
}
