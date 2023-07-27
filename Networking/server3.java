/**
 * 
 */
package com.digit.digit_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 */
public class server3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ServerSocket listner=new ServerSocket(4000);
		System.out.println("Server is ready to accept the request");
		Socket ssoc=listner.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		OutputStream os=ssoc.getOutputStream();//----
		DataOutputStream dos=new DataOutputStream(os);//----
		while(true) {
		String temp=dis.readUTF();
		System.out.println(temp);
		//OutputStream os=ssoc.getOutputStream();
		//DataOutputStream dos=new DataOutputStream(os);
		
		String msg=sc.nextLine();
		dos.writeUTF(msg);
		}
		
		
		
		

	}

}
