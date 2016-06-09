package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        int array = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del array"));
        int[] numeros = new int[array];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del que queremos averiguar el indice"));
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, num, 0, numeros.length - 1);
        System.out.println("El indice del valor '"+num+"' es: " + indice);
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
