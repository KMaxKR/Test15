package FirstEx;

public class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public void PersonInfo(String FirstName, String LastName, int age) throws RuntimeException{
        if(FirstName.equals("") || LastName.equals("")){
            throw new RuntimeException("InvalidNameException");
        }else {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }
        if (age >= 0 && age <= 150){
            this.age = age;
        }else {
            throw new RuntimeException("InvalidAgeException");
        }
    }
    public void getInfo(){
        System.out.println(FirstName + "\n" + LastName + "\n" + age);
    }

}
