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

    public static String comparsionStudent(Griffindor obj1, Griffindor obj2){
        if ((obj1.nobility+obj1.honor+obj1.bravery)>(obj2.nobility+obj2.honor+obj2.bravery)){
            return obj1.name + " лучший Гриффиндорец, чем " + obj2.name;

        }
        else return obj2.name+" лучший Гриффиндорец, чем "+ obj1.name ;
    }

    @Override
    public String toString() {
        return name +
                " Faculty Griffindor"+
                ", wichcraft=" + wichcraft +
                ", transgression=" + transgression +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;}
}

