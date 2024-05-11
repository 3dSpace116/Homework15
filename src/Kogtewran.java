public class Kogtewran extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public Kogtewran(String name, int wichcraft, int transgression, int smart, int wise, int wit, int creativity) {
        super(name, wichcraft, transgression);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static String comparsionStudent(Kogtewran obj1, Kogtewran obj2){
        if ((obj1.smart+obj1.wise+obj1.wit+ obj1.creativity)>(obj2.smart+obj2.wise+obj2.wit+obj2.creativity)){
            return obj1.name + " лучший Когтевранец, чем " + obj2.name;

        }
        else return obj2.name+" лучший Когтевранец, чем "+ obj1.name ;
    }

    @Override
    public String toString() {
        return name +
                " Faculty Kogtewran" +
                ", wichcraft=" + wichcraft +
                ", transgression=" + transgression +
                "smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
