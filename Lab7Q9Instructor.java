public class Lab7Q9Instructor extends Lab7Q9Person{
        private double salary;
        public Lab7Q9Instructor(String name,String YearOfBirth,double salary)
        {
            super(name,YearOfBirth);
            this.salary=salary;
        }

    @Override
    public String toString() {
        return "Lab7Q9Instructor{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", YearOfBirth='" + YearOfBirth + '\'' +
                '}';
    }
}
