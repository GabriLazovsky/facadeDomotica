package facadeDomotica2;

public class Parlante {

    public void encender() {
        System.out.println("Encendiendo Parlante...");
    }

    public void apagar() {
        System.out.println("Apagando Parlante...");
    }

    public void subidavolumen(int volumen) {
        System.out.println("Subiendo volumen a " + volumen);
    }

    public void bajarvolumen(int volumen) {
        System.out.println("Bajando volumen a " + volumen);
    }
}