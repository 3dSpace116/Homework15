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

    public static String comparsionStudent(Slizerin obj1, Slizerin obj2){
        if ((obj1.cunning+obj1.determination+obj1.ambition+ obj1.resourcefulness+obj1.lustForPower)>(obj2.cunning+obj2.determination+obj2.ambition+obj2.resourcefulness+obj2.lustForPower)){
            return obj1.name + " лучший Слизеренец, чем " + obj2.name;

        }
        else return obj2.name+" лучший Слизеренец, чем "+ obj1.name ;
    }

    @Override
    public String toString() {
        return name +
                " Faculty Slizerin" +
                ", wichcraft=" + wichcraft +
                ", transgression=" + transgression +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
}
