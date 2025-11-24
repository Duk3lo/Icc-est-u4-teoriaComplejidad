package complejidades;

public class PeorCasoPromedio {

    public int busquedaLineal(int[] datos, int clave) {
        if (datos == null) return -1;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == clave) return i;
        }
        return -1;
    }
}
