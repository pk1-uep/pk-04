package pl.pk.edu.service;

import pl.pk.edu.model.Student;

public class CreateService {

    public static void insertData(EduService edu) {
        Student s1 = new Student("Ala Kowalska", 2.0);
        edu.insertStudent(s1);

        Student s2 = new Student("Maria Nowak", 5.0);
        edu.insertStudent(s2);

        edu.insertStudent(new Student("Jan Paweł Mruk", 3.0));
        edu.insertStudent(new Student("Antoni Zbożny", 4.5));
        edu.insertStudent(new Student("Marek Piosik", 3.5));
        edu.insertStudent(new Student("Adam Lichoń", 5.0));
        edu.insertStudent(new Student("Ewa Demarczyk", 2.0));
        edu.insertStudent(new Student("Aleksandra Piątek", 4.0));
    }

}
