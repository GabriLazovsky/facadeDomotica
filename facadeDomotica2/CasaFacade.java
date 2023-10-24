package facadeDomotica2;

public class CasaFacade {
    private LucesHabitacion lucesHabitacion;
    private LucesCocina lucesCocina;
    private Parlante parlante;
    private Horno horno;
    private Cocina cocina;
    private Habitacion habitacion;



    public  CasaFacade() {
        this.lucesHabitacion = new LucesHabitacion();
        this.lucesCocina = new LucesCocina();
        this.parlante = new Parlante();
        this.horno = new Horno();
        this.cocina = new Cocina();
        this.habitacion = new Habitacion();
    }

    public void encenderTodasLasLuces() {
        lucesHabitacion.enceder();
        lucesCocina.enceder();

    }

    public void prepararCocinaConMusica() {
        lucesCocina.enceder();
        horno.subirTemperatura(200);
        parlante.encender();
        parlante.subidavolumen(60);

    }

    public void apagarTodasLasLuces() {
        lucesHabitacion.apagar();
        lucesCocina.apagar();
    }
}

// Grupo Conformado por Encarnación Teresa González Buitrago, Gabriel Lazovsky Igual, Nicolas Lopez Pizza