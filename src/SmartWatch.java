import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        ArrayList<Integer> pasos = new ArrayList<Integer>();
        pasos.add(300);
        pasos.add(405);
        pasos.add(403);
        pasos.add(506);
        pasos.add(100020040);
        pasos.add(45006);
        pasos.add(-1044);
        clearSteps(pasos);
        promedio(clearSteps(pasos));

    }
    public static ArrayList<Integer> clearSteps(ArrayList <Integer> lista) {
        for (int i = 0 ; i < lista.size(); i++)
            if(lista.get(i) < 200 || lista.get(i) > 100000) {
                lista.remove(i);
            }
        return lista;
    }

    public static void promedio(ArrayList <Integer> lista2) {

        int suma = 0 ;
        for (Integer e : lista2) {
            suma = suma + e;
        }
        System.out.println("Para la entrada anterior el resultado es " + suma/lista2.size());
    }

}