
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantidade numero: "));
        int soma = 0;
        int i = 1;
        while (i <= n) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: " + i));
            soma = soma + num;
            i++;
        }
        JOptionPane.showMessageDialog(null, "soma: " + soma);
    }
}
