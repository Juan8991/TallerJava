package punto.dieciocho;

public interface IEntregable extends Comparable {
    public void entregar();
    public void devolver();
    public Boolean isEntregado();
    public int compareTo(Object a);
}
