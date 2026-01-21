public class calculoRecursivo {
    private static double MONTO_BASE = 55.0;
    private static double MONTO_DEPENDIENTE = 15.0;
    private static double FACTURA_RURAL = 1.15;

    private static double calcularRecursivo(int dependientes, boolean esRural) {
        // caso exitoso donde no hay dependientes ni es rural
        if(dependientes == 0) {
            return esRural ? MONTO_BASE * FACTURA_RURAL : MONTO_BASE;
        }
        // Recursividad

        double montoAnterior = calcularRecursivo(dependientes - 1, esRural);
        double adicional = esRural ? MONTO_DEPENDIENTE * FACTURA_RURAL : MONTO_DEPENDIENTE;



        return montoAnterior + adicional;
    
    }
    private static double calcularRecursivoError(int dependientes, boolean esRural) {

        return calcularRecursivoError(dependientes, esRural) + MONTO_DEPENDIENTE;
    }

    public static void main(String[] args){
        System.out.println("Caso 1: Zona Urbana" + calcularRecursivo(0, false) );
        System.out.println("Caso 1: Alddrin Zona Urbana" + calcularRecursivo(3, false) );
        System.out.println("Caso 1: Salinas Zona Rural" + calcularRecursivo(7, true) );

        // EJECUCIÓN CON ERROR
        // calcularRecursivoError(3, true);

    }
}
