public abstract class Creator {
    private int numIstanze = 0;
    public abstract IStudente getStudente();
    public IStudente creaStudente() {
        numIstanze++;
        return getStudente();
    }
    public int getNum() {
        return numIstanze;
    }
    public abstract IStudente ripristina(IStudente s);

    public abstract IStudente sospendi(IStudente s);
}
