public class Cuenta {
    protected float Saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float Saldo, float tasaAnual) {
        this.Saldo = Saldo;
        this.tasaAnual = tasaAnual;
    } 

    public void consignar(float Cantidad) {
        Saldo = Saldo + Cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirar(float Cantidad) {
        float nuevoSaldo = Saldo - Cantidad;
        if(nuevoSaldo >= 0) {
            Saldo -= Cantidad;
            numeroRetiros = numeroRetiros + 1;
        }else {
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }

    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12;
        float interesMensual = Saldo * tasaMensual;
        Saldo += interesMensual;
    }

    public void extractoMensual() {
        Saldo -= comisionMensual;
        calcularInteres();
    }
}