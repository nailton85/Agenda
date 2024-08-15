package br.ufpb.dcx.ayla.agenda;

import java.io.IOException;
import java.util.Collection;

public interface Agenda {
    /**
     * cadastra uma pessoa
     * @param nome O nome a ser adicionado
     * @param dia O dia do aniversario a ser adicionado
     * @param mes O mes do aniversario a ser adicionado
     * @return verdadeiro ou falso caso o contato seja cadastrado
     */
    public boolean cadastraContato(String nome, int dia, int mes);

    /**
     * pesquisa um contato de acordo com a data de aniversario
     * @param dia
     * @param mes
     * @return
     */
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes);

    /**
     *
     * @param nome
     * @return
     */
    public boolean removeContato(String nome)throws ContatoInexistenteException;

    /**
     *
     */
    public void salvarDados()throws IOException;

    /**
     *
     */
    public void recuperaDados()throws IOException;
}
