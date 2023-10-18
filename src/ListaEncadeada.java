public class ListaEncadeada {
    No inicio;
    No fim;
    int tamanho;

    public ListaEncadeada(){
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return tamanho==0;
    }

    public No inicio(){
        return inicio;
    }
    public No fim(){
        return fim;
    }
    public void adicionaFinal(Object elem){
        if(elem != null){
            No novo = new No(elem);
            if(this.estaVazia()){
                this.inicio = novo;
                this.fim = novo;
            }else{
                fim.setProximo(novo);
                fim = novo;
            }
            tamanho++;
        }
    }

    public void adicionaInicio(Object elem){
        if(elem != null){
            No novo = new No(elem);
            if(this.estaVazia()){
                this.inicio = novo;
                this.fim = novo;
            }else{
                novo.setProximo(inicio);
                this.inicio = novo;
            }
            tamanho++;
        }
    }

    public void adiciona(int pos, Object elem){
        if(pos>=0 && pos<=tamanho && elem!=null){
            No novo = new No(elem);
            if(pos == 0){
                this.adicionaInicio(novo);
            }else if(pos == this.tamanho()){
                this.adicionaFinal(novo);
            }else{
                No aux = inicio;
                No anterior = null;
                for(int i = 0; i<pos; i++){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                anterior.setProximo(novo);
                novo.setProximo(aux);
                tamanho++;
            }
        }
    }
    public void removeElemento(Object elem){
        if(elem != null){
            No aux = inicio;
            No anterior = null;
            if(elem == inicio.getElemento()) {
                inicio = inicio.getProximo();
                aux.setElemento(null);
                aux.setProximo(null);
                tamanho--;
            } else {
                while(aux!=null && aux.getElemento()!=elem){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                if(aux!=null){
                    anterior.setProximo(aux.getProximo());
                    tamanho--;
                    aux.setProximo(null);
                    aux.setElemento(null);
                }
            }
        }

    }

    public void removePosicao(int pos){
        if(pos>=0 && pos<tamanho){
            No aux = inicio;
            No anterior = null;
            if(pos == 0){
                inicio = inicio.getProximo();
                aux.setElemento(null);
                aux.setProximo(null);
                tamanho--;
            }else{
                for(int i = 0; i<pos; i++){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                if(aux!=null){
                    anterior.setProximo(aux.getProximo());
                    tamanho--;
                    aux.setProximo(null);
                    aux.setElemento(null);
                }
            }
        }
    }

    public Object verElemento(int pos){
        if(pos>=0 && pos<tamanho && !estaVazia()){
            No aux = inicio;
            for(int i = 0; i<pos; i++){
                aux = aux.getProximo();
            }
            return aux.getElemento();
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder x = new StringBuilder();
        x.append("[");
        No aux = new No();
        aux = inicio;
        for(int i = 0; i < tamanho-1 && aux!=null; i++){
            x.append(aux.getElemento());
            x.append(", ");
            aux = aux.getProximo();
        }
        if(this.tamanho!=0){
            x.append(aux.getElemento());
        }
        x.append("]");
        return x.toString();
    }

}
