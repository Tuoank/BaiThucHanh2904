package MainClass;
import Shapes.TamGiac;

public class App1 {
    public static void main(String[] args) {
        TamGiac Triangle = new TamGiac('A', 1, 2);
        Triangle.nhap();
        Triangle.kiemtratamgiac();
    }
}