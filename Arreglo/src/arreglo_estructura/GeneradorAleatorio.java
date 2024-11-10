package arreglo_estructura;

public class GeneradorAleatorio {

    public int[] generarNumerosAleatorios(int cantidadAleatoria) {
        int[] numerosAleatorios = new int[cantidadAleatoria];
        for (int i = 0; i < cantidadAleatoria; i++) {
            numerosAleatorios[i] = (int) (Math.random() * cantidadAleatoria);
        }
        return numerosAleatorios;
    }

    public void ordenarBurbuja(int[] numeros) {
        long tiempoInicio = System.nanoTime();
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        long tiempoFin = System.nanoTime();
        imprimirResultado("BURBUJA", tiempoInicio, tiempoFin);
    }





    private void imprimirResultado(String metodo, long tiempoInicio, long tiempoFin) {
        long duracionNanosegundos = tiempoFin - tiempoInicio;
        long duracionMilisegundos = duracionNanosegundos / 1000000;

        System.out.println("Tiempo de ejecución de " + metodo + " en nanosegundos: " + duracionNanosegundos);
        System.out.println("Tiempo de ejecución de " + metodo + " en milisegundos: " + duracionMilisegundos);
        System.out.println();
    }

    // Main de ejemplo (puedes ajustar según tus necesidades)
    public static void main(String[] args) {
        GeneradorAleatorio generador = new GeneradorAleatorio();
        int cantidadAleatoria = 10000; // Ajusta la cantidad según tus necesidades
        int[] numeros = generador.generarNumerosAleatorios(cantidadAleatoria);

        generador.ordenarBurbuja(numeros.clone());

    }
}
