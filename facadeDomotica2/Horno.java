package facadeDomotica2;

public class Horno {
    public void encender(){
        System.out.println("Encendiendo horno...");
    }
    public void apagar(){
        System.out.println("Apagando horno...");
    }
    public void subirTemperatura(int temperatura){
        System.out.println("Subiendo temperatura horno a "+temperatura+" grados");
    }
    public void bajarTemperatura(int temperatura){
        System.out.println("Bajando temperatura horno a "+temperatura+" grados");
    }
}
