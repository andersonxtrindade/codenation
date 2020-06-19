package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
                List<Integer> res = new ArrayList<>();
		res.add(0, 0);
		res.add(1, 1);
		int i = 2;
		int atual = 0;
		while(atual < 350){
			atual = (res.get(i-2) + res.get(i-1));
			res.add(i,atual);
			++i;
		}
		System.out.println(res);
		return res;
	}

	public static Boolean isFibonacci(Integer a) {
            return fibonacci().contains(a);
	}

}