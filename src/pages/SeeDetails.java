package pages;

public class SeeDetails implements PageInterface{

        private static SeeDetails instance;
        private String name;

        private SeeDetails(String name) {
            this.name = name;
        }

        public static SeeDetails getInstance() {
            if (instance == null) {
                instance = new SeeDetails("SeeDetails");
            }
            return instance;
        }

        public String getName() {
            return name;
        }

        public boolean action(String feature, String[] args) {
            // see details only has one feature so feature is not used
            return false;
        }
}
