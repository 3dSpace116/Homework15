public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int wichcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, wichcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public static void comparsionStudent(Slizerin obj1, Slizerin obj2) {
        if ((obj1.cunning + obj1.determination + obj1.ambition + obj1.resourcefulness + obj1.lustForPower) > (obj2.cunning + obj2.determination + obj2.ambition + obj2.resourcefulness + obj2.lustForPower)) {
            System.out.println(obj1.getName() + " лучший Слизеренец, чем " + obj2.getName());

        } else System.out.println(obj2.getName() + " лучший Слизеренец, чем " + obj1.getName());
    }

    @Override
    public String toString() {
        return super.toString() +
                " Faculty Slizerin" +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
}
