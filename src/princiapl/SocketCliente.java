package princiapl;

import java.io.*;
import java.net.*;
import javax.swing.*;

public class SocketCliente {

    public static void main(String[] args) throws IOException {
        
    Socket Server = new Socket("localhost", 1245);
    PrintWriter out = new PrintWriter(Server.getOutputStream(),true);
    Cliente in = new Cliente(Server);
    in.start();
    
    String mensagem = "";
    while(!mensagem.equals("fim")){
        mensagem = JOptionPane.showInputDialog("Digite a Mensagem que quer enviar ou FIM para sair");
        out.println(mensagem);
    }
    
    
    }
    
}
