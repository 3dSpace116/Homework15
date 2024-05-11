public class Puffendui extends Hogwarts {
    private int hardWorker;
    private int loyality;
    private int honesty;

    public Puffendui(String name, int wichcraft, int transgression, int hardWorker, int loyality, int honesty) {
        super(name, wichcraft, transgression);
        this.hardWorker = hardWorker;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public static void comparsionStudent(Puffendui obj1, Puffendui obj2) {
        if ((obj1.hardWorker + obj1.loyality + obj1.honesty) > (obj2.hardWorker + obj2.loyality + obj2.honesty)) {
            System.out.println(obj1.getName() + " лучший Пуффендуец, чем " + obj2.getName());

        } else System.out.println(obj2.getName() + " лучший Пуффендуец, чем " + obj1.getName());
    }

    @Override
    public String toString() {
        return getName() +
                " Faculty Puffendui " +
                ", wichcraft= " + getWichcraft() +
                ", transgression= " + getTransgression() +
                ", hardWorker=" + hardWorker +
                ", loyality=" + loyality +
                ", honesty=" + honesty;
    }
}

