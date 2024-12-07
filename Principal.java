import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ConsultaMoneda conversion = new ConsultaMoneda();
        var lectura = new Scanner(System.in);
        String monedaInicial = "";
        String monedaFinal;
        double valor;
        double valorConvertido;

        while (!"SALIR".equals(monedaInicial)) {
            System.out.println("**********************************");
            System.out.println("Sea bienvenido al conversor de monedas :)");
            System.out.println("Monedas posibles a convertir:");
            System.out.println("USD");
            System.out.println("ARS");
            System.out.println("COP");
            System.out.println("BOB");
            System.out.println("BRL");
            System.out.println("CLP");
            System.out.println("ingrese salir para terminar la ejecucion");
            System.out.println("Ingrese de que moneda quiere partir la conversion: ");
            monedaInicial = lectura.nextLine().toUpperCase();
            System.out.println("Ingrese a que moneda quiere convertir sus " + monedaInicial);
            monedaFinal = lectura.nextLine().toUpperCase();
            System.out.println("ingrese el valor a convertir: ");
            valor = lectura.nextDouble();


            try {
                var consulta = conversion.cotizacionDe(monedaInicial);

                valorConvertido = valor * consulta.get(monedaFinal);

                System.out.println("sus " + valor + monedaInicial + " equivalen a " + valorConvertido
                        + monedaFinal);
                System.out.println("**********************************");


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }
}
