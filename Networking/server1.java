/**
 * 
 */
package com.digit.digit_networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 */
public class server1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket listner=new ServerSocket(4000);
		System.out.println("Server is ready to accept the request");
		Socket ssoc=listner.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String temp=dis.readUTF();
		System.out.println(temp);
		

	}

}
