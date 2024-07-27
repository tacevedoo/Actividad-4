public class CuentaAhorros extends Cuenta{
    private boolean Activa;

    public CuentaAhorros(float Saldo, float tasaAnual) {
        super(Saldo, tasaAnual);
        if(Saldo < 10000) {
            Activa = false;
        }else {
            Activa = true;
        }
    }

    public void retirar(float Cantidad) {
        if(Activa) {
            super.retirar(Cantidad);
        }
    }

    public void consignar(float Cantidad) {
        if(Activa) {
            super.consignar(Cantidad);
        }
    }

    public void extractoMensual() {
        if(numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if(Saldo < 10000) {
            Activa = false;
        }
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + Saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
