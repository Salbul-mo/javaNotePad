package ex_repeat;

import java.util.Scanner;

public class Ex_07_24 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("limit 를 입력하시오>");
		int limit = sc.nextInt();

		System.out.print("listCount 를 입력하시오>");
		int listCount = sc.nextInt();

		int temp = (listCount-1) / limit;

		

		int maxPage = temp + 1;
		
		
		System.out.println("maxpage = " + maxPage);
		int page = 15;
		int pageLimit = 5;
		int startPage = ((page - 1) / pageLimit) * pageLimit + 1;
		
		System.out.println("page = " + page + " startPage = " + startPage);
		
		

		sc.close();

	}
}

