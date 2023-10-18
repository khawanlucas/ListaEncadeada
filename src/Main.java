public class Main {
    public static void main(String[] args) {
        ListaEncadeada a = new ListaEncadeada();
        a.adicionaFinal(new No(1));
        a.adicionaFinal(new No(2));
        a.adicionaFinal(new No(3));
        a.adicionaInicio(new No(0));

        System.out.println(a.tamanho());
        System.out.println(a.toString());

        a.adiciona(2, new No("a"));

        System.out.println(a.tamanho());
        System.out.println(a.toString());

        System.out.println(a.verElemento(0));

        ListaDuplamenteEncadeada b = new ListaDuplamenteEncadeada();

        b.adicionaFinal(new NoDuplo(2));
        b.adicionaFinal(new NoDuplo(4));
        b.adicionaInicio(new NoDuplo(1));
        b.adiciona(2,new NoDuplo(3));

        System.out.println(b.tamanho());
        System.out.println(b.toString());

        b.removeElemento(2);
        b.removePosicao(1);
        System.out.println(b.tamanho());
        System.out.println(b.toString());
        System.out.println(b.verElemento(0));

        Pilha c = new Pilha();
        c.adiciona(1);
        c.adiciona(2);
        c.adiciona(3);
        c.topo();
        c.remove();
        c.remove();
        System.out.println(c.toString());

        Fila d = new Fila();

        d.adiciona(1);
        d.adiciona(2);
        d.adiciona(3);

        d.remove();
        d.remove();

        System.out.println(d.toString());

    }
}