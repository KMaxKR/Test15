import FirstEx.Person;
import SecondEx.Numbers;
import ThirdEx.DividedNumber;

public class Main {
    public static void main(String[] args){
        //Ex 1
        
        Person person = new Person();
        person.PersonInfo("K","Max",19);  //All will work right
        person.getInfo();

        Person person1 = new Person();
        person1.PersonInfo("Try","",30); //Will be an exception InvalidNameException
        person1.getInfo();

        Person person2 = new Person();
        person2.PersonInfo("H","H", -12); //Will be an exception InvalidAgeException
        person2.getInfo();

        //Ex 2

        Numbers numbers = new Numbers();
        numbers.setNumber(10);
        System.out.println(numbers.divideBy(3));

        Numbers numbers1 = new Numbers();
        numbers1.setNumber(10);
        System.out.println(numbers1.divideBy(0));

        //Ex 3

        DividedNumber dividedNumber = new DividedNumber();
        dividedNumber.setLimit(8,7);  //Will be an exception InvalidRangeException
        dividedNumber.getList();
        dividedNumber.countDivisibleBy7Numbers();

        DividedNumber dividedNumber1 = new DividedNumber();
        dividedNumber1.setLimit(1,20);
        dividedNumber1.getList();
        dividedNumber1.countDivisibleBy7Numbers();


    }
}