import javax.swing.*;
import java.io.*;
import java.net.*;

import static java.lang.Integer.parseInt;

public class main{
    public static void main(String[] args) {
        try{
            Socket sock = new
            Socket(JOptionPane.showInputDialog("Insira o endereço"),
            parseInt(JOptionPane.showInputDialog("Insira a porta")));

            PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String linha = "";
            out.println("GET / HTTP/1.0\n");
            while ((linha = in.readLine()) != null){
                System.out.println("echo: " + linha);
            }
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}
