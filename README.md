#### 1. What will be printed?
```java
Meow. I am a cat. My name is Kurre
and I am 6 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
```

#### 2. Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.
cat and dog inherit age values from animal since instance can stored multiple data/values without sharing the values with other instances. 
 
#### 3. What actually consists an instance of?
modifier, data type, variable name.

####  4. And what consists a class of?
class name, method, data member, constructor

#### 5. What is the difference between a class and an instance?
instance indicate relationship of object with its class while is a blueprint which is use to create object. 

#### 6. Change the declaration of the instance variable age of Animal to a class variable using static, in this way:

```java 
public static int age;
```
#### What is the result of the output now? Why?

output: 
```java 
Meow. I am a cat. My name is Kurre
and I am 3 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
```

because the age value is set as 3 referring to cat age.

#### 7. Where is the value of an instance variable stored?
in Lab1Stage1 main method, where the age is defined.

#### 8. Where is the value of a class variable stored?
age in Animal class.

#### 9. What refers the variable this to?
refers to class itself. if two variable or method with same name are used, variable this will use both of class version. 
