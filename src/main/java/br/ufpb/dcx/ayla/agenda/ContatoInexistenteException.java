package br.ufpb.dcx.ayla.agenda;

import java.io.IOException;
import java.util.Map;
public class ContatoInexistenteException extends IOException {
    public ContatoInexistenteException(String msg){
        super(msg);
    }
    public  ContatoInexistenteException(){
        super("Fail: mensagem inexistente");
    }
}
