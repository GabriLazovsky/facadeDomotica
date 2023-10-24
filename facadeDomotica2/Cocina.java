package facadeDomotica2;

public class Cocina {

    private static Horno horno = new Horno();
    private static LucesHabitacion lucesHabitacionCocina = new LucesHabitacion();

    public Cocina() {
        this.horno = new Horno();
        this.lucesHabitacionCocina = new LucesHabitacion();
    }
}

