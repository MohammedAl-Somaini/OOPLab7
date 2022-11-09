public class Lab7Q9Person {
        protected String name;
        protected String YearOfBirth;
        public Lab7Q9Person(String name, String yearOfBirth) {
            this.name = name;
            this.YearOfBirth = yearOfBirth;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getYearOfBirth() {
            return YearOfBirth;
        }
        public void setYearOfBirth(String yearOfBirth) {
            YearOfBirth = yearOfBirth;
        }

    @Override
    public String toString() {
        return "Lab7Q9Person{" +
                "name='" + name + '\'' +
                ", YearOfBirth='" + YearOfBirth + '\'' +
                '}';
    }
}
