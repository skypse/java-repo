package movies_description_java_pratica_alura;

public class Movies {
    public static void movieDescription(){
        System.out.println("------------------------------------------------");
        System.out.println("Movie Description");
        System.out.println("Movie: Top Gun: Maverick");

        int realesedYear = 2022;
        System.out.println("Released Year: " + realesedYear);
        boolean incluedInThePlan = true;
        double movieRating = 8.1;

        double averageRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("averageRating: " + averageRating);
        System.out.println("------------------------------------------------");

        String sinopse;
        sinopse = """
                Movie: Top Gun
                Naval Fighter Weapons School is where the best of the best train to refine their elite flying skills
                Very good!
                Realesed Year:
                """+ realesedYear;
        System.out.println(sinopse);
        int classification = (int) (movieRating/ 2);
        System.out.println(classification);
    }
}
