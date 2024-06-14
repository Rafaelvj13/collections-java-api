package Set.Basico;

public class Convidado {

    String nome;
    int codigoConvite;

    public Convidado(int codigoConvite, String nome) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}


