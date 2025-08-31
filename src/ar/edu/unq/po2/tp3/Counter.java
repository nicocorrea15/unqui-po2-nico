package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros; 
	
	public Counter(ArrayList<Integer> numbers) {
        this.numeros = numbers;
    }
	
	public int contarPares() {
        int count = 0;
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
	
	public int contarImpares() {
        int count = 0;
        for (Integer num : numeros) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
	
	public int contarMultiplosDe(int n) {
        int count = 0;
        for (Integer num : numeros) {
            if (num % n == 0) {
                count++;
            }
        }
        return count;
    }
}

}

