public class Cerralheria extends Marcenaria {

    private String solda;
    private String esmerilhadeira;
    private String lixa;

    public Cerralheria(String endereco, String nome, String telefone, String cnpj, String solda, String esmerilhadeira,
            String lixa) {
        super(endereco, nome, telefone, cnpj);
        this.solda = solda;
        this.esmerilhadeira = esmerilhadeira;
        this.lixa = lixa;
    }

    public String getsolda() {
        return solda;
    }

    public void setsolda(String solda) {
        this.solda = solda;
    }

    public String getesmerilhadeira() {
        return esmerilhadeira;
    }

    public void setesmerilhadeira(String esmerilhadeira) {
        this.esmerilhadeira = esmerilhadeira;
    }

    public String getlixa() {
        return lixa;
    }

    public void setlixa(String lixa) {
        this.lixa = lixa;
    }

}