package arreglo_estructura;

import java.util.Arrays;
import javax.swing.JFrame;

public class Arreglo_Estructura extends JFrame {

    private int cantidadNumeros;
    private int cantidadAleatoria;
    private int numerosOrdenados;
    private int[] numerosAleatorios;
    private int[] burbujaOrdenado;
    private GeneradorAleatorio generador;

    
    public Arreglo_Estructura(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
        this.cantidadAleatoria = cantidadNumeros;
        this.generador = new GeneradorAleatorio();
        this.numerosAleatorios = generador.generarNumerosAleatorios(this.cantidadAleatoria);
        this.ordenarNumeros();
    }

    public int busquedaBinariaEnOriginal(int valor) {
        int inicio = 0;
        int fin = numerosAleatorios.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            if (numerosAleatorios[medio] == valor) {
                return medio; // Elemento encontrado, devuelve el índice
            } else if (numerosAleatorios[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1; // Elemento no encontrado
    }
        public int[] getNumerosAleatorios() {
        return Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        }
public void setNumerosAleatorios(int[] numerosAleatorios) {
        this.numerosAleatorios = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
    }

    public int busquedaBinariaEnBurbuja(int valor) {
        int inicio = 0;
        int fin = burbujaOrdenado.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            if (burbujaOrdenado[medio] == valor) {
                return medio; // Elemento encontrado, devuelve el índice
            } else if (burbujaOrdenado[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1; // Elemento no encontrado
    }

    public void ordenarNumeros() {
        this.burbujaOrdenado = Arrays.copyOf(numerosAleatorios, numerosAleatorios.length);
        generador.ordenarBurbuja(this.burbujaOrdenado);
    }

    public int getCantidadNumeros() {
        return cantidadNumeros;
    }

    public void setCantidadNumeros(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
    }

    public int getCantidadAleatoria() {
        return cantidadAleatoria;
    }

    public void setCantidadAleatoria(int cantidadAleatoria) {
        this.cantidadAleatoria = cantidadAleatoria;
        this.numerosAleatorios = generador.generarNumerosAleatorios(this.cantidadAleatoria);
    }

    public void setBurbujaOrdenado(int[] burbujaOrdenado) {
        this.burbujaOrdenado = burbujaOrdenado;
    }

    public int[] getBurbujaOrdenado() {
        return burbujaOrdenado;
    }

}
