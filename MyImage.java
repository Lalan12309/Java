import java.io.IOException;
import java.lang.reflect.WildcardType;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class MyImage {

    public static void main(String[] args) throws IOException{
        int width=963;
        int height=640;
        BufferedImage image=null;
        File f=null;
        try{
            f=new File("E:\\Image\\peacock.jpg");
            image = new BufferedImage((width , height, BufferedImage.TYPE_INT_ARGB);
            image=ImageIO.read(f);
            System.out.println("Reading complete.");

        }catch(IOException e){
            System.out.println("ERROR:" + e);
        }
        try{
            f = new File("E:\\Image\\Output.jpg");
            ImageIO.write(image, "jpg", f);
            System.out.println("Writing complete.");
        }catch(IOException e){
            System.out.println("Error:" + e);
        }
        
    }
    
}
