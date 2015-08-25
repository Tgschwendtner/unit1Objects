import javax.swing.JOptionPane;
public class DialogViewer
//E1.15
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String hello = ("Hello ")+ name ;
        System.out.println(hello);
    }
}
