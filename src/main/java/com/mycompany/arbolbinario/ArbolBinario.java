
package com.mycompany.arbolbinario;


public class ArbolBinario {

    public static void main(String[] args) {
     Arbol a = new Arbol();

        int[] valores = {50, 30, 70, 20, 40, 60, 80};

        for (int v : valores)
            a.raiz = a.insertar(a.raiz, v);

        System.out.print("Inorden: ");
        a.inorden(a.raiz);

        System.out.print("\nPreorden: ");
        a.preorden(a.raiz);

        System.out.print("\nPostorden: ");
        a.postorden(a.raiz);
    }
}
