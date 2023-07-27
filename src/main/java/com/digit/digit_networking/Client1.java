/**
 * 
 */
package com.digit.digit_networking;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 */
public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket csoc=new Socket("10.1.131.203",4000);
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		dos.writeUTF(msg);
		
		

	}

}
