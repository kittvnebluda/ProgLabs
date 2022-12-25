package Lab2.extra.classes_relations;

public class Agregation {
    Outsider fromOutside;
    Agregation(Outsider o) {
        fromOutside = o;
    }
}
