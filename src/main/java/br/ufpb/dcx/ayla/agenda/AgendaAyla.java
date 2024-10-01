package br.ufpb.dcx.ayla.agenda;

import java.util.Collection;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        if(this.contatos.containsKey(nome)){
            return false;
        }
        Contato novoContato = new Contato(nome, dia, mes);
        this.contatos.put(nome, novoContato);
        return true;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> contatosPeloDia = new ArrayList<>();
        for(Contato c: this.contatos.values()){
            if (c.getDiaAniversario()==dia && c.getMesAniversario()==mes){
                contatosDoDia.add(c);
            }
        }
        return contatosPeloDia;    }

    @Override
    public boolean removeContato(String nome) throw ContatoInexistenteException{
        if (this.contatos.containsKey(nome)){
            this.contatos.remove(nome);
            return  true;
        } else {
            throw new ContatoInexistenteException("Não existe contato com o nome "+nome);
        }
    }

    @Override
    public void salvarDados() {

    }

    @Override
    public void recuperaDados() {

    }
}
