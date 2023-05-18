package JavaPrograms;

import java.net.InetAddress;
import java.net.URL;

public class GetIpAdress {

	public static void main(String[] args) {
		
		try
		{
			InetAddress ip = InetAddress.getByName("https://www.google.com/");
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try 
		{
			URL url = new URL("https://www.google.com/");
			url.getHost();
			url.getPort();
			url.getFile();
			url.getProtocol();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
