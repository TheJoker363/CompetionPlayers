package proj_Grupo11;

import com.mycompany.utilitarios.Data;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Representa um clube
 *
 * @author Grupo11
 */
public class Clube {

    /**
     * A denominação do clube
     */
    private String denominacao;

    /**
     * O NIF do clube
     */
    private String nif;

    /**
     * O endereço do clube
     */
    private String endereco;

    /**
     * A data de constituição do clube
     */
    private Data dataConstituicao;

    /**
     * O contacto telefónico do clube
     */
    private String telefone;

    /**
     * O endereço eletrónico do clube
     */
    private String email;

    /**
     * A página Web do clube
     */
    private String paginaWeb;

    /**
     * Os atletas do clube
     */
    private ArrayList<Atleta> atletas;

    /**
     * As modalidades do clube
     */
    private ArrayList<Modalidade> modalidades;

    /**
     * As equipas do clube
     */
    private ArrayList<Equipa> equipas;
    /**
     * As competicoes do clube
     */
    private ArrayList<Competicao> competicao;
    /**
     * As competicoes externas do clube
     */

    private ArrayList<CompeticaoExterna> ce;
    /**
     * As competicoes intenras do clube
     */
    private ArrayList<CompeticaoInterna> ci;

    /**
     * A string por omissáo
     */
    private static final String STRING_POR_OMISSAO = "a preencher";

    /**
     * O inteiro por omissão
     */
    private static final int INT_POR_OMISSAO = 0;

    /**
     * Constroi uma instância de clube por omissão
     */
    public Clube() {
        setDenominacao(STRING_POR_OMISSAO);
        setNif(STRING_POR_OMISSAO);
        setEndereco(STRING_POR_OMISSAO);
        setDataConstituicao(new Data());
        setTelefone(STRING_POR_OMISSAO);
        setEmail(STRING_POR_OMISSAO);
        setPaginaWeb(STRING_POR_OMISSAO);
        setModalidades(new ArrayList<Modalidade>());
        setEquipas(new ArrayList<Equipa>());
        setAtletas(new ArrayList<Atleta>());
        setCompeticao(new ArrayList<Competicao>());
        setCe(new ArrayList<CompeticaoExterna>());
        setCi(new ArrayList<CompeticaoInterna>());
    }

    /**
     * Constrói uma instância de clube, recebendo designação, nif, endereço,
     * dataConstituição, telefone, email e página web. Os ArrayList de
     * modalidades, equipas,atletas,competicao,ce e ci são criados vazios.
     *
     * @param designacao A designação do clube
     * @param nif O NIF do clube
     * @param endereco O endereço do clube
     * @param dataConstituicao A data de constituição do clube
     * @param telefone O contacto telefónico do clube
     * @param email O email do clube
     * @param paginaWeb A página web do clube
     */
    public Clube(String designacao, String nif, String endereco, Data dataConstituicao, String telefone, String email, String paginaWeb) {
        setDenominacao(designacao);
        setNif(nif);
        setEndereco(endereco);
        setDataConstituicao(dataConstituicao);
        setTelefone(telefone);
        setEmail(email);
        setPaginaWeb(paginaWeb);
        setModalidades(new ArrayList<Modalidade>());
        setEquipas(new ArrayList<Equipa>());
        setAtletas(new ArrayList<Atleta>());
        setCompeticao(new ArrayList<Competicao>());
        setCe(new ArrayList<CompeticaoExterna>());
        setCi(new ArrayList<CompeticaoInterna>());
    }

    /**
     * Constrói uma instância de clube, recebendo designação, nif, endereço,
     * dataConstituição, telefone, email e pággina web, e listas de modalidades,
     * equipas, atletas, competicao, ce e ci.
     *
     * @param designacao A designação do clube
     * @param nif O NIF do clube
     * @param endereco O endereço do clube
     * @param dataConstituicao A data de constituição do clube
     * @param telefone O contacto telefónico do clube
     * @param email O email do clube
     * @param paginaWeb A página web do clube
     * @param modalidades A lista de modalidades do clube
     * @param equipas A lista de equipas do clube
     * @param atletas A lista de atletas do clube
     * @param competicao A lista de competicoes do clube
     * @param ce A lista de competicoes externas do clube
     * @param ci A lista de competicoes internas do clube
     */
    public Clube(String designacao, String nif, String endereco, Data dataConstituicao, String telefone, String email, String paginaWeb, ArrayList<Modalidade> modalidades, ArrayList<Equipa> equipas, ArrayList<Atleta> atletas, ArrayList<Competicao> competicao, ArrayList<CompeticaoExterna> ce, ArrayList<CompeticaoInterna> ci) {
        setDenominacao(designacao);
        setNif(nif);
        setEndereco(endereco);
        setDataConstituicao(dataConstituicao);
        setTelefone(telefone);
        setEmail(email);
        setPaginaWeb(paginaWeb);
        setModalidades(modalidades);
        setEquipas(equipas);
        setAtletas(atletas);
        setCompeticao(new ArrayList<Competicao>());
        setCe(new ArrayList<CompeticaoExterna>());
        setCi(new ArrayList<CompeticaoInterna>());
    }

    /**
     * Constrói uma instância de clube, por cópia de outro clube
     *
     * @param clube O clube a copiar
     */
    public Clube(Clube clube) {
        setDenominacao(clube.denominacao);
        setNif(clube.nif);
        setEndereco(clube.endereco);
        setDataConstituicao(clube.dataConstituicao);
        setTelefone(clube.telefone);
        setEmail(clube.email);
        setPaginaWeb(clube.paginaWeb);
        setModalidades(clube.modalidades);
        setEquipas(clube.equipas);
        setAtletas(clube.atletas);
        setCompeticao(clube.competicao);
        setCe(clube.ce);
        setCi(clube.ci);
    }

    /**
     * Define a designação do clube
     *
     * @param designacao A designação do clube
     */
    public void setDenominacao(String designacao) {
        this.denominacao = designacao;
    }

    /**
     * Define o nif do clube
     *
     * @param nif O NIF do clibe
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Define o endereço do clube
     *
     * @param endereco O endereço do clube
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define a data de constituição do clube
     *
     * @param dataConstituicao A data de constituição do clube
     */
    public void setDataConstituicao(Data dataConstituicao) {
        this.dataConstituicao = new Data(dataConstituicao);
    }

    /**
     * Define o contacto telefónico do clube
     *
     * @param telefone O contacto telefónico do clube
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Define o contacto eletrónico do clube
     *
     * @param email O contacto eletrónico do clube
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define a página web do clube
     *
     * @param paginaWeb A página web do clube
     */
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    /**
     * Define a lista de modalidades do clube
     *
     * @param modalidades A lista de modalidades do clube
     */
    public void setModalidades(ArrayList<Modalidade> modalidades) {
        this.modalidades = new ArrayList<>(modalidades);
    }

    /**
     * Define a lista de equipas do clube
     *
     * @param equipas A lista de equipas do clube
     */
    public void setEquipas(ArrayList<Equipa> equipas) {
        this.equipas = new ArrayList<>(equipas);
    }

    /**
     * Define a lista de atletas do clube
     *
     * @param atletas A lista de atletas do clube
     */
    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = new ArrayList<>(atletas);
    }

    /**
     * Define a lista de competicoes do clube
     *
     * @param competicao A lista de competicoes do clube
     */
    public void setCompeticao(ArrayList<Competicao> competicao) {
        this.competicao = competicao;
    }

    /**
     * Define a lista de competicoes externas do clube
     *
     * @param ce A lista de competicoes externas do clube
     */
    public void setCe(ArrayList<CompeticaoExterna> ce) {
        this.ce = ce;
    }

    /**
     * Define a lista de competicoes internas do clube
     *
     * @param ci A lista de competicoes internas do clube
     */
    public void setCi(ArrayList<CompeticaoInterna> ci) {
        this.ci = ci;
    }

    /**
     * Devolve a denominação do clube
     *
     * @return A denominação do clube
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * Devolve o NIF do clube
     *
     * @return O NIF do clube
     */
    public String getNif() {
        return nif;
    }

    /**
     * Devolve o endereço do clube
     *
     * @return O endereço do clube
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Devolve a data de constituição do clube
     *
     * @return A data de constituição do clube
     */
    public Data getDataConstituicao() {
        return dataConstituicao;
    }

    /**
     * Devolve o contacto telefónico do clube
     *
     * @return O contacto telefónico do clube
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Devolve o email do clube
     *
     * @return O email do clube
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve a página web do clube
     *
     * @return A página web do clube
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }

    /**
     * Devolve a lista de atletas do clube
     *
     * @return A lista de atletas do clube
     */
    public ArrayList<Atleta> getAtletas() {
        return new ArrayList(atletas);
    }

    /**
     * Devolve a lista de modalidades do clube
     *
     * @return A lista de modalidades do clube
     */
    public ArrayList<Modalidade> getModalidades() {
        return new ArrayList(modalidades);
    }

    /**
     * Devolve a lista de equipas do clube
     *
     * @return A lista de equipas do clube
     */
    public ArrayList<Equipa> getEquipas() {
        return new ArrayList(equipas);
    }

    /**
     * Devolve a lista de competicoes do clube
     *
     * @return A lista de competicoes do clube
     */
    public ArrayList<Competicao> getCompeticao() {
        return competicao;
    }

    /**
     * Devolve a lista de competicoes externas do clube
     *
     * @return A lista de competicoes externas do clube
     */
    public ArrayList<CompeticaoExterna> getCe() {
        return ce;
    }

    /**
     * Devolve a lista de competicoes internas do clube
     *
     * @return A lista de competicoes internas do clube
     */
    public ArrayList<CompeticaoInterna> getCi() {
        return ci;
    }

    /**
     * Devolve a descrição textual do clube
     *
     * @return A descrição textual do clube
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDesignação -> ");
        sb.append(denominacao);
        sb.append("\nNIF: ");
        sb.append(nif);
        sb.append("\nEndereço: ");
        sb.append(endereco);
        sb.append("\nData de constituição -> ");
        sb.append(dataConstituicao);
        sb.append("\nTelefone -> ");
        sb.append(telefone);
        sb.append("\nEmail -> ");
        sb.append(email);
        sb.append("\nModalidades:");
        if (modalidades.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Modalidade m : modalidades) {
                sb.append(m);
            }
        }
        sb.append("\nEquipas:");
        if (equipas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Equipa e : equipas) {
                sb.append(e);
            }
        }
        sb.append("\nAtletas:");
        if (atletas.isEmpty()) {
            sb.append(" (vazio) ");
        } else {
            for (Atleta a : atletas) {
                sb.append(a);
            }
        }
        
        sb.append("\nCompeticoes Internas:");
        if (ci.isEmpty()) {
            sb.append(" Não tem competições internas ");
        } else {
            for (CompeticaoInterna compI : ci) {
                sb.append(compI);
            }
        }
        
        sb.append("\nCompeticoes Externas:");
        if (ce.isEmpty()) {
            sb.append(" Não tem competições externas ");
        } else {
            for (CompeticaoExterna compE : ce) {
                sb.append(compE);
            }
        }
        
        return sb.toString();
    }

    /**
     * Determina se o clube é igual a outro clube
     *
     * @param obj O clube com o qual comparar
     *
     * @return TRUE se os clubes forem iguais, FALSE caso contrário
     */
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
        final Clube other = (Clube) obj;
        if (!Objects.equals(this.denominacao, other.denominacao)) {
            return false;
        }
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.paginaWeb, other.paginaWeb)) {
            return false;
        }
        if (!Objects.equals(this.dataConstituicao, other.dataConstituicao)) {
            return false;
        }
        if (!Objects.equals(this.atletas, other.atletas)) {
            return false;
        }
        if (!Objects.equals(this.modalidades, other.modalidades)) {
            return false;
        }
        if (!Objects.equals(this.equipas, other.equipas)) {
            return false;
        }
        if (!Objects.equals(this.competicao, other.competicao)) {
            return false;
        }
        if (!Objects.equals(this.ce, other.ce)) {
            return false;
        }
        return Objects.equals(this.ci, other.ci);
    }

    /**
     * Adiciona um atleta à lista de atletas do clube. O atleta é criado a
     * partir dos dados reebidos: nome, nº de cartão de cidadão, endereço, data
     * de nascimento, contacto telefónico e email
     *
     * @param nome O nome do atleta a adicionar à lista de atletas do clube
     * @param cc O número de cartão de cidadão do atleta a adicionar à lista de
     * atletas do clube
     * @param endereco O endereço do atleta a adicionar à lista de atletas do
     * clube
     * @param dataNascimento A data de nascimento do atleta a adicionar à lista
     * de atletas do clube
     * @param telefone O contacto telefónico do atleta a adicionar à lista de
     * atletas do clube
     * @param email O email do atleta a adicionar à lista de atletas do clube
     */
    public void adicionarAtleta(String nome, String cc, String endereco, Data dataNascimento, String telefone, String email) {
        atletas.add(new Atleta(nome, cc, endereco, dataNascimento, telefone, email));
    }

    /**
     * Adiciona uma modalidade à lista de modalidades do clube. A modalidade é
     * criada a partir dos dados recebidos: nome e ano de ativação
     *
     * @param nome O nome da modalidade
     * @param anoAtivacao O ano de ativação da modalidade
     */
    public void adicionarModalidade(String nome, int anoAtivacao) {
        modalidades.add(new Modalidade(nome, anoAtivacao));
    }

    /**
     * Adiciona uma equipa à lista de equipas do clube. A equipa é criada a
     * partir dos dados recebidos: escalão, ano civil e número da modalidade
     *
     * @param escalao O escaláo da equipa
     * @param anoCivil O ano civil em que a equipa foi constituída
     * @param num O índice da modalidade da equipa
     */
    public void adicionarEquipa(String escalao, int anoCivil, int num) {
        Modalidade modalidade = modalidades.get(num);
        Equipa equipa = new Equipa(escalao, anoCivil, modalidade);
        equipas.add(equipa);
    }

    /**
     * Adiciona um jogador a uma equipa. A equipa e jogador são determinados a
     * partir do seu índice. O número de camisola e posição do jogador são
     * recebidos por parâmetros neste método.
     *
     * @param numEquipa O índice da equipa na lista de equipas
     * @param numAtleta O índice do atleta na lista de atletas
     * @param numeroCamisola O número de camisola do atleta na equipa
     * @param posicaoJogador A posição do jogador na equipa
     */
    public void adicionarJogadorEquipa(int numEquipa, int numAtleta, int numeroCamisola, String posicaoJogador) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            Atleta a = atletas.get(numAtleta);
            if (a != null) {
                equipa.adicionarJogador(numeroCamisola, posicaoJogador, a);
            }
        }
    }

    /**
     * Adiciona um prémio individual a um jogador
     *
     * @param numEquipa O índice da equipa na lista de equipas
     * @param numCamisola O número de camisola do jogado na equipa
     * @param premio O prémio atribuído ao jogador
     * @param anoCivil O ano civil em que foi atribuído o prémio ao jogador
     */
    public void adicionarPremioIndividual(int numEquipa, int numCamisola, String premio, int anoCivil) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            Jogador j = equipa.obterJogador(numCamisola);
            if (j != null) {
                j.adicionarPremioIndividual(premio, anoCivil);
            }
        }
    }

    /**
     * Devolve os jogadores de uma determinada equipa
     *
     * @param numEquipa O índice da equipa na lista de equipas
     *
     * @return A lista de jogadores da equipa
     */
    public ArrayList<Jogador> obterJogadoresEquipa(int numEquipa) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            ArrayList<Jogador> jogadores = equipa.getJogadores();
            return jogadores;
        }
        return null;
    }

    /**
     * Elimina um jogador de uma equipa
     *
     * @param numEquipa O índice da equipa na lista de equipas
     *
     * @param numCamisola O número da camisola do jogador a eliminar
     */
    public void eliminarJogadorEquipa(int numEquipa, int numCamisola) {
        Equipa equipa = equipas.get(numEquipa);
        if (equipa != null) {
            equipa.eliminarJogador(numCamisola);
        }
    }

    /**
     * Determina a quantidade total de prémios individuais dos jogadores que
     * praticam uma dada modalidade
     *
     * @param numModalidade O índice da modalidade na lista das modalidades
     *
     * @return O número total de prémios individuais dos jogadores da modalidade
     */
    public int calcularTotalPremiosIndividuais(int numModalidade) {
        int totalPremios = 0;
        Modalidade modalidade = modalidades.get(numModalidade);
        if (modalidade != null) {
            for (Equipa e : equipas) {
                if (e.isModalidade(modalidade)) {
                    totalPremios += e.totalPremiosIndividuaisEquipa();
                }
            }
        }
        return totalPremios;
    }

    /**
     * Determina a quantidade de vezes que um dado atleta foi inscrito em
     * equipas, independentemente da modalidade
     *
     * @param numAtleta O índice do atleta na lista de atletas
     *
     * @return O número total de inscrições do atleta em equipas
     */
    public int calcularTotalInscricoesAtleta(int numAtleta) {
        int totalInscricoes = 0;
        Atleta atleta = atletas.get(numAtleta);
        if (atleta != null) {
            for (Equipa e : equipas) {
                if (e.containsJogador(atleta)) {
                    totalInscricoes++;
                }
            }
        }
        return totalInscricoes;
    }

    /**
     * Devolve o nome de uma modalidade
     *
     * @param numModalidade O índice da modalidade na lista das modalidades
     *
     * @return O nome da modalidade
     */
    public String obterNomeModalidade(int numModalidade) {
        Modalidade modalidade = modalidades.get(numModalidade);
        if (modalidade != null) {
            return modalidade.getNome();
        }
        return null;
    }

    // a)
    public void addCompEx(CompeticaoExterna ce1) {
        ce.add(ce1);

    }

    public void addCompIn(CompeticaoInterna ci1) {
        ci.add(ci1);

    }

    // b)
    public void addEquipaIntComp(Equipa e1, int cod, int numComp) {
        if (numComp != 0) {

            for (int i = 0; i < ce.size(); i++) {
                if (ce.get(i).getCodigo() == cod) {
                    ce.get(i).setEquipa(e1);
                }
            }

        } else {

            for (int i = 0; i < ci.size(); i++) {
                if (ci.get(i).getCodigo() == cod) {
                    ci.get(i).equipasInternas.add(e1);
                }
            }

        }
    }

    // c)
    public void addEquipaExtCompExt(EquipaExterna el, int cod1) {
        for (int i = 0; i < ce.size(); i++) {
            if (ce.get(i).getCodigo() == cod1) {
                ce.get(i).EquipasExternas.add(el);
            }
        }
    }
    
      /**
     * Remove uma competição externa, consoante o código que lhe é passado
     *
     * @param codigoE O código da competição
     */
    
    public void removerCompEx(int codigoE){
    
        for (int i = 0; i < ce.size(); i++){
            if(ce.get(i).getCodigo() == codigoE){
            ce.remove(ce.get(i));
            }
        }
    }
    
     /**
     * Remove uma competição interna, consoante o código que lhe é passado
     *
     * @param codigoI O código da competição
     */
    public void removerCompInt(int codigoI){
        
        for(int i = 0; i < ci.size(); i++){
            if(ci.get(i).getCodigo() == codigoI){
            ci.remove(ci.get(i));
            }
        }
    }
    
    //e
    public void AlterarDataInicio(int codCompeticao, Data inicio) {
        for (int i = 0; i < competicao.size(); i++) {
            if (competicao.get(i).getCodigo() == codCompeticao) {
                competicao.get(i).setDataInicio(inicio);
            }
        }
    }

    public void AlterarDataFim(int codCompeticao, Data fim) {
        for (int i = 0; i < competicao.size(); i++) {
            if (competicao.get(i).getCodigo() == codCompeticao) {
                competicao.get(i).setDataInicio(fim);
            }
        }
    }

    public void AlterarDataInicioeFim(int codCompeticao, Data inicio, Data fim) {

        for (int i = 0; i < competicao.size(); i++) {
            if (competicao.get(i).getCodigo() == codCompeticao) {
                competicao.get(i).setDataInicio(inicio);
            }

        }

        for (int i = 0; i < competicao.size(); i++) {
            if (competicao.get(i).getCodigo() == codCompeticao) {
                competicao.get(i).setDataFim(fim);
            }
        }
    }

    // f)
    public int valorInscricoesCompEx() {

        int valorInscricao = 0;

        if (ce != null) {

            for (CompeticaoExterna c : ce) {

                valorInscricao += c.obterCustoInscricao(c.getDataInicio(), c.getDataFim());

            }
        }

        return valorInscricao;

    }
    
     public String getValorTotal() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n Valor total das Inscrições -> ");
       int valorTotal = 0;
       for(CompeticaoExterna compE : ce) {
            valorTotal = valorTotal + compE.getCustoBase();
       }
       sb.append(valorTotal);
       
       return sb.toString();
    }
     
      public String getEquipasComAlojamento() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n Numero de equipas que precisam de alojamento -> ");
       int numEquipas = 0;
       for(CompeticaoExterna compE : ce) {
            for(EquipaExterna eE : compE.getEquipasExternas()) {
                if(eE.getAlojamento()) {
                    numEquipas = numEquipas++;
                }
            }
        }
           
       sb.append(numEquipas);
       
       return sb.toString();
    }
      
      public String getCompeticoesPorData() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n Numero de competições por data -> ");
       
       Competicao comp;
       ArrayList<Competicao> listaTotalCompeticoes = new ArrayList<>();
       listaTotalCompeticoes.addAll(ce);
       listaTotalCompeticoes.addAll(ci);

        for (int i = 0; i < listaTotalCompeticoes.size(); i++) {  
            for (int j = i + 1; j < listaTotalCompeticoes.size(); j++) 
            { 
            Competicao tmp = new Competicao();                           
            if(listaTotalCompeticoes.get(i).getDataInicio().isMaior(listaTotalCompeticoes.get(j).getDataInicio())) {      
                tmp = listaTotalCompeticoes.get(i);               
                listaTotalCompeticoes.set(i, listaTotalCompeticoes.get(j)); //= listaTotalCompeticoes.get(j);            
                listaTotalCompeticoes.set(j, tmp);
              }
            }
        }

      sb.append(listaTotalCompeticoes);
       
      return sb.toString();
    }
      
      public String getCompeticoesExternas() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n Competições Externas -> ");

       sb.append(ce);
       
       return sb.toString();
    }
      
    public String getCompeticoesInternas() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n Competições Internas -> ");
       
       sb.append(ci);
       
       return sb.toString();
    }
    
}


