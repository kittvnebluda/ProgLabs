package lab2.extra.classes_relations;

public class Outsider {
    String txt;
    Outsider(String txt) {
        this.txt = txt;
    }
    void hello() {
        System.out.println(this.txt);
    }
}
