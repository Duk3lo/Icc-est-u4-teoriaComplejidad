package complejidades;

public class ComplejidadConstante {

    public void ejemplo(int[] datos) {
        if (datos != null && datos.length > 0) {
            int primero = datos[0];
            System.out.println("Primer elemento: " + primero);
        }
    }
}
