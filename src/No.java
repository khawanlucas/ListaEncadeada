public class No {
    Object elemento;
    No proximo;

    public No(Object elemento) {
        this.elemento = elemento;
    }

    public No(){}

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
