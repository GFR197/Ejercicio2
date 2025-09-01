class Arreglo:
    def __init__(self):
        #Definimos el atributo
        self.Nombres = []
        

    # Definimos las operaciones publicas y privadas
    def AgregarNombre(self, Nombre):
        self.Nombres.append(Nombre)

        

    def ObtenerNombre(self, Posicion):
        if Posicion >= 0 and Posicion < len(self.Nombres):
          return self.Nombres[Posicion]
        

  
    def Cantidad(self):
        return len(self.Nombres)
        pass
#creamos el objeto del TDA para poderlo manipular correctamente
arr = Arreglo()

Continuar = "S"

#abrimos ciclo while
while Continuar.upper() == "S":
  nombre = input("Ingresa tu Nombre: ")
  arr.AgregarNombre(nombre)

  UltimaPosicion = arr.Cantidad() -1
  #Concatenamos resultados almacenados en nuestro arreglo
  print("El nombre guardado en la posicion ", UltimaPosicion, " Es: ", arr.ObtenerNombre(UltimaPosicion))
  #condicionamos la salida o continuacion del ciclo segun sea el caso
  Continuar = input("Desea Continuar? (S/N) ")




