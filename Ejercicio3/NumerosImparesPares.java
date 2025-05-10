/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par;

/**
 *
 * @author o12339
 */
public class JavaApplication1 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 50};
        int resultado = diferenciaParesImpares(numbers);
        System.out.println("Resultado = " + resultado);
    }

    public static int diferenciaParesImpares(int[] numeros) {
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        return sumaPares - sumaImpares;
    }
}