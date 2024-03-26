public class App {
    public static void main(String[] args) throws Exception {
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);

        n1.next = n2;
        n2.next = n3;
        ///////////

        Nodo p = new Nodo();
        Nodo q = new Nodo();
        Nodo r = new Nodo();

        
        
        // ejercicio 1
        // p = n1;
        // q = n3;
        // r = n3;
        // p = p.next;
        // p.print();

        //ejercicio 2
        // p = n1;
        // q = n3;
        // r = n3;
        // p = q;
        // p.print();

        //ejercicio 3
        // p = n1;
        // q = n3;
        // r = n3;
        // q = p;
        // q.print();

        //ejercicio 4
        // p = n1;
        // r = n3;
        // r = p.next;
        // r.print();

        //ejercicio 5
        // p = n1;
        // r = n3;
        // p.info = r.info;
        // p.print();

        //ejercicio 6
        // p = n1;
        // r = n3;
        // p.info = p.next.next.info;
        // p.print();

        //ejercicio 7
        // p = n1;
        // r = n3;
        // r.next = p;
        // r.print();

        //ejercicio 8
        // p = n1;
        // q = n2;
        // q.next.next = p;
        // q.print();

        //ejercicio 9
        // p = n1;
        // p.next.next.next = p;
        // p.print();
    }
}
