package pages;

public class Movies implements PageInterface{

        private static Movies instance;
        private String name;

        private Movies(String name) {
            this.name = name;
        }

        public static Movies getInstance() {
            if (instance == null) {
                instance = new Movies("Movies");
            }
            return instance;
        }

        public String getName() {
            return name;
        }

        public boolean action(String feature, String[] args) {
//            // to implement when movieDatabase is live
//            dataBase.MovieDatabase db = dataBase.MovieDatabase.getInstance();
//            if (args.length == 0) {
//                System.out.println("No movie name provided");
//                return;
//            }
//            String movieName = args[0];
//            if (db.getMovie(movieName) == null) {
//                System.out.println("Movie not found");
//                return;
//            }
//            System.out.println(db.getMovie(movieName).toString());
            return false;
        }
}
