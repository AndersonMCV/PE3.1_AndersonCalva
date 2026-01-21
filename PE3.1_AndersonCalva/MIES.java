public class MIES {

    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTURA_RURAL = 1.15;

    public static double calculo(int dependientes, boolean esRural) {
        double monto = MONTO_BASE;
        for(int i = 0; i < dependientes; i++) {
            monto += MONTO_DEPENDIENTE;
        }
        if (esRural) {
            monto = monto * FACTURA_RURAL;
        }
        return monto;
        // return esRural ? monto * FACTOR_RURAL : monto;
    }

    public static void main(String[] args){
        System.out.println("Caso 1: Zona Urbana" + calculo(0, false) );
        System.out.println("Caso 2: Alddrin: Zona Urbana" + calculo(3, false) );
        System.out.println("Caso 2: Salinas: Zona Rural" + calculo(7, true) );

    }

}