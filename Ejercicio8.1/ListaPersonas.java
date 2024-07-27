import java.util.Vector;

public class ListaPersonas {
    Vector<Object> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new Vector<>();
    }

    public void añadirPersona(Persona P) {
        listaPersonas.add(P);
    }

    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
