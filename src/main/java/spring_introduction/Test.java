package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

       Pet pet = new Cat();
       Person person = new Person();
       person.setPet(pet);
       person.setSurname("Smirnova");
       person.setAge(23);
       System.out.println(person.getSurname());
       System.out.println(person.getAge());
       person.callYourPet();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());
        person1.callYourPet();

        context.close();
    }
}
