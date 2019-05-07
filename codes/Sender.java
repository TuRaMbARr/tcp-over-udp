import java.io.IOException;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        TCPSocket tcpSocket = new TCPSocketImpl("127.0.0.1", 3000);
        try {
            tcpSocket.connectToAddress(InetAddress.getByName("127.0.0.1"), 12345);
        } catch(Exception timeoutException) {
            System.out.println("Exception");
        }
        tcpSocket.send("sending.mp3");
//        tcpSocket.close();
//        tcpSocket.saveCongestionWindowPlot();
    }
}
