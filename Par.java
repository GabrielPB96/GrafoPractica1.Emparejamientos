public class Par{
    private int a, b;

    public Par(int a, int b) {
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
        if(o instanceof Par){
            Par otro = (Par)o;
            return (a == otro.a && b == otro.b) || (a == otro.b && b == otro.a);
        }
        return false;
    }

    public String toString() {
        return "["+a+","+b+"]";
    }
}