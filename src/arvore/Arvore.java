package arvore;

public class Arvore {

    private Elemento raiz, atual;

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir(int n) {
        if (raiz == null) {
            raiz = new Elemento(n);
            System.out.println("raiz primária é " + raiz.getN());
        } else {
            atual = new Elemento(n);
            inserir(atual, raiz);
        }

    }

    private void inserir(Elemento atual, Elemento e) {

        System.out.println("atual agora é: " + atual.getN() + "\nelemento e é: " + e.getN());

        if (atual.getN() < e.getN()) {
            if (e.getEsq() == null) {
                System.out.println(atual.getN() + " foi pra esquerda de " + e.getN());
                e.setEsq(atual);
                atual.setR(e);
            } else {

                System.out.println(atual.getN() + " foi pra esquerda de " + e.getN());
                inserir(atual, e.getEsq());
            }
        } else {

            if (e.getDir() == null) {
                System.out.println(atual.getN() + " foi pra direita de " + e.getN());
                e.setDir(atual);
                atual.setR(e);
            } else {

                System.out.println(atual.getN() + " foi pra direita de " + e.getN());
                inserir(atual, e.getDir());
            }
        }

    }

    public void preOrdem(Elemento e) {

        if (e != null) {

            System.out.print(e.getN() + "\t"); // operação de visitar o nó raíz

            preOrdem(e.getEsq());
            preOrdem(e.getDir());
        }

    }

    public void posOrdem(Elemento e) {
        if (e != null) {
            posOrdem(e.getEsq());
            posOrdem(e.getDir());
            System.out.print(e.getN() + "\t");
        }
    }

    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsq());
            System.out.print(e.getN() + "\t");
            ordem(e.getDir());
        }
    }

    /*
     * Escreva um método de busca recursivo que retorne um valor booleano.
     * Assunatura do método: public boolean pesquisar(int n)
     */

    public boolean pesquisar(int n, Elemento e) {

        if (e != null) {
            if (e.getN() == n) {
                System.out.println("ACHEI!");
                return true;
            }else if(e.getN()<n){
                return pesquisar(n, e.getDir());
            }else{
                return pesquisar(n, e.getEsq());
            }
        }
            System.out.println("NÃO ACHEI!");
            return false;
    }

}
