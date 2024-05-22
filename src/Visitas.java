import java.util.ArrayList;

public class Visitas {
    public static void main(String[] args) {
    promedio();
    }
    public static void promedio() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3001);
        lista.add(1402);
        lista.add(1304);
        lista.add(1505);
        int suma = 0 ;

        for (Integer e : lista) {
            suma = suma + e;
        }
        System.out.println("Para la entrada anterior el resultado es " + suma/lista.size());
    }
}