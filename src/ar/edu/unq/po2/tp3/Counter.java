package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List<Integer> numeros;

    public Counter() {
        this.numeros = new ArrayList<>();
    }

    public void addNumber(int numero) {
        this.numeros.add(numero);
    }

    public int contarPares() {
        int pares = 0;
        for (int n : numeros) {
            if (n % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public int contarImpares() {
        int impares = 0;
        for (int n : numeros) {
            if (n % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    public int contarMultiplos(int divisor) {
        int multiplos = 0;
        for (int n : numeros) {
            if (n % divisor == 0) {
                multiplos++;
            }
        }
        return multiplos;
    }     
    
}
