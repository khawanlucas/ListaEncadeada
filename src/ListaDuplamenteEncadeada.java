public class ListaDuplamenteEncadeada {
    NoDuplo inicio;
    NoDuplo fim;
    int tamanho;

    public ListaDuplamenteEncadeada(){
        tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public boolean estaVazia(){
        return tamanho==0;
    }

    public NoDuplo inicio(){
        return this.inicio;
    }
    public NoDuplo fim(){
        return this.fim;
    }
    public void adicionaFinal(Object elem){
        if(elem != null){
            NoDuplo novo = new NoDuplo(elem);
            if(this.estaVazia()){
                this.inicio = novo;
                this.fim = novo;
            }else{
                fim.setProximo(novo);
                novo.setAnterior(fim);
                fim = novo;
            }
            tamanho++;
        }
    }

    public void adicionaInicio(Object elem){
        if(elem != null){
            NoDuplo novo = new NoDuplo(elem);
            if(this.estaVazia()){
                this.inicio = novo;
                this.fim = novo;
            }else{
                novo.setProximo(inicio);
                inicio.setAnterior(novo);
                this.inicio = novo;
            }
            tamanho++;
        }
    }

    public void adiciona(int pos, Object elem){
        if(pos>=0 && pos<=tamanho && elem!=null){
            NoDuplo novo = new NoDuplo(elem);
            if(pos == 0){
                this.adicionaInicio(novo);
            }else if(pos == this.tamanho()){
                this.adicionaFinal(novo);
            }else{
                NoDuplo aux = inicio;
                NoDuplo anterior = null;
                for(int i = 0; i<pos; i++){
                    anterior = aux;
                    aux = aux.getProximo();
                }
                novo.setAnterior(anterior);
                anterior.setProximo(novo);
                aux.setAnterior(novo);
                novo.setProximo(aux);
            }
            tamanho++;
        }
    }
    public void removeElemento(Object elem){
        if(elem != null){
            NoDuplo aux = inicio;
            NoDuplo anterior = null;
            if(elem == inicio.getElemento()) {
                inicio = inicio.getProximo();
                inicio.setAnterior(null);
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
                    aux.getProximo().setAnterior(anterior);
                    tamanho--;
                    aux.setProximo(null);
                    aux.setElemento(null);
                    aux.setAnterior(null);
                }
            }
        }

    }

    public void removePosicao(int pos){
        if(pos>=0 && pos<tamanho){
            NoDuplo aux = inicio;
            NoDuplo anterior = null;
            if(pos == 0){
                inicio = inicio.getProximo();
                inicio.setAnterior(null);
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
                    aux.getProximo().setAnterior(anterior);
                    tamanho--;
                    aux.setProximo(null);
                    aux.setElemento(null);
                    aux.setAnterior(null);
                }
            }
        }
    }

    public Object verElemento(int pos){
        if(pos>=0 && pos<tamanho && !estaVazia()){
            NoDuplo aux = inicio;
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
        NoDuplo aux = inicio;
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
