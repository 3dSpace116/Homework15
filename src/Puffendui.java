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

    public static String comparsionStudent(Puffendui obj1, Puffendui obj2){
        if ((obj1.hardWorker+obj1.loyality+obj1.honesty)>(obj2.hardWorker+obj2.loyality+obj2.honesty)){
            return obj1.name + " лучший Пуффендуец, чем " + obj2.name;

        }
        else return obj2.name+" лучший Пуффендуец, чем "+ obj1.name ;
    }

    @Override
    public String toString() {
        return name +
                " Faculty Puffendui" +
                ", wichcraft=" + wichcraft +
                ", transgression=" + transgression +
                "hardWorker=" + hardWorker +
                ", loyality=" + loyality +
                ", honesty=" + honesty;
    }
}

