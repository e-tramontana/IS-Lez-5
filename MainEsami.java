/**
 * Classe con metodo main
 */
public class MainEsami {
    public static void main(String[] args) {
        Creator crea = new StCreator();
        Client c = new Client(crea);
        c.registraUnEsame();
        c.sequenzaOperazioni();

        IStudente s1 = c.getStudente();
        s1.nuovoEsame("Geo", 9);
        s1.getMedia();
        System.out.println("num istanze " + crea.getNum());
    }
}
