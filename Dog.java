public class Dog extends Animal{

    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void introduceYourself()
    {
        System.out.println("Woof. I am a dog. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
