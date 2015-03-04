
import java.io.*;
import java.io.ByteArrayOutputStream;
import java.net.*;

class TCPClient {

    private final static String serverIP = "127.0.0.1";
    private final static int serverPort = 3248;
    private final static String fileToSend = "C:\\test1.txt";

    public static void main(String args[]) {
    	
    	System.out.println("IN JAVA CLIENT");
        byte[] aByte = new byte[1];
        int bytesRead;

        Socket clientSocket = null;
        BufferedOutputStream outToClient = null;

        try {
            clientSocket = new Socket( serverIP , serverPort );
            outToClient = new BufferedOutputStream(connectionSocket.getOutputStream());
            
        } catch (IOException ex) {
            // Do exception handling
        }

        if (outToClient != null) {
            File myFile = new File( fileToSend );
            byte[] mybytearray = new byte[(int) myFile.length()];

            FileInputStream fis = null;

            try {
                fis = new FileInputStream(myFile);
            } catch (FileNotFoundException ex) {
                // Do exception handling
            }
            BufferedInputStream bis = new BufferedInputStream(fis);

            try {
                bis.read(mybytearray, 0, mybytearray.length);
                outToClient.write(mybytearray, 0, mybytearray.length);
                outToClient.flush();
                outToClient.close();
                connectionSocket.close();

                // File sent, exit the main method
                return;
            } catch (IOException ex) {
                // Do exception handling
            }
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

    
    }
}
