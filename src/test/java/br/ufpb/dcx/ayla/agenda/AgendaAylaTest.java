package br.ufpb.dcx.ayla.agenda;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgendaAylaTest {
    @Test
    public void testCadastraPesquisaRemocao(){
        AgendaAyla agenda = new AgendaAyla();
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(13,8);
        agenda.cadastraContato("Ana", 13,8);
        agenda.cadastraContato("Angelo", 9,12);
        assertEquals(1, contatosAchados.size());
        Contato anderson = new Contato("Aderson", 3,7);
        assertTrue(contatosAchados.contains(anderson));


        try{
            agenda.removeContato("Angelo");
        }catch (ContatoInexistenteException e){
            fail("Não deveria lançar exceção");
        }
    }

}
