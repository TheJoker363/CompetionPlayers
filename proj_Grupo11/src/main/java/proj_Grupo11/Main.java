/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj_Grupo11;

import com.mycompany.utilitarios.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static proj_Grupo11.Formato.competicaoAPontos;
import static proj_Grupo11.Formato.competiçãoMista;

/**
 * Class de teste
 *
 * @author Docentes MOPRO 2021/22
 */
public class Main {

    private static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar clube
        Clube c1 = new Clube("Clube X", "123456789", "Porto", new Data(2014, 5, 2), "931122334", "clubex@gmail.com", "www.clubex.pt");
        

        // I) Adicionar 2 modalidades ao clube
        c1.adicionarModalidade("futebol", 1990);
        c1.adicionarModalidade("futsal", 1995);
//        System.out.println("\n=====================================");
//        System.out.println("I - Listar toda a informação do clube" + c1.toString());
//        System.out.println("=====================================");

        // II) Adicionar 10 atletas ao clube
        c1.adicionarAtleta("Pedro Nunes", "1111111", "Porto", new Data(2000, 3, 1), "91234343234", "pedronumes@gmail.com");
        c1.adicionarAtleta("Mário Alves", "2222222", "Maia", new Data(2000, 12, 5), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Miguel Oliveira", "3333333", "Gaia", new Data(1997, 2, 15), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Rui Silva", "4444444", "Porto", new Data(1997, 12, 5), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Tiago Silva", "5555555", "Gaia", new Data(2000, 10, 22), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("José Pedro", "6666666", "Valongo", new Data(2000, 1, 16), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Gabriel Bastos", "7777777", "Matosinhos", new Data(1997, 6, 24), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Gustavo Mendes", "8888888", "Maia", new Data(2000, 8, 1), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Alexandre Santos", "9999999", "Porto", new Data(2002, 4, 25), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Gonçalo Barbosa", "1212121", "Matosinhos", new Data(2002, 9, 15), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Alexandre Santos", "9999999", "Porto", new Data(2002, 4, 25), "91666777888", "marioalves@gmail.com");
        c1.adicionarAtleta("Gonçalo Barbosa", "1212121", "Matosinhos", new Data(2002, 9, 15), "91666777888", "marioalves@gmail.com");

        c1.adicionarEquipa("sub13", 2020, 0);
        c1.adicionarEquipa("sub15", 2020, 0);
        c1.adicionarEquipa("sub17", 2020, 0);
        c1.adicionarEquipa("sub19", 2020, 0);
        
        c1.adicionarEquipa("sub13", 2020, 1);
        c1.adicionarEquipa("sub15", 2020, 1);
        c1.adicionarEquipa("sub17", 2020, 1);
        c1.adicionarEquipa("sub19", 2020, 1);
        
         c1.adicionarJogadorEquipa(0, 0, 10, "defesa esquerdo");
         c1.adicionarJogadorEquipa(0, 1, 19, "defesa direto");
         c1.adicionarJogadorEquipa(0, 2, 12, "defesa central");
         c1.adicionarJogadorEquipa(0, 3, 13, "defesa central");
         c1.adicionarJogadorEquipa(0, 4, 11, "ala");
         c1.adicionarJogadorEquipa(0, 5, 1, "guarda redes");
         c1.adicionarJogadorEquipa(1, 0, 2, "pivot");
         c1.adicionarJogadorEquipa(1, 1, 3, "ala direito");
         c1.adicionarJogadorEquipa(1, 2, 4, "Avançado");
         c1.adicionarJogadorEquipa(1, 3, 5, "Avançado");
         c1.adicionarJogadorEquipa(1, 4, 6, "Avançado");
         c1.adicionarJogadorEquipa(1, 5, 7, "Avançado");
        
         Equipa equipa1 = c1.getEquipas().get(0); 
         Equipa equipa2 = c1.getEquipas().get(1);

        
        CompeticaoInterna compInterna = new CompeticaoInterna(0, "liga interna", new Data(2022, 6, 1), new Data(2022, 7, 1), "Senhor Anibal", competicaoAPontos);
        CompeticaoInterna compInterna2 = new CompeticaoInterna(1, "liga interna 2", new Data(2022, 7, 1), new Data(2022, 8, 1), "Senhor José", competicaoAPontos);
        
        c1.addEquipaIntComp(equipa1, 0, 0);
        c1.addEquipaIntComp(equipa2, 0, 0);
       
        c1.addEquipaIntComp(equipa1, 1, 0);
        c1.addEquipaIntComp(equipa2, 1, 0);
        
        c1.addCompIn(compInterna);
        c1.addCompIn(compInterna2);
        
        CompeticaoExterna compExterna =  new CompeticaoExterna(3, "Pedro", equipa2, 1, "liga externa", new Data(2022, 12, 1), new Data(2023, 1, 1), "António", competiçãoMista);
        CompeticaoExterna compExterna2 = new CompeticaoExterna(3, "Joao", equipa2, 1, "liga externa 2", new Data(2022, 9, 1), new Data(2022, 11, 1), "António", competiçãoMista);

        EquipaExterna eE1 = new EquipaExterna("Sporting", "sub 21", "Lisboa", "Portugal", true);
        EquipaExterna eE2 = new EquipaExterna("Benfica", "sub 21", "Lisboa", "Portugal", true);
        EquipaExterna eE3 = new EquipaExterna("Porto", "sub 21", "Porto", "Portugal", false);
        
        c1.addEquipaExtCompExt(eE1, 0);
        c1.addEquipaExtCompExt(eE2, 1);
        c1.addEquipaExtCompExt(eE3, 0);
             
        c1.addCompEx(compExterna);
        c1.addCompEx(compExterna2);
        
        
        System.out.println("\n=====================================");
        System.out.println(" Listar toda a informação do clube" + c1.toString());
        System.out.println("=====================================");
        
        System.out.println("\n=====================================");
        System.out.println(" Listar Competições Internas" + c1.getCompeticoesInternas());
        System.out.println("=====================================");
        
        System.out.println("\n=====================================");
        System.out.println(" Listar Competições Externas" + c1.getCompeticoesExternas());
        System.out.println("=====================================");
        
        System.out.println("\n=====================================");
        System.out.println(" Listar todas as competições ordenadas por data" + c1.getCompeticoesPorData());
        System.out.println("=====================================");
        
        System.out.println("\n=====================================");
        System.out.println(" Listar equipas que pretendem alojamento" + c1.getEquipasComAlojamento());
        System.out.println("=====================================");
        
        System.out.println("\n=====================================");
        System.out.println(" Listar o valor total das inscrições" + c1.getValorTotal());
        System.out.println("=====================================");
        
       
        // Adicionar 2 equipas e, para isso, fazer:
        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar uma equipa (sem jogadores por agora)
        ArrayList<Modalidade> vec = c1.getModalidades();
        listarModalidades(vec);
        System.out.println("\nAdicionar uma equipa. Digite a posição da modalidade da equipa na lista: ");
        int num = in.nextInt();
        c1.adicionarEquipa("sub21", 2020, num);
        // Outra equipa
        // Mostrar todas as modalidades do clube, solicitar uma e depois adicionar/criar uma equipa (sem jogadores por agora)
        listarModalidades(vec);
        System.out.println("\nAdicionar uma equipa. Digite a posição da modalidade da equipa na lista: ");
        num = in.nextInt();
        c1.adicionarEquipa("sub23", 2021, num);
//        System.out.println("\n=====================================");
//        System.out.println("III - Listar toda a informação do clube" + c1.toString());
//        System.out.println("=====================================");

        // Adicionar 2 jogadores a cada uma das equipas criadas anteriormente. 
        // Para isso, começar por selecionar a equipa e só depois os atletas.
        ArrayList<Equipa> vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nAdicionar jogadores à primeira equipa. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        ArrayList<Atleta> vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nAdicionar jogadores à primeira equipa. Digite a posição do primeiro atleta na lista: ");
        int num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 12, "defesa esquerdo");
        // outro atleta
        vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nAdicionar jogadores à primeira equipa. Digite a posição do segundo atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 7, "atacante");

        // Segunda equipa
        vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nAdicionar jogadores à segunda equipa. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nAdicionar jogadores à segunda equipa. Digite a posição do primeiro atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 24, "defesa esquerdo");
        // outro atleta
        vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nAdicionar jogadores à segunda equipa. Digite a posição do segundo atleta na lista: ");
        num1 = in.nextInt();
        c1.adicionarJogadorEquipa(num, num1, 14, "atacante");


        vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nAdicionar primeiro prémio individual. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        ArrayList<Jogador> vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);
        System.out.println("\nAdicionar primeiro prémio individual. Digite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2019);

        vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nAdicionar segundo prémio individual. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);
        System.out.println("\nAdicionar segundo prémio individual. Digite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2020);

        vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nAdicionar terceiro prémio individual. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);
        System.out.println("\nAdicionar terceiro prémio individual. Digite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.adicionarPremioIndividual(num, num1, "Melhor jogador em campo", 2021);
//        System.out.println("\n=====================================");
//        System.out.println("V - Listar toda a informação do clube" + c1.toString());
//        System.out.println("=====================================");

        System.out.println("VI - Listar toda a informação do clube" + c1.toString());

        // Eliminar jogador. A equipa, jogador devem ser escolhidos. 
        vec1 = c1.getEquipas();
        listarEquipas(vec1);
        System.out.println("\nEliminar jogador de uma equipa. Digite a posição da equipa na lista: ");
        num = in.nextInt();
        vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);
        System.out.println("\nEliminar jogador de uma equipa. Digite o número da camisola do jogador: ");
        num1 = in.nextInt();
        c1.eliminarJogadorEquipa(num, num1);
        // Confirmar eleiminação
        vec3 = c1.obterJogadoresEquipa(num);
        listarJogadoresEquipa(vec3);

        // Mostrar a quantidade total de prémios individuais dos jogadores que praticam uma dada modalidade.
        // Mostrar todas as modalidades do clube e solicitar uma.
        vec = c1.getModalidades();
        listarModalidades(vec);
        System.out.println("\nQuantidade total de prémios individuais numa modalidade. Digite a posição da modalidade na lista: ");
        num = in.nextInt();
        int qtd = c1.calcularTotalPremiosIndividuais(num);
        System.out.println("Quantidade total de prémios individuais na modalidade " + c1.obterNomeModalidade(num) + " = " + qtd);

        // Mostrar a quantidade de vezes que um dado atleta foi inscrito em equipas, independentemente da modalidade.
        // Mostrar todos os atletas do clube e solicitar um.
        vec2 = c1.getAtletas();
        listarAtletas(vec2);
        System.out.println("\nQuantidade de inscrições de um atleta em equipas. Digite a posição do atleta na lista: ");
        num = in.nextInt();
        qtd = c1.calcularTotalInscricoesAtleta(num);
        System.out.println("Quantidade de inscrições do atleta em equipas = " + qtd);
    }

    public static void listarModalidades(ArrayList<Modalidade> vec) {
        System.out.println("\n #### Modalidades ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
        }
    }

    public static void listarEquipas(ArrayList<Equipa> vec) {
        System.out.println("\n #### Equipas ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
        }
    }

    public static void listarAtletas(ArrayList<Atleta> vec) {
        System.out.println("\n #### Atletas ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
        }
    }

    public static void listarJogadoresEquipa(ArrayList<Jogador> vec) {
        System.out.println("\n #### Jogadores ####");
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(i + " - " + vec.get(i).toString());
        }
    }
    public static void ListarCompeticoes(){
            //Listar competicoes
        List<Competicao> vecCompeticoes = new ArrayList<Competicao>();
        System.out.println("Listagem competicoes");

        for (Competicao c : vecCompeticoes) {
            System.out.println("> " + c.toString());
        }

}
     public static void ListarCompeticoesInternas(){
         //Listar competicoes internas
        List<CompeticaoInterna> vecCi = new ArrayList<CompeticaoInterna>();
        System.out.println("Listagem competicoes internas");
        for (CompeticaoInterna ci : vecCi) {
            System.out.println("> " + ci.toString());
        }
     }
     public static void ListarCompeticoesExternas(){
           //Listar competicoes externas
        List<CompeticaoExterna> vecCe = new ArrayList<CompeticaoExterna>();
        System.out.println("Listagem competicoes internas");
        for (CompeticaoExterna ce : vecCe) {
            System.out.println("> " + ce.toString());
        }
     }
     public static void ListarEquipasExAlojamento(){
             // Listar todas as equipas externas que pretendem alojamento;
             List<CompeticaoExterna> vecCe = new ArrayList<CompeticaoExterna>();
        for (CompeticaoExterna e : vecCe) {
            if (e instanceof IAlojar) {
                IAlojar ia = (IAlojar) e;
                if (ia.validarAlojamento() == true) {
                    vecCe.add(e);
                }
                System.out.println("> " + e.toString());
            }
        }
}
}
