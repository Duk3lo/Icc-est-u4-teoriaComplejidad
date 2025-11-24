package complejidades;

public class ComplejidadLineal {

    public void ejemplo(int[] datos) {
        long suma = 0;
        if (datos != null) {
            for (int i = 0; i < datos.length; i++) {
                suma += datos[i];
            }
        }
        System.out.println("Suma: " + suma);
    }
}
