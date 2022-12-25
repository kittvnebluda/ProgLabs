package Lab2.extra.classes_relations;

public class Main {
    public static void main(String[] args) {
        Outsider onOurSide = new Outsider("TEXT from MAIN");
        Agregation arg = new Agregation(onOurSide);
        Composition comp = new Composition();

        arg.fromOutside.hello();
        comp.butField.hello();
    }
}
