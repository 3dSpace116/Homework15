public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int wichcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, wichcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void comparsionStudent(Griffindor obj1, Griffindor obj2) {
        if ((obj1.nobility + obj1.honor + obj1.bravery) > (obj2.nobility + obj2.honor + obj2.bravery)) {
            System.out.println(obj1.getName() + " лучший Гриффиндорец, чем " + obj2.getName());

        }
        System.out.println(obj2.getName() + " лучший Гриффиндорец, чем " + obj1.getName());
    }

    @Override
    public String toString() {
        return super.toString() +
                " Faculty Griffindor" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}

