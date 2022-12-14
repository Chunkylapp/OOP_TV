package pages;

import user.StandardUser;

public class Register implements PageInterface{

        private static Register instance;
        private String name;

        private Register(String name) {
            this.name = name;
        }

        public static Register getInstance() {
            if (instance == null) {
                instance = new Register("Register");
            }
            return instance;
        }

        public String getName() {
            return name;
        }

        public boolean action(String feature, String[] args) {
            // register only has one feature so feature is not used
            if(args.length < 5)
                return false;
            dataBase.DataBase.addUser(new StandardUser(args[0], args[1], args[2], Integer.parseInt(args[3])));
            return true;
        }
}
