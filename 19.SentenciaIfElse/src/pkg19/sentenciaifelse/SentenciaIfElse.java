package pkg19.sentenciaifelse;

import javax.swing.JOptionPane;

public class SentenciaIfElse {
    public static void main(String[] args) {
        int numero, dato = 5;
        numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        /*
        == : Igualdad
        != : Diferencia
        >= : Mayor o igual
        <= : Menor o igual
        */
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
    }   
}
