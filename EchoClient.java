import java.io.*;
import java.net.*;
 
public class EchoClient {
    public static void main(String[] args) {
         
        if (args.length != 2) {
            System.err.println(
                "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }
 
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);
 
        try {
            Socket echoSocket = new Socket(hostName, portNumber);
            PrintWriter out =
                new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn =
                new BufferedReader(
                    new InputStreamReader(System.in));
        

            System.out.println("Server Sent: " + in.readLine());

            String userInput;
            userInput = stdIn.readLine();
            out.println(userInput);
            System.out.println("Hexadecimal values of colors: " + in.readLine());
            System.out.println("Server sent: " + in.readLine());

            String file_answer;
            file_answer = stdIn.readLine();
            out.println(file_answer);
           
            
            ObjectInputStream ois = new ObjectInputStream(echoSocket.getInputStream());
            try{
                byte[] buffer = (byte[]) ois.readObject();

                FileOutputStream fos = new FileOutputStream("Palette.png");
                fos.write(buffer);
                

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
            
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        } 
    }
}