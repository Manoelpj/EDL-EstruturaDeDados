public class PilhaMainRubroNegra {
    public static void main(String[] args) {

        PilhaRubroNegra pilhaRN = new PilhaRubroNegra(10);

        // PUSH AMBOS \\
        pilhaRN.pushRubro(1);
        pilhaRN.pushRubro(2);
        pilhaRN.pushRubro(3);
        pilhaRN.pushRubro(4);
        pilhaRN.pushRubro(5);
        pilhaRN.pushRubro(6);
        pilhaRN.pushNegro("A");
        pilhaRN.pushNegro("B");
        pilhaRN.pushNegro("C");
        pilhaRN.pushNegro("D");
        pilhaRN.pushNegro("E");
        pilhaRN.pushNegro("F");


        // POP NEGRO \\ 
        System.out.println(pilhaRN.popNegro()); 
        System.out.println(pilhaRN.popNegro()); 
        System.out.println(pilhaRN.popNegro());                 
        pilhaRN.pushNegro("A");
        pilhaRN.pushNegro("B");
        pilhaRN.pushNegro("C");

        // POP RUBRO \\
        System.out.println(pilhaRN.popRubro()); 
        System.out.println(pilhaRN.popRubro()); 
        System.out.println(pilhaRN.popRubro());   
        pilhaRN.pushRubro(1);
        pilhaRN.pushRubro(2);
        pilhaRN.pushRubro(3);   
        
        // SIZE AMBOS \\
        System.out.println(pilhaRN.sizeNegro());
        System.out.println(pilhaRN.sizeRubro());

        // TOP AMBOS \\
        System.out.println(pilhaRN.topRubro());
        System.out.println(pilhaRN.topNegro());

        // ISEMPTY AMBOS \\
        System.out.println(pilhaRN.isEmptyRubro());
        System.out.println(pilhaRN.isEmptyNegro());



        pilhaRN.sout();

    }
}
