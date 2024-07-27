import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial = $ ");
        float saldoInicialAhorros = sc.nextFloat();
        System.out.println("Ingrese tasa de interés = ");
        float tasaAhorros = sc.nextFloat();
        CuentaAhorros cuenta = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.println("Ingresar cantidad a consignar = $ ");
        float cantidadDepositar = sc.nextFloat();
        cuenta.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar = $ ");
        float cantidadRetirar = sc.nextFloat();
        cuenta.retirar(cantidadRetirar);
        cuenta.extractoMensual();
        cuenta.imprimir();
        sc.close();
    }
}
