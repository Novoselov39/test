package LSP;

public class Square extends QuadRangle{
        // является наследником QuadRangle и переопределяет area, в данном случае происходит вычисление площади квадрата
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
