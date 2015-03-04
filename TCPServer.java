import java.io.*;
import java.net.*;

class TCPServer {

   
    private final static String fileOutput = "C:\\testout.txt";
    public static void main(String args[]) {

        System.out.println("In java server\n");
        while (true) {
            ServerSocket welcomeSocket = null;
            Socket connectionSocket = null;
            InputStream is = null;
           

            try {
                welcomeSocket = new ServerSocket(3248);
                connectionSocket = welcomeSocket.accept();
                is = clientSocket.getInputStream();
               
            } catch (IOException ex) {
                // Do exception handling
            }
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            if (is != null) {

                FileOutputStream fos = null;
                BufferedOutputStream bos = null;
                try {
                    fos = new FileOutputStream( fileOutput );
                    bos = new BufferedOutputStream(fos);
                    bytesRead = is.read(aByte, 0, aByte.length);

                    do {
                            baos.write(aByte);
                            bytesRead = is.read(aByte);
                    } while (bytesRead != -1);

                    bos.write(baos.toByteArray());
                    bos.flush();
                    bos.close();
                    clientSocket.close();
                } catch (IOException ex) {
                    // Do exception handling
                }
            }

         
        }
    }
}