package pilhajava;

import java.util.Arrays;

public class Pilha {
    private int tamanhoMaximo;      // Tamanho máximo da pilha
    private int topo;               // Índice do topo da pilha
    private int[] arrayDaPilha;     // Array para armazenar os elementos da pilha

    public Pilha(int tamanho) {
        tamanhoMaximo = tamanho;
        arrayDaPilha = new int[tamanhoMaximo];
        topo = -1; // Pilha vazia
    }

    public void empilhar(int valor) {
        if (topo < tamanhoMaximo - 1) {
            arrayDaPilha[++topo] = valor;
        } else {
            System.out.println("Pilha cheia. Não é possível adicionar mais elementos.");
        }
    }

    public int desempilhar() {
        if (!estaVazia()) {
            return arrayDaPilha[topo--];
        } else {
            System.out.println("Pilha vazia. Não é possível remover elementos.");
            return -1; // Valor de erro
        }
    }

    public int verTopo() {
        if (!estaVazia()) {
            return arrayDaPilha[topo];
        } else {
            System.out.println("Pilha vazia. Não há elementos para visualizar.");
            return -1; // Valor de erro
        }
    }

    public boolean estaVazia() {
        return (topo == -1);
    }

    public boolean estaCheia() {
        return (topo == tamanhoMaximo - 1);
    }
    
     public int tamanho() {
        return topo + 1;
    }
    
    public void redimensionar(int novoTamanho) {
        if (novoTamanho > tamanhoMaximo) {
            tamanhoMaximo = novoTamanho;
            arrayDaPilha = Arrays.copyOf(arrayDaPilha, tamanhoMaximo);
        } else {
            System.out.println("O novo tamanho deve ser maior que o tamanho atual.");
        }
    }

    public void percorrerPilha() {
        if (!estaVazia()) {
            System.out.println("Elementos da pilha:");
            for (int i = topo; i >= 0; i--) {
                System.out.println(arrayDaPilha[i]);
            }
        } else {
            System.out.println("Pilha vazia. Não há elementos para percorrer.");
        }
    }
}
