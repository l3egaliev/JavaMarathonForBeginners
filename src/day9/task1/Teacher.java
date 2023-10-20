package day9.task1;

public class Teacher extends Human{
        private String subject;

        public Teacher(String name, String subject){
                super(name);
                this.subject = subject;
        }
        @Override
        public void printInfo(){
                super.printInfo();
                System.out.println("Это учитель с именем "+super.getName());
        }

}
