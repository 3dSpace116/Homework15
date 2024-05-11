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

    public static void comparsionStudent(Kogtewran obj1, Kogtewran obj2) {
        if ((obj1.smart + obj1.wise + obj1.wit + obj1.creativity) > (obj2.smart + obj2.wise + obj2.wit + obj2.creativity)) {
            System.out.println(obj1.getName() + " лучший Когтевранец, чем " + obj2.getName());

        } else System.out.println(obj2.getName() + " лучший Когтевранец, чем " + obj1.getName());
    }

    @Override
    public String toString() {
        return getName() + " Faculty Kogtewran " +
                ", wichcraft= " + getWichcraft() +
                ", transgression= " + getTransgression() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
