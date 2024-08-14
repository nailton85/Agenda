package br.ufpb.dcx.ayla.agenda;

import java.util.Collection;

public interface Agenda {
    /**
     *
     * @param nome
     * @param dia
     * @param mes
     * @return
     */
    public boolean cadastraContato(String nome, int dia, int mes);

    /**
     *
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
    public boolean removeContato(String nome);

    /**
     *
     */
    public void salvarDados();

    /**
     *
     */
    public void recuperaDados();
}
