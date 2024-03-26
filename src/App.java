public class App {
    public static void main(String[] args) throws Exception {
        Nodo n1 = new Nodo("1");
        Nodo n2 = new Nodo("2");
        Nodo n3 = new Nodo("3");

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

        n1.info = "A";
        n2.info = "B";
        n3.info = "C";

        //ejercicio 10
        // p = n1;
        // q = n3;
        // p.next = q;
        // p.print();

        //ejercicio 11
        // p = n1;
        // p.next = p.next.next;
        // p.print();

        //ejercicio 12
        // Nodo n4 = new Nodo("D");
        // n3.next = n4;
        // p = n1;
        // q = n1;
        // Nodo aux = p;
        // while(aux != null){
        //     q = aux;
        //     aux = aux.next;
        // }
        // p.print();
        // q.print();

        // ejercicio 13
        // Nodo n4 = new Nodo("C");
        // n3.next = n4;
        // p = n1;
        // q = n1;
        // Nodo aux = n1;
        // while(aux != null){
        //     if(aux.info == "C"){
        //         q = aux;
        //         break;
        //     }
        //     aux = aux.next;
        // }
        // q.print();

        // ejercicio 14
        // p = new Nodo("A");
        // p.next = new Nodo("B");
        // p.next.next = new Nodo("C");
        // p.next.next.next = new Nodo("D");
        // p.print();

        // ejercicio 15
        n1 = new Nodo("A");
        n2 = new Nodo("B");
        n3 = new Nodo("C");
        n2.next = n3;

        p = n2;
        q = null;
        q = p;
        p = n1;
        p.next = q;
        q = null;
        p.print();
    }
}
