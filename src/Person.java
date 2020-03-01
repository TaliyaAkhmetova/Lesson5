public class Person {

    private String name;
    private String position;
    private String email;
    private String cellPhone;
    private int salary;
    private int age;

public Person (String name, String position, String email, String cellPhone, int salary, int age){
    this.name = name;
    this.position = position;
    this.email = email;
    this.cellPhone = cellPhone;
    this.salary = salary;
    this.age = age;
}

public void fullInfo () {
    System.out.printf("Name is: %s | Position is: %s | Email is: %s | CellPhone is: %s | Salary is: %d | Age is: %d", name, position, email, cellPhone, salary, age);
}
public int getAge (){
    return age;
}
}
