public class CuentaCorriente extends Cuenta{
    float Sobregiro;

    public CuentaCorriente(float Saldo, float tasaAnual) {
        super(Saldo, tasaAnual);
        Sobregiro = 0;
    }

    public void retirar(float Cantidad) {
        float resultado = Saldo - Cantidad;
        if(resultado < 0) {
            Sobregiro = Sobregiro - resultado;
            Saldo = 0;
        }else {
            super.retirar(Cantidad);
        }
    }

    public void consignar(float Cantidad) {
        float residuo = Sobregiro - Cantidad;

        if(Sobregiro > 0 ) {
            if(residuo > 0) {
                Sobregiro = 0;
                Saldo = residuo;
            }else {
                Sobregiro = -residuo;
                Saldo = 0;
            }
        }else {
            super.consignar(Cantidad);
        }
    }

    public void extractoMensual() {
        super.extractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + Saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sobregiro = $ " + Sobregiro);
        System.out.println();
    }
}
