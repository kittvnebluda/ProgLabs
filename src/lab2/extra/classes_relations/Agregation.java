package lab2.extra.classes_relations;

public class Agregation {
    Outsider fromOutside;
    Agregation(Outsider o) {
        fromOutside = o;
    }
}
