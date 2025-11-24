package complejidades;

public class ComplejidadNLogN {

    public void ejemplo(int n) {
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (j < n) {
                j *= 2;
            }
        }
        System.out.println("Terminó el ejemplo con n = " + n);
    }
}
