// See https://aka.ms/new-console-template for more information
using System;
using System.Collections.Generic;

class Arreglo
{
    // Atributo
    private List<string> Nombres;

    
    public Arreglo()
    {
        Nombres = new List<string>();
    }

    // agregamos nombre
    public void AgregarNombre(string nombre)
    {
        Nombres.Add(nombre);
    }

    // obtenemos un nombre en una posición específica
    public string ObtenerNombre(int posicion)
    {
        if (posicion >= 0 && posicion < Nombres.Count)
        {
            return Nombres[posicion];
        }
        else
        {
            return "Posición inválida";
        }
    }

    // obtenemos la cantidad de nombres
    public int Cantidad()
    {
        return Nombres.Count;
    }
}

class Program
{
    static void Main()
    {
        Arreglo arr = new Arreglo(); // Creamos el objeto
        string continuar = "S";

        while (continuar.ToUpper() == "S")
        {
            Console.Write("Ingresa tu Nombre: ");
            string nombre = Console.ReadLine();
            arr.AgregarNombre(nombre);

            int ultimaPosicion = arr.Cantidad() - 1;

            Console.WriteLine("El nombre guardado en la posición " + ultimaPosicion +
                              " es: " + arr.ObtenerNombre(ultimaPosicion));

            Console.Write("Desea Continuar? (S/N): ");
            continuar = Console.ReadLine();
        }
    }
}
