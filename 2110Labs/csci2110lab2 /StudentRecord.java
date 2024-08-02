public class StudentRecord {

    private String firstName;
    private String lastName;
    private int bannerId;

    public StudentRecord(String firstName,String lastName,int bannerId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerId = bannerId;
    }


        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getBannerId() {
            return bannerId;
        }

        public void setBannerId(int bannerId) {
            this.bannerId = bannerId;
        }
    }


