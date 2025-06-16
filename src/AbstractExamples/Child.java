package AbstractExamples;

public class Child extends Parent{
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {
        Parent p= new Child();
        p.display();
        p.show();

    }
}
