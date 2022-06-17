 package proj_Grupo11;


import com.mycompany.utilitarios.Data;
import java.util.ArrayList;

public class  CompeticaoExterna extends Competicao implements IPagavel {

    // Atriubutos de Instância
    private int custoBase;
    private String diretorSeguranca;
    private Equipa equipa;
    ArrayList<EquipaExterna> EquipasExternas = new ArrayList<>();

    // Construtores
    public CompeticaoExterna(int custoBase, String diretorSeguranca, Equipa equipa, int codigo, String designacao, Data dataInicio, Data dataFim, String coordenadorSeguranca, Formato formato) {

        super(codigo, designacao, dataInicio, dataFim, coordenadorSeguranca, formato);
        this.custoBase = custoBase;
        this.diretorSeguranca = diretorSeguranca;
        this.equipa = equipa;

    }

    public CompeticaoExterna(int custoBase, String diretorSeguranca, Equipa equipa) {

        this.custoBase = custoBase;
        this.diretorSeguranca = diretorSeguranca;
        this.equipa = equipa;

    }

    // Gets e Sets
    public int getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(int custoBase) {
        this.custoBase = custoBase;
    }

    public String getDiretorSeguranca() {
        return diretorSeguranca;
    }

    public void setDiretorSeguranca(String nomeDiretorSeguranca) {
        this.diretorSeguranca = nomeDiretorSeguranca;
    }

    public Equipa getEquipa() {
        return equipa;
    }

    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }

    public ArrayList<EquipaExterna> getEquipasExternas() {
        return EquipasExternas;
    }

    public void setEquipasExternas(ArrayList<EquipaExterna> EquipasExternas) {
        this.EquipasExternas = EquipasExternas;
    }

    // obterCustoInscricao
    @Override
    public float obterCustoInscricao(Data dataInferior, Data dataSuperior) {

        if (dataInferior.equals(super.getDataInicio()) == false && dataSuperior.equals(super.getDataFim()) == false) {
            custoBase += custoBase * 0.2;
        }
        return custoBase;

    }

}
