package UD3.actividade3a2a1;

import java.util.Scanner;

/**
 * Esta clase representa unha matriz de 3x3, cun metodo que suma duas matrices
 *
 * @author Xaquin Alves Gonzalez
 */
public class Matrix {
    //Constante que define o lado da matriz
    private final int MAX_SIDE = 3;
    //Garda os numeros da matriz
    private int[][] matrix;

    /**
     * Crea unha instacia de Matrix
     */
    public Matrix() {
        matrix = new int[MAX_SIDE][MAX_SIDE];
    }

    /**
     * Creamos duas instancias de Matrix para testear as suas funcionalidades
     *
     * @param args
     */
    public static void main(String[] args) {
        //Creamos as matrices
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        //Recollemos numeros para a primeira matriz e mostramola
        System.out.println("Introduce los numeros para la matriz 1: ");
        matrix1.setNumbersKeyB();
        System.out.println("Matriz 1: ");
        matrix1.showMatrix();
        //Recollemos numeros para a segunda matriz e mostramola
        System.out.println("Introduce los numeros para la matriz 2: ");
        matrix2.setNumbersKeyB();
        System.out.println("Matriz 2: ");
        matrix2.showMatrix();
        //Sumamolas e amosamolo por pantalla
        System.out.println("La suma de ambas matrices es: ");
        matrix1.sum(matrix2).showMatrix();
        //Restamolas e amosamolo por pantalla
        System.out.println("El resultado de restar la segunda matriz a la primera es: ");
        matrix1.substract(matrix2).showMatrix();
    }

    /**
     * @return lado da matriz
     */
    public int getMAX_SIDE() {
        return MAX_SIDE;
    }

    /**
     * @return array que almacena os valores da matriz
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * @param x posicion x
     * @param y posicion y
     * @return o valor gardado na posicion da matriz indicada
     */
    public int getNumberAt(int x, int y) {
        return matrix[x][y];
    }

    /**
     * @param number numero a establecer na posicion
     * @param x      posicion x
     * @param y      posicion y
     */
    public void setNumberAt(int number, int x, int y) {
        this.matrix[x][y] = number;
    }

    /**
     * Establece os numéros desta matriz pedindoos por teclado
     */
    public void setNumbersKeyB() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MAX_SIDE; i++) {
            for (int j = 0; j < MAX_SIDE; j++) {
                System.out.print("Introduce el número de la posición " + i + "," + j + ": ");
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
    }

    /**
     * Mostra esta matriz por pantalla
     */
    public void showMatrix() {
        for (int i = 0; i < MAX_SIDE; i++) {
            for (int j = 0; j < MAX_SIDE; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Suma esta matriz coa dada como parámetro
     *
     * @param matrix2 matriz a sumar
     * @return matriz resultante da suma
     */
    public Matrix sum(Matrix matrix2) {
        Matrix result = new Matrix();

        for (int i = 0; i < MAX_SIDE; i++) {
            for (int j = 0; j < MAX_SIDE; j++) {
                result.setNumberAt((matrix[i][j] + matrix2.getNumberAt(i, j)), i, j);
            }
        }

        return result;
    }

    /**
     * Resta a matriz dada como parametro a esta matriz
     *
     * @param matrix2 matriz que se restará
     * @return matriz resultado da resta
     */
    public Matrix substract(Matrix matrix2) {
        Matrix result = new Matrix();

        for (int i = 0; i < MAX_SIDE; i++) {
            for (int j = 0; j < MAX_SIDE; j++) {
                result.setNumberAt((matrix[i][j] - matrix2.getNumberAt(i, j)), i, j);
            }
        }

        return result;
    }


}
