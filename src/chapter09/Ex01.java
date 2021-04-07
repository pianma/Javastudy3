package chapter09;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArray = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() = " + ip.getHostName());
			
			//������ : ip�ּҷ� ������ �����ؾ��ϴµ�
			//ip �ּҴ� 0~255������ 4�ڸ� ���ڷ� �̷���� �����Ƿ� ���ټ��� ������
			//���ڸ� �ǹ��ִ� ���ڷ� �����ؼ� ����ϴ°� �� ����
			//[������ ���� ����] -> DNS
			//126.54.101.4 -> www.naver.com
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("toString() = " + ip.toString());
			
			//ip -> 4�ڸ� ���ڷ� �̷���� ���� / 1Byte
			byte[] ipAddress = ip.getAddress();
			System.out.println("getAddress() = " + Arrays.toString(ipAddress));
			
			String result = "";
			for(int i = 0; i<ipAddress.length; i++) {
				result += (ipAddress[i] < 0)? ipAddress[i] + 256 : ipAddress[i];
				result += ".";
			}
			
			System.out.println("getAddress() + 256" + result);
			System.out.println("===== =====");
			
			ip = InetAddress.getLocalHost();
			
			System.out.println("getHostName() = " +ip.getHostName());
			System.out.println("getHostAddress() = " + ip.getHostAddress());
			System.out.println("===== =====");
			
			
			//�� �̸����� ���� �����Ҽ� ��� ������ ����� ������
			ipArray = InetAddress.getAllByName("www.naver.com");
			for(int i=0; i<ipArray.length; i++) {
				System.out.println("ipArray["+i +"] = " + ipArray[i]);
			}
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
