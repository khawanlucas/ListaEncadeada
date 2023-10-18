public class Pilha extends ListaEncadeada{
    public Pilha(){
        super();
    }

    public void adiciona(Object elem){
        adicionaFinal(elem);
    }

    public void remove(){
        removePosicao(this.tamanho-1);
    }

    public Object topo(){
        return verElemento(this.tamanho-1);
    }
}
