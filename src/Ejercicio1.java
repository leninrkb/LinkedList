public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);

        n1.next = n2;
        n2.next = n3;
        ///////////

        Nodo p = new Nodo();
        Nodo r = new Nodo();

        p = n1;
        r = n3;
        ///////////
        
        p = p.next;
        p.print();
    }
}
