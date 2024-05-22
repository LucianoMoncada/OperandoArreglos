import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(33);
        numeros.add(21);
        numeros.add(8);
        numeros.add(2);
        numeros.add(61);
        suma(numeros);
        promedio(numeros);
    }

    public static void suma (ArrayList <Integer> lista) {
        int suma = 0 ;
        for (Integer e : lista) {
            if ( e%3 == 0) {
                suma = suma + e;
            }
        }
        System.out.println("Para la entrada anterior el resultado de la suma es " + suma);
    }

    //Respuesta 4 Promedios//

    public static void promedio (ArrayList <Integer> lista2) {
        int memo = 0;
        int suma = 0;
        for (Integer e : lista2) {
            if ( e%3 == 0) {
                suma = suma + e;
                memo++;
            }
        }
        System.out.println("Para la entrada anterior el resultado del promedio es " + suma/memo);

    }
}

