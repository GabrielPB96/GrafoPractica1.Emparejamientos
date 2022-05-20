public class Arista{
    private int a, b;

    public Arista(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public boolean equals(Object o){
        if(o instanceof Arista){
            Arista otro = (Arista)o;
            return (a == otro.a && b == otro.b) || (a == otro.b && b == otro.a);
        }
        return false;
    }

    public String toString() {
        return "["+a+","+b+"]";
    }
}