// Clase base
class Persona {
    constructor(public nombre: string) {}
}

// Clase que hereda de Persona
class Mujer extends Persona {
    constructor(nombre: string) {
        super(nombre);
    }

    recibirRegalo(regalo: string, deParteDe: string) {
        console.log(`${this.nombre} ha recibido: ${regalo} de parte de ${deParteDe}. ❤️`);
    }
}
class Hombre extends Persona {
    constructor(nombre: string) {
        super(nombre);
    }
}

// Definimos a Luce
const luce = new Mujer("Luce");

// Definimos a Lorenzo con su método especial
const lorenzo = {
    nombre: "Lorenzo",
    profesion: "Programador",
    
    darCorazon: (destinataria: Mujer) => {
        console.log(`${lorenzo.nombre} está preparando un gesto especial...`);
        destinataria.recibirRegalo("su corazón y alma", lorenzo.nombre);
    }
};

// Ejecución de la acción
lorenzo.darCorazon(luce);
