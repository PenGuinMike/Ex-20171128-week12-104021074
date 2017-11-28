import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server extends Thread {
    private InetAddress ipadrs;
    private ServerSocket svskt;
    private Socket skt;
    private PrintStream outStream;
    private BufferedReader inputStream;
    private SFrame sfe ;




    public Server(SFrame serverFre){
        sfe = serverFre;
        try {
            ipadrs = InetAddress.getLocalHost();
            svskt = new ServerSocket(1723);
        }catch (UnknownHostException e){
            javax.swing.JOptionPane.showMessageDialog(null,"Erro"+e.toString());
        }catch (IOException ioe){
            javax.swing.JOptionPane.showMessageDialog(null,"Erro"+ioe.toString());
        }

    }
}
