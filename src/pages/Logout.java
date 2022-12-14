package pages;

public class Logout implements PageInterface{

        private static Logout instance;
        private String name;

        private Logout(String name) {
            this.name = name;
        }

        public static Logout getInstance() {
            if (instance == null) {
                instance = new Logout("Logout");
            }
            return instance;
        }

        public String getName() {
            return name;
        }

        public boolean action(String feature, String[] args) {
            // logout only has one feature so feature is not used
            return false;
        }
}
