public class Lab7Question {
        protected String text;
        protected String answer;
        public Lab7Question()
        {
            text="";
            answer="";
        }
        public void display(){
            System.out.println(text);
        }
        public void setText(String text) {
            this.text = text;
        }
        public void setAnswer(String answer) {
            this.answer = answer;
        }
        public boolean check_answer(String respons) {
            int i=0,sumLength=0;
            String Crespons=respons.toUpperCase();
            String Canswer=answer.toUpperCase();
            while (i<answer.length()&&Canswer.charAt(i)==Crespons.charAt(i))
            {
                i++;
                sumLength++;
            }
            if(sumLength==answer.length())  return true;
            else return false;
        }
    }