
package LibreriaAlex;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Pereiro G
 */
public class LeerDatos {
    public static int leerInt(String mensaje){
        int dato=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    public static float leerFloat(String mensaje){
        float dato=Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
    public static String leerString(String mensaje){
        String dato=JOptionPane.showInputDialog(mensaje);
        return dato;
    } 
    public static double leerDouble(String mensaje){
        double dato=Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return dato;
    }
}
