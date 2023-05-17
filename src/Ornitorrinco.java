public class Ornitorrinco extends Mamifero implements Anfibio, Venenoso, Oviparo{

    @Override
    void amamantar() {//Implementacion del metodo abstracto de la clase Mamifero
        System.out.println("Amamantando.. crias por la panza..");
    }

    @Override
    public void respirarBajoElAgua() {//Implementacion del metodo de la interfaz Anfibio
        System.out.println("Respirando bajo el agua..");
    }

    @Override
    public void respirarPulmonar() {//Implementacion del metodo de la interfaz Anfibio
        System.out.println("Respirando aire..");
    }

    @Override
    public int ponerHuevos() {//Implementacion del metodo de la interfaz Oviparo
        //Retonra un numero aleatorio entre 1 y 5
        return (int) ((Math.random() * (5 - 1)) +1);
    }

    @Override
    public void envenenar() {//Implementacion del metodo de la interfaz Venenoso
        System.out.println("Envenenando por las paticas..");

    }
}
