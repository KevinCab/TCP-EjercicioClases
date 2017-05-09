package ec.edu.epn.redes.cs.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientTCP {

	private static int SERVER_PORT = 9090;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String serverAddress = JOptionPane.showInputDialog("Enter IP Addresss of a machine\n"+ "runing the date" + SERVER_PORT +":");
		
		Socket clientSocket = new Socket(serverAddress, SERVER_PORT);
		
		InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
		
		BufferedReader input = new BufferedReader(inputStream);
		String answer = input.readLine();
		
		//Imprime los datos del mensaje
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
		
	}

}
