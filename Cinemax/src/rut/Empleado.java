package rut;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Empleado {
    private int rut[] = new int[100];
    private float sueldo[] = new float[100];
    private String nombres[] = new String[100];
    private HashMap<Integer, String> empleadosHashMap = new HashMap<>();

    public Empleado() {
        // Llenar el vector de nombres
        String[] listaNombres = {"Juan", "María", "José", "Ana", "Carlos", "Laura", "Pedro", "Marta", "Luis", "Elena", "Francisco", "Sofía", "Javier", "Lucía", "Miguel", "Carmen", "David", "Raquel", "Diego", "Isabel", "Daniel", "Eva", "Álvaro", "Patricia", "Pablo", "Nuria", "Jorge", "Beatriz", "Alberto", "Lorena", "Manuel", "Sara", "Rubén", "Verónica", "Fernando", "Rocío", "Ángel", "Paula", "José Manuel", "Silvia", "Alejandro", "Cristina", "Ignacio", "Marina", "Sergio", "Marisol", "Víctor", "Natalia", "Roberto", "Alicia", "Guillermo", "Elisa", "Adrián", "Clara", "Víctor Manuel", "Celia", "Emilio", "Diana", "Rafael", "Julia", "Óscar", "Esther", "Mario", "Victoria", "Jaime", "Inés", "Santiago", "Bego?a", "Carlos Javier", "Adela", "Andrés", "Concepción", "Alfonso", "Mónica", "Joaquín", "Olga", "Antonio", "Sonia", "José Luis", "Gema", "Fernando José", "Rosa María", "Juan Carlos", "Eugenia", "Mariano", "Miriam", "Gonzalo", "Carmen María", "Roberto Carlos", "María Jesús", "Lorenzo", "Rosario", "Gabriel", "Isidora", "Ricardo", "Margarita", "Nicolás", "Mercedes", "Tomás", "Elvira"};
        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = listaNombres[random.nextInt(listaNombres.length)];
        }

        // Llenar el vector con un número aleatorio de 6 cifras
        for (int i = 0; i < sueldo.length; i++) {
            float randomNumber = random.nextFloat() * 1000000; // Generar número aleatorio entre 0 y 999999
            sueldo[i] = randomNumber;
        }

        // Llenar el vector int con datos aleatorios de 9 cifras
        for (int i = 0; i < rut.length; i++) {
            int randomNumber = random.nextInt(900000000) + 100000000; // Generar número aleatorio entre 100000000 y 999999999
            rut[i] = randomNumber;
        }

        // Llenar el HashMap con los datos de los vectores
        for (int i = 0; i < 100; i++) {
            empleadosHashMap.put(rut[i], nombres[i]);
        }
    }

    private void arreglarVectores() {
        int salto, i;
        boolean cambios;
        for (salto = sueldo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < sueldo.length; i++) {
                    if (sueldo[i - salto] > sueldo[i]) {
                        // Intercambiar elementos en el vectorFloat
                        float aux = sueldo[i];
                        sueldo[i] = sueldo[i - salto];
                        sueldo[i - salto] = aux;

                        // También intercambiar elementos en el vectorInt
                        int auxInt = rut[i];
                        rut[i] = rut[i - salto];
                        rut[i - salto] = auxInt;

                        // Tambien intercambiar elementos en el vectorString
                        String auxStr = nombres[i];
                        nombres[i] = nombres[i - salto];
                        nombres[i - salto] = auxStr;
                        cambios = true;
                    }
                }
            }
        }
    }

    public HashMap<Integer, String> getEmpleadosHashMap() {
        return empleadosHashMap;
    }

    public void setEmpleadosHashMap(HashMap<Integer, String> empleadosHashMap) {
        this.empleadosHashMap = empleadosHashMap;
    }

    public int[] getRut() {
        return rut;
    }

    public void setRut(int[] rut) {
        this.rut = rut;
    }

    public float[] getSueldo() {
        return sueldo;
    }

    public void setSueldo(float[] sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
}
