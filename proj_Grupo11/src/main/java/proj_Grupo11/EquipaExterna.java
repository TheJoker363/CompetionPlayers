
package proj_Grupo11;

import java.util.Objects;

public class EquipaExterna implements IAlojar {

    // Atributos de Instância
    private String nome;
    private String escalao;
    private String cidadeOrigem;
    private String paisOrigem;
    private boolean alojamento;

    // Construtores
    public EquipaExterna(String nome, String escalao, String cidadeOrigem, String paisOrigem, boolean pedidoAlojamento) {

        this.nome = nome;
        this.escalao = escalao;
        this.cidadeOrigem = cidadeOrigem;
        this.paisOrigem = paisOrigem;
        this.alojamento = pedidoAlojamento;

    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscalao() {
        return escalao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean getAlojamento() {
        return alojamento;
    }

    public void setAlojamento(boolean alojamento) {
        this.alojamento = alojamento;
    }


    // toString
    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append(" Equipa Externa:");
        sb.append(" - Nome da Equipa: " + nome);
        sb.append(" - Escalao: " + escalao);
        sb.append(" - Cidade de Origem: " + cidadeOrigem);
        sb.append(" - Pais de Origem: " + paisOrigem);
        sb.append("\n");

        return sb.toString();

    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EquipaExterna other = (EquipaExterna) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.escalao, other.escalao)) {
            return false;
        }
        if (!Objects.equals(this.cidadeOrigem, other.cidadeOrigem)) {
            return false;
        }
        if (!Objects.equals(this.paisOrigem, other.paisOrigem)) {
            return false;
        }
        if (!Objects.equals(this.alojamento, other.alojamento)) {
            return false;
        }
        return true;
    }

}
