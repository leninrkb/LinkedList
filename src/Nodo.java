public class Nodo {
    public String info;
    public Nodo next;

    public Nodo(){}

    public Nodo(String data){
        this.info = data;
    }

    public void print(){
        System.out.println(this.info);
        print(this.next);
    }

    public void print(Nodo next){
        if(next == null){
            return;
        }
        System.out.println(next.info);
        print(next.next);
    }

    public void printcur(){
        System.out.println(this.info);
    }
}
