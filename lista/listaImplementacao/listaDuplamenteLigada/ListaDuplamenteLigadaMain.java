package lista.listaImplementacao.listaDuplamenteLigada;

public class ListaDuplamenteLigadaMain {
    public static void main(String[] args){
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        lista.insertLast("1");
        lista.insertLast("2");
        lista.insertLast("3");
        lista.insertLast("4");
        lista.insertLast("5");
        lista.insertLast("6");
        lista.insertFirst("7");
        System.out.println(lista.isLast("2"));

        lista.sout();
    }
}
