public class Cat extends Animal {

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void introduceYourself()
    {
        System.out.println("Meow. I am a cat. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
}
