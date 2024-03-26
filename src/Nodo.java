public class Nodo {
    public int data;
    public Nodo next;

    public Nodo(){}

    public Nodo(int data){
        this.data = data;
    }

    public void print(){
        System.out.println(this.data);
        print(this.next);
    }

    public void print(Nodo next){
        if(next == null){
            return;
        }
        System.out.println(next.data);
        print(next.next);
    }

    public void printcur(){
        System.out.println(this.data);
    }
}
