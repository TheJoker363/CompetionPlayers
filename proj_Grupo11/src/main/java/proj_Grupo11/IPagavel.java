package proj_Grupo11;

import com.mycompany.utilitarios.Data;



public interface IPagavel {

    /**
     * Devolve o custo da inscrição na competição externa
     *
     * @param data limite inferior e data limite superior
     * @return custo da inscrição
     */
    public float obterCustoInscricao(Data dataInferior, Data dataSuperior);

}
