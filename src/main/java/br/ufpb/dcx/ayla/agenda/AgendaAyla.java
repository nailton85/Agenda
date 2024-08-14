package br.ufpb.dcx.ayla.agenda;

import java.util.Collection;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        return false;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        return null;
    }

    @Override
    public boolean removeContato(String nome) {
        return false;
    }

    @Override
    public void salvarDados() {

    }

    @Override
    public void recuperaDados() {

    }
}
