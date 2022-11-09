public class Lab7FillInQuestion extends Lab7Question {
        public void setText(String text)
        {
            super.setText(text);
        }
        public void display()
        {
            int i = 0;
            while (i<text.length()) {
                if (text.charAt(i) == 'M') break;
                System.out.print(text.charAt(i));
                i++;
            }
            System.out.println("Me");
        }
        public String getTextAndAnswer()
        {
            return text;
        }
    }
