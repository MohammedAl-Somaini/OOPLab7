public class Lab7NumericQuestion extends Lab7Question {
        private double answer;
        public void setAnswer(double correctResponse)
        {
            answer=correctResponse;
        }
        public boolean checkAnswer(String Response)
        {
            double responseDouble=Double.parseDouble()Double(Response);
            return Math.abs(responseDouble-answer)<=0.01;
        }
    }
