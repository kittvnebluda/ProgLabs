package Lab2.extra.classes_relations;

public class Composition {
    Outsider butField;
    Composition() {
        this.butField = new Outsider("HELLO composition");
    }
}
