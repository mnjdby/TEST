package com.fullerton.olp.settings.sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsServiceImpl implements SmsService
{
	
	private static final String API_HOST = "http://smsc.biz/";
	private static final String USERNAME = "nitishspatel@gmail.com";
	private static final String PASSWORD = "Nitish123";
	private static final String SENDER_ID = "SMSIND";
	private static final String ROUTE = "T";
	  
  @Override
  public void send( String from, String to, String body )
  {
   
    	try {

			/*final TrustManager[] trustAllCerts = new TrustManager[] { 
					new X509TrustManager() 
					{
						@Override
						public void checkClientTrusted( final X509Certificate[] chain, final String authType ) {
						}
						@Override
						public void checkServerTrusted( final X509Certificate[] chain, final String authType ) {
						}
						@Override
						public X509Certificate[] getAcceptedIssuers() {
							return null;
						}
					} };
			


			final SSLContext sslContext = SSLContext.getInstance( "SSL" );
			sslContext.init( null, trustAllCerts, new java.security.SecureRandom() );*/

			//HttpsURLConnection.setDefaultSSLSocketFactory( sslContext.getSocketFactory() );
			URL url = new URL(getURLPath().replace("MOBILENUMBER", to)+body);
			final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			int responseCode = conn.getResponseCode();
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		 
     
    
  }
  

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmsServiceImpl test = new SmsServiceImpl();
		test.send("", "7757009527", "Test sms from gh. Thanks for choosing our service - ghj - SMSC Platform");
	}
	 

	private String getURLPath() {
		String twar = API_HOST + "httpapi/send?username="+USERNAME+"&password="+PASSWORD+"&sender_id="+SENDER_ID+"&route="+ROUTE+"&phonenumber=MOBILENUMBER&message=";
		return twar;
	}
  
}
