package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		//InetAddress 클래스
		//	IP정보 관리 클래스
		
		//	생성자 없음
		//	직접 객체 생성할 수 없음
		
		//	도메인 주소를 이용하여 IP주소를 알아내서 사용한다
		
		//	**도메인주소 : 인터넷상의 호스트네임
		//	**호스트네임 : 네트워크에서 노드를 구분하기 위해 정하는 이름
		
		//	**윈도우에서 호스트네임은 로그온한 유저이름 또는 컴퓨터 이름으로 기본 설정된다
		
		//---------------------------------------------------------
		
		InetAddress ip = null; //IP주소 표현 객체
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}		
		
		System.out.println(ip);
		
		//호스트 이름
		System.out.println(ip.getHostName());
		
		//호스트 IP
		System.out.println(ip.getHostAddress());
		
		
		System.out.println("-------------------------------");
		
		//로컬 호스트, local host
		//	네트워크 상에서 자기 자신을 지칭하는 용어
		
		//	가상 루프백(loopback) 호스트
		
		//	루프백 호스트 네임 : localhost
		
		//	루프백 호스트 IP : 127.0.0.1
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			
			System.out.println(localhost);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
				
		
		
		
	}
}
