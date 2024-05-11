public abstract class Hogwarts {
    private String name;
    private int wichcraft;
    private int transgression;

    public Hogwarts(String name, int wichcraft, int transgression) {
        this.name = name;
        this.wichcraft = wichcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWichcraft() {
        return wichcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public String toString() {
        return name + " " + wichcraft + " " + transgression;
    }

    public static String comparsionStudent(Hogwarts student1, Hogwarts student2) {
        if ((student1.wichcraft + student1.transgression) > (student2.wichcraft + student2.transgression)) {
            return student1.name + " обладает большей мощностью магии чем " + student2.name;
        } else return student2.name + " обладает большей мощностью магии чем " + student1.name;
    }


    public static void main(String[] args) {
        Griffindor HarryPotter = new Griffindor("Harry Potter", 79, 78, 100, 99, 90);
        Griffindor HermionaGranger = new Griffindor("Hermiona Granger", 60, 67, 78, 87, 90);
        Griffindor RonWeasley = new Griffindor("Ron Weasley", 90, 87, 77, 77, 88);

        Puffendui ZachariasSmith = new Puffendui("Zacharias Smith", 78, 76, 54, 56, 86);
        Puffendui CedricDiggory = new Puffendui("Cedric Diggory", 45, 47, 89, 54, 65);
        Puffendui JustinFinchFletchley = new Puffendui("Justin Finch-Fletchley", 98, 76, 67, 78, 90);

        Kogtewran ChoChang = new Kogtewran("Cho Chang", 85, 45, 67, 78, 54, 56);
        Kogtewran PadmaPatil = new Kogtewran("Padma Patil", 98, 46, 76, 78, 98, 54);
        Kogtewran MarcusBelby = new Kogtewran("Marcus Belby", 98, 67, 78, 76, 87, 89);

        Slizerin DracoMalfoy = new Slizerin("Draco Malfoy", 90, 87, 77, 88, 55, 77, 77);
        Slizerin GrahamMontague = new Slizerin("Graham Montague", 99, 88, 77, 88, 76, 67, 66);
        Slizerin GregoryGoyle = new Slizerin("Gregory Goyle", 88, 65, 43, 56, 78, 99, 87);

        System.out.println(HarryPotter.toString());
        System.out.println(CedricDiggory.toString());
        System.out.println(ChoChang.toString());
        System.out.println(DracoMalfoy.toString());

        Griffindor.comparsionStudent(HarryPotter, HermionaGranger);
        Puffendui.comparsionStudent(ZachariasSmith, JustinFinchFletchley);
        Kogtewran.comparsionStudent(PadmaPatil, MarcusBelby);
        Slizerin.comparsionStudent(DracoMalfoy, GregoryGoyle);

        System.out.println(Hogwarts.comparsionStudent(ZachariasSmith, GrahamMontague));


    }
}
