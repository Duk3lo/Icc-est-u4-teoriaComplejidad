package complejidades;

public class ComplejidadCuadratica {

    public void ejemplo(int[] datos) {
        if (datos == null) return;
        int n = datos.length;
        int cuentas = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (datos[i] + datos[j] == 0) {
                    cuentas++;
                }
            }
        }
        System.out.println("Pares con suma 0: " + cuentas);
    }
}
