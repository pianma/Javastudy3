package chapter09;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {

	public static void main(String[] args) {
		URL url = null;
		String IPAddress = "https://www.youtube.com";
		
		try {
			url = new URL(IPAddress);
			URLConnection conn = url.openConnection();
			
			//���� ���� ���
			System.out.println("conn = " + conn);
			System.out.println(conn.getAllowUserInteraction());
			
			//���� ������� ���� �ð�
			System.out.println(conn.getConnectTimeout());
			//����� �ڿ��� ���� ������ ���� �ִ� content ��ü
			System.out.println(conn.getContent());
			// ����� �ڿ��� ǥ�� ����
			System.out.println(conn.getContentEncoding());
			// ����� �ڿ��� ũ��
			System.out.println(conn.getContentLength());
			//����� �ڿ��� Ÿ��(MineType)
			System.out.println(conn.getContentType());
			System.out.println(conn.getDate());
			System.out.println(conn.getDoInput());
			System.out.println(conn.getDoOutput());
			//����� �ڿ��� ����Ⱓ
			System.out.println(conn.getExpiration());
			System.out.println(conn.getIfModifiedSince());
			//*����� �ڿ��� ������ ���� ��¥*(�߿�)
			System.out.println(conn.getLastModified());
			System.out.println(conn.getReadTimeout());
			System.out.println(conn.getURL());
			System.out.println(conn.getUseCaches());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
