package proj_Grupo11;


import com.mycompany.utilitarios.Data;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa a Competição
 *
 * @author Grupo11
 */
public class Competicao  {

    /**
     * O código da competição
     */
    private int codigo;

    /**
     * A denominação da competição
     */
    private String designacao;

    /**
     * A data de início
     */
    private Data dataInicio;

    /**
     * A data do fim
     */
    private Data dataFim;

    /**
     * O nome do Coordenador da Segurança
     */
    private String coordenadorSeguranca;

    /**
     * O formato da competição
     */
    private Formato formato;

    /**
     * O int por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * A string por omissáo
     */
    private static final String STRING_POR_OMISSAO = " ";

    /**
     * A Data por omissáo
     */
    private static final Data DATA_POR_OMISSAO = new Data();

    /**
     * O formato por omissáo
     */
    private static final Formato FORMATO_POR_OMISSAO = Formato.competicaoAPontos;

    /**
     * Constrói uma instância de competição, recebendo código, designação, data
     * de início, data de fim, nome do coordenador de segurança e formato.
     *
     * @param codigo O código da competição
     * @param designacao A denominação da competição
     * @param dataInicio A data de início
     * @param dataFim A data do fim
     * @param coordenadorSeguranca O nome do Coordenador da Segurança
     * @param formato O formato da competição
     */
    public Competicao(int codigo, String designacao, Data dataInicio, Data dataFim, String coordenadorSeguranca, Formato formato) {
        this.codigo = codigo;
        this.designacao = designacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.coordenadorSeguranca = coordenadorSeguranca;
        this.formato = formato;
    }

    /**
     * Constroi uma instância de clube por omissão
     */
    public Competicao() {
        this.codigo = INT_POR_OMISSAO;
        this.designacao = STRING_POR_OMISSAO;
        this.dataInicio = DATA_POR_OMISSAO;
        this.dataFim = DATA_POR_OMISSAO;
        this.formato = FORMATO_POR_OMISSAO;
        this.coordenadorSeguranca = STRING_POR_OMISSAO;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public String getCoordenadorSeguranca() {
        return coordenadorSeguranca;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setCoordenadorSeguranca(String coordenadorSeguranca) {
        this.coordenadorSeguranca = coordenadorSeguranca;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public Formato getFormato() {
        return formato;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append(" Competicao: " + codigo);
        sb.append(" - Designacao: " + designacao);
        sb.append(" - Data de Inicio: " + dataInicio);
        sb.append(" - Data de Fim: " + dataFim);
        sb.append(" - Nome do Coordenador de Seguranca: " + coordenadorSeguranca);
        sb.append(" - Formato: " + formato);
        sb.append("\n");

        return sb.toString();

    }

    /**
     * Define o código da competição
     *
     * @param codi A designação do clube
     */
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
        final Competicao other = (Competicao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.designacao, other.designacao)) {
            return false;
        }
        if (!Objects.equals(this.coordenadorSeguranca, other.coordenadorSeguranca)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (this.formato != other.formato) {
            return false;
        }
        return true;
    }
  

   

}
