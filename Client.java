/** Avvia alcune operazioni su uno studente */
public class Client {
    private IStudente s;
    private Creator creat;

    public Client(Creator c) {
        creat = c;
    }

    /** Chiede di creare una istanza di Studente e registra un esame. */
    public void registraUnEsame() {
        s = creat.creaStudente();
        s.nuovoEsame("Maths", 8);
    }

    /**
     * Registra un esame, sospende la carriera, riprende la carriera, e registra un
     * esame.
     */
    public void sequenzaOperazioni() {
        s.nuovoEsame("English", 7);
        s.getMedia();

        System.out.println("* Sospensione carriera *");
        s = creat.sospendi(s);
        System.out.println("prova a registrare un esame");
        s.nuovoEsame("History", 8);
        s.getMedia();

        System.out.println("* Ripristino carriera *");
        s = creat.ripristina(s);
        System.out.println("prova a registrare un esame");
        s.nuovoEsame("History", 8);
        s.getMedia();
    }

    public IStudente get() {
        return s;
    }
}
