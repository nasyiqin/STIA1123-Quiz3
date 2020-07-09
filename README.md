#### 1. What will be printed?
```java
Meow. I am a cat. My name is Kurre
and I am 6 years old.
Woof. I am a dog. My name is Vilma
and I am 3 years old.
```

#### 2. Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.
instance can stored multiple data/values without sharing the values with other instances. 
 
#### 3. What actually consists an instance of?
modifier, data type, variable name.

####  4. And what consists a class of?
class name, method, data member, constructor

#### 5. What is the difference between a class and an instance?
instance indicate relationship of object with its class but class does not.

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

#### 7. It may happen that you get warnings from the compiler that you should access the variable age via Animal.age, but it should be possible to run the program anyway. Otherwise, change the references to age into Animal.age.


#### 8. Where is the value of an instance variable stored?
age in Animal class.

#### 9. Where is the value of a class variable stored?
age 

#### 10. What refers the variable this to?
age
