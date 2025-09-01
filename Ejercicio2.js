
const readline = require('readline');


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// Definición del TDA como clase
class Arreglo {
    constructor() {
        this.Nombres = [];
    }

    AgregarNombre(nombre) {
        this.Nombres.push(nombre);
    }

    ObtenerNombre(posicion) {
        if (posicion >= 0 && posicion < this.Nombres.length) {
            return this.Nombres[posicion];
        } else {
            return "Posición inválida";
        }
    }

    Cantidad() {
        return this.Nombres.length;
    }
}

// Crear objeto
const arr = new Arreglo();

// Función para preguntar al usuario y procesar la entrada
function preguntar() {
    rl.question("Ingresa tu Nombre: ", function(nombre) {
        arr.AgregarNombre(nombre);

        const ultimaPosicion = arr.Cantidad() - 1;
        console.log(`El nombre guardado en la posición ${ultimaPosicion} es: ${arr.ObtenerNombre(ultimaPosicion)}`);

        rl.question("Desea Continuar? (S/N): ", function(respuesta) {
            if (respuesta.toUpperCase() === "S") {
                preguntar();  // Llamada para continuar el ciclo
            } else {
                console.log("Programa finalizado.");
                rl.close();
            }
        });
    });
}

// Iniciar el ciclo
preguntar();