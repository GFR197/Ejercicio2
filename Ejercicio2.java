import java.util.ArrayList;
import java.util.Scanner;

class Arreglo {
    // Atributo
    private ArrayList<String> Nombres;

   
    public Arreglo() {
        Nombres = new ArrayList<>();
    }

    // agregamos nombre
    public void AgregarNombre(String nombre) {
        Nombres.add(nombre);
    }

    // obtenemos un nombre en una posición específica
    public String ObtenerNombre(int posicion) {
        if (posicion >= 0 && posicion < Nombres.size()) {
            return Nombres.get(posicion);
        } else {
            return "Posición inválida";
        }
    }

    // Obtenemos la cantidad de nombres
    public int Cantidad() {
        return Nombres.size();
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Arreglo arr = new Arreglo();  // Creamos el objeto
        Scanner sc = new Scanner(System.in);

        String continuar = "S";
        //Abrimos ciclo while
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingresa tu Nombre: ");
            String nombre = sc.nextLine();
            arr.AgregarNombre(nombre);

            int ultimaPosicion = arr.Cantidad() - 1;

            System.out.println("El nombre guardado en la posición " + ultimaPosicion + 
                               " es: " + arr.ObtenerNombre(ultimaPosicion));

            System.out.print("Desea Continuar? (S/N): ");
            continuar = sc.nextLine();
        }

        sc.close();
    }
}
