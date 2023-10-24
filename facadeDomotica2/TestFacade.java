package facadeDomotica2;

/* Client */
public class TestFacade {

    public static void main(String[] args) {
        CasaFacade casa = new CasaFacade();
        System.out.println("");
        casa.apagarTodasLasLuces();
        System.out.println(" ");
        casa.encenderTodasLasLuces();
        System.out.println(" ");
        casa.prepararCocinaConMusica();
    }
}
