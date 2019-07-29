public class ClassAndObjects {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        rec.setValues(20,30);
        tri.setValues(20,30);
        System.out.println(rec.getArea());
        System.out.println(tri.getArea());
    }
}
