public class Instructor {
        String name ;
        String nameofcourses;
        String pass;
        int Id ;
        private boolean login = false;

        public Instructor(String name, String pass, int Id, String nameofcourses) {
            this.name = name;
            this.pass = pass;
            this.Id = Id;
            this.nameofcourses=nameofcourses;
        }// Constructor to initialize instructor data by admin

        public boolean login(int Id, String pass) {
            if (Id == this.Id && pass.equals(this.pass)) {
                this.login = true;
                return true;
            }
            return false;
        }// Method to log the instructor in
        public void logout() {
            this.login = false;
        }// Method to log the instructor out
        public boolean isLoggedIn() {
            return login;
        }

        /*setters and getters to edit instructor data by instructor or admin*/
        public void setName(String name) {
            this.name = name;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
        public void setId(int Id) {
            this.Id = Id;
        }
        public void setNameofcourses(String nameofcourses) {
            this.nameofcourses = nameofcourses;
        }
        public String getName() {
            return name;
        }
        public String getPass() {
            return pass;
        }
        public int getId() {
            return Id;
        }
        public String getNameofcourses() {
            return nameofcourses;
        }

    }

