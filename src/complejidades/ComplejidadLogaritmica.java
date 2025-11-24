package complejidades;

public class ComplejidadLogaritmica {

    public int busquedaBinaria(int[] datos, int clave) {
        if (datos == null) return -1;
        int lo = 0, hi = datos.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (datos[mid] == clave) return mid;
            if (datos[mid] < clave) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public void ejemplo(int[] datos, int clave) {
        int idx = busquedaBinaria(datos, clave);
        if (idx >= 0) {
            System.out.println("Clave " + clave + " encontrada en índice " + idx);
        } else {
            System.out.println("Clave " + clave + " no encontrada.");
        }
    }
}
