public class Prueba {
    public static void main(String[] args) {
        Animal[] Animales = new Animal[4];
        Animales[0] = new Gato();
        Animales[1] = new Perro();
        Animales[2] = new Lobo();
        Animales[3] = new Leon();

        for(int i=0; i<Animales.length; i++) {
            System.out.println(Animales[i].getNombreCientifico());
            System.out.println("Sonido: " + Animales[i].getSonido());
            System.out.println("Alimentos: " + Animales[i].getAlimentos());
            System.out.println("Hábitat: " + Animales[i].getHabitat());
            System.out.println();
        }
    }
}
