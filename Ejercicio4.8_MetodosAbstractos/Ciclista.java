public abstract class Ciclista {
    private int identificador;
    private String nombre;
    private int TiempoAcumulado = 0;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getTiempoAcumulado() {
        return TiempoAcumulado;
    }

    protected void setTiempoAcumulado(int TiempoAcumulado) {
        this.TiempoAcumulado = TiempoAcumulado;
    }

    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + nombre);
        System.out.println("Tiempo Acumulado = " + TiempoAcumulado);
    }
}
