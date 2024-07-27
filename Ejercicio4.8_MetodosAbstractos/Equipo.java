import java.util.Vector;
import java.util.Scanner;

public class Equipo {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector<Object> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    void listarEquipo() {
        for(int i=0; i < listaCiclistas.size(); i++) {
            Ciclista C = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(C.getNombre());
        }
    }

    void buscarCiclista() {
        String nombreCiclista = sc.next();
        for(int i=0; i<listaCiclistas.size(); i++) {
            Ciclista C = (Ciclista) listaCiclistas.elementAt(i);
            if(C.getNombre().equals(nombreCiclista)) {
                System.out.println(C.getNombre());
            }
        }
    }

    void calcularTotalTiempo() {
        for(int i=0; i<listaCiclistas.size(); i++) {
            Ciclista C = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo = totalTiempo + C.getTiempoAcumulado();
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}