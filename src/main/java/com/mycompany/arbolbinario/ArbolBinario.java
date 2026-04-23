
package com.mycompany.arbolbinario;
class Nodo {
    int valor;
    Nodo izq, der;

    public Nodo(int valor) {
        this.valor = valor;
        izq = der = null;
    }
}

class Arbol {
    Nodo raiz;

    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) return new Nodo(valor);

        if (valor < raiz.valor)
            raiz.izq = insertar(raiz.izq, valor);
        else
            raiz.der = insertar(raiz.der, valor);

        return raiz;
    }

    // INORDEN
    public void inorden(Nodo n) {
        if (n != null) {
            inorden(n.izq);
            System.out.print(n.valor + " ");
            inorden(n.der);
        }
    }

    // PREORDEN
    public void preorden(Nodo n) {
        if (n != null) {
            System.out.print(n.valor + " ");
            preorden(n.izq);
            preorden(n.der);
        }
    }

    // POSTORDEN
    public void postorden(Nodo n) {
        if (n != null) {
            postorden(n.izq);
            postorden(n.der);
            System.out.print(n.valor + " ");
        }
    }
}

public class ArbolBinario {

     public static void main(String[] args) {
        Arbol a = new Arbol();

        int[] datos = {40, 20, 60, 10, 30};

        for (int x : datos)
            a.raiz = a.insertar(a.raiz, x);

        System.out.print("Inorden: ");
        a.inorden(a.raiz);

        System.out.print("\nPreorden: ");
        a.preorden(a.raiz);

        System.out.print("\nPostorden: ");
        a.postorden(a.raiz);
    }
}

