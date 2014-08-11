import java.awt.*;
import javax.swing.*;

public class Main extends JPanel {

	static final long serialVersionUID = 0;
	private Image image = null;
    private Boolean stretch = true;

    public Main(Image image) {
        this.image = image;
    }

    public Main(String file) {
        this.image = getToolkit().getImage(file);
    }

   /**
    * Position de l'image sur le panel
    * @param stretch true: etirer l'image / false: centrer l'image
    */
    public void setStretch(Boolean stretch) {
        this.stretch = stretch;
    }

    /**
     * Surcharger le dessin du composant
     * @param g canvas
     */
    protected void paintComponent(Graphics g) {
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;

        if (this.stretch) {
            width = this.getWidth();
            height = this.getHeight();
        } else {
            width = this.image.getWidth(this);
            height = this.image.getHeight(this);
            x=((this.getWidth()-width)/2);
            y=((this.getHeight()-height)/2);
        }  
        g.drawImage(this.image, x, y, width, height, this);
        g.drawImage(this.image, x+100, y+100, width, height, this);
    }

    
    /**
     * Exemple : jPanelImage dans un JFrame
     * @param args
     */
    public static void main(String[] args) {
        Main imagePanel = new Main("C:\\Users\\dbou0835\\workspace\\Test\\src\\data\\caseDroite.png");
        //Centrer l'image
        imagePanel.setStretch(false);
        //Etirer l'image
        //imagePanel.setStretch(true);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(imagePanel);
        frame.setSize(600, 600);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
}