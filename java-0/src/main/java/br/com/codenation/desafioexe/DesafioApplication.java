package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
                List<Integer> fibo = new ArrayList<>();
		fibo.add(0, 0);
		fibo.add(1, 1);
		int k = 2;
		int atual = 0;
		while(atual < 350){
			atual = (fibo.get(k-2) + fibo.get(k-1));
			fibo.add(k,atual);
			k+=1;
		}
		System.out.println(fibo);
		return fibo;
	}

	public static Boolean isFibonacci(Integer a) {
            return fibonacci().contains(a);
	}

}