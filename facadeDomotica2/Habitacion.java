package facadeDomotica2;

public class Habitacion {
    private static LucesHabitacion lucesHabitacion;
    private static Parlante parlante = new Parlante();

    public Habitacion(){
        this.lucesHabitacion = new LucesHabitacion();}
}
