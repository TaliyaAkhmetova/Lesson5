public class Main {
    public static void main (String[] args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Developer", "ppp@mailbox.com", "123456789", 35000, 45);
        persArray[2] = new Person("Annova Anna", "Teacher", "aaa@mailbox.com", "987654321", 25000, 51);
        persArray[3] = new Person("Sidorov Viktor", "Manager", "sss@mailbox.com", "555555555", 50000, 27);
        persArray[4] = new Person("Nadina Nadezhda", "CEO", "nnn@mailbox.com", "1212121", 100000, 46);

        for (Person person: persArray){
            if (person.getAge()>40) {
                person.fullInfo();
                System.out.println("Mission complited");
            }
        }
    }

}
