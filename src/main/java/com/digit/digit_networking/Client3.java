/**
 * 
 */
package com.digit.digit_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


/**
 * 
 */
public class Client3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Socket csoc=new Socket("10.1.131.203",4000);
		
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		InputStream is=csoc.getInputStream();//--
		DataInputStream dis=new DataInputStream(is);//--
		while(true) {
		String msg=sc.nextLine();
		dos.writeUTF(msg);
		//InputStream is=csoc.getInputStream();
		//DataInputStream dis=new DataInputStream(is);
		String temp=dis.readUTF();
		System.out.println(temp);
		}
		
		
		
		
		

	}

}
