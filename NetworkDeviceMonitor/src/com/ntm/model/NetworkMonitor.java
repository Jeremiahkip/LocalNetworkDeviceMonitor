package com.ntm.model;

//Java Program to Ping an IP address 
import java.io.*;
import java.net.*;
import java.util.Timer;
import java.util.TimerTask;

import com.ntm.view.NetworkMonitorGUI;

///////////////////////////////////////////////////////////////////////////
///											   						    ///
/// PLEASE FEEL FREE TO CHANGE AND IMPROVE WHAT HAS BEEN IMPLEMENETED!  ///
///															  		    ///
///////////////////////////////////////////////////////////////////////////

public class NetworkMonitor extends TimerTask {

	/**
	 * Sends ping request to a provided IP address
	 * 
	 * @param ipAddress
	 */
	public static void sendPingRequest(String ipAddress) {
		try {
			InetAddress host = InetAddress.getByName(ipAddress);
			System.out.println("Sending Ping Request to " + ipAddress);

			if (host.isReachable(5000)) {
				System.out.println("Host is reachable\n");
			} else {
				System.out.println("Sorry ! We can't reach to this host\n");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Driver code
	 * 
	 * @param String[] args
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		NetworkMonitorGUI gui = new NetworkMonitorGUI();

		Timer timer = new Timer();
		timer.schedule(new NetworkMonitor(), 0, 5000);
	}

	@Override
	public void run() {
		sendPingRequest("192.168.1.52");
		sendPingRequest("192.168.1.34");
		sendPingRequest("133.192.31.42");
	}
}