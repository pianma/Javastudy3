package chapter09;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		try {
		String protocol = "http://";
		String host = "www.ddaily.co.kr";
		String path = "data/photos/cdn/20210104";
		String resource = "art_1611539583.jpg";
		String queryString = "?referer=naver";
		String anchor = "#index";
		URL url = new URL(protocol + host +path +resource + queryString + anchor );
			
		System.out.println("url.getAuthority() = "+ url.getAuthority());
		System.out.println("url.getContent() = " + url.getContent());
		System.out.println("url.getDefaultPort() = " + url.getDefaultPort());
		System.out.println("url.getPort() = " + url.getPort());
		System.out.println("url.getFile() = " + url.getFile());
		System.out.println("url.getHost() = " + url.getHost());
		System.out.println("url.getProtocol() = " + url.getProtocol());
		System.out.println("url.getQuery() = " + url.getQuery());
		System.out.println("url.getRef() = " + url.getRef());
		System.out.println("url.getUserInfo() = " + url.getUserInfo());
		System.out.println("url.toExternalForm() = " +url.toExternalForm());
		System.out.println("url.toURI() = " + url.toURI());
		} catch (IOException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
