import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
//E1.17
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
        "http://vignette1.wikia.nocookie.net/doratheexplorer/images/1/10/3.png/revision/latest?cb=20130422075133");
        JOptionPane.showMessageDialog(null, "Hola", "Title",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}