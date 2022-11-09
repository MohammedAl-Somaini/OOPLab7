public class Lab7Q9Student extends Lab7Q9Person{
        private String major;
        public Lab7Q9Student(String name,String YearOfBirth,String major)
        {
            super(name,YearOfBirth);
            this.major=major;
        }

    @Override
    public String toString() {
        return "Lab7Q9Student{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", YearOfBirth='" + YearOfBirth + '\'' +
                '}';
    }
}