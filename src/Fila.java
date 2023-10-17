public class Fila extends ListaEncadeada{
    public Fila() {
        super();
    }

    public void remove(){
        removePosicao(0);
    }

    public void adiciona(Object elem){
        adicionaFinal(elem);
    }
}
