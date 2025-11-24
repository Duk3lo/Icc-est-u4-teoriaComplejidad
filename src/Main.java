import complejidades.*;

public class Main {
    public static void main(String[] args) {
        int[] ejemplo = { -3, -1, 0, 1, 2, 4, 7 };

        ComplejidadConstante c1 = new ComplejidadConstante();
        c1.ejemplo(ejemplo);

        ComplejidadLineal cn = new ComplejidadLineal();
        cn.ejemplo(ejemplo);

        ComplejidadCuadratica cc = new ComplejidadCuadratica();
        cc.ejemplo(ejemplo);

        ComplejidadLogaritmica clog = new ComplejidadLogaritmica();
        clog.ejemplo(ejemplo, 2);

        ComplejidadNLogN cnlogn = new ComplejidadNLogN();
        cnlogn.ejemplo(1024);

        PeorCasoPromedio pcp = new PeorCasoPromedio();
        int pos = pcp.busquedaLineal(ejemplo, -3);
        System.out.println("Resultado (mejor caso): " + pos);
        pos = pcp.busquedaLineal(ejemplo, 999);
        System.out.println("Resultado (peor caso): " + pos);
    }
}
