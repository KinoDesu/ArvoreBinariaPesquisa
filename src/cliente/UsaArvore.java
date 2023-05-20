package cliente;

import arvore.Arvore;

public class UsaArvore {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(40);
        arvore.inserir(32);
        arvore.inserir(15);
        arvore.inserir(36);
        arvore.inserir(50);
        arvore.inserir(60);

        System.out.println("\n=================");

        arvore.preOrdem(arvore.getRaiz());

        System.out.println("\n=================");

        arvore.posOrdem(arvore.getRaiz());

        System.out.println("\n=================");

        arvore.ordem(arvore.getRaiz());

        System.out.println("\n=================");

        arvore.pesquisar(36, arvore.getRaiz());

    }

}