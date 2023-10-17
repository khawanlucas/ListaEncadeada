public class NoDuplo {
    Object elemento;
    NoDuplo proximo;
    NoDuplo anterior;

    public NoDuplo(Object elemento) {
        this.elemento = elemento;
    }

    public NoDuplo(){}

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NoDuplo getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }

    public NoDuplo getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}
