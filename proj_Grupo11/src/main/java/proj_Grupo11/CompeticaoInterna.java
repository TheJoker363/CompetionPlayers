package proj_Grupo11;


import com.mycompany.utilitarios.Data;
import java.util.ArrayList;

public class CompeticaoInterna extends Competicao {
    
    // Atributos de Instância
    ArrayList<Equipa> equipasInternas = new ArrayList<>();

    // Construtores
    public CompeticaoInterna(int codigo, String designacao, Data dataInicio, Data dataFim, String coordenadorSeguranca, Formato formato) {
        super(codigo, designacao, dataInicio, dataFim, coordenadorSeguranca, formato);
        this.equipasInternas = new ArrayList <>();
    
    }

    // Get
    public ArrayList<Equipa> getEquipasInternas() {
        return equipasInternas;
        
    }
    
}