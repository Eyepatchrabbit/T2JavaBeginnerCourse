package t2.gevorderdecursusttwo.les08_databases.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class SchoolApp {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("java-gevorderd");
    private static EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("java-gevorderd");
    private static EntityManager entityManager = emf.createEntityManager();

    public static void main(String[] args) {

        Student studentOne = createStudent("Harry", "Potter");
        Student studentTwo = createStudent("Ron", "Wezel");
        Student studentThree = createStudent("Herminy", "Granger");

        Course firstCourse = createCourse("Alchemy");
        Course secondCourse = createCourse("DefenceDarkArts");
        Course thirdCourse = createCourse("Herbology");

        firstCourse.setStudents(Arrays.asList(studentOne, studentTwo, studentThree));
        secondCourse.setStudents(Arrays.asList(studentOne, studentThree));
        thirdCourse.setStudents(Arrays.asList(studentTwo, studentThree));

        studentOne.setCourses(Arrays.asList(firstCourse, secondCourse));
        studentTwo.setCourses(Arrays.asList(firstCourse, thirdCourse));
        studentThree.setCourses(Arrays.asList(firstCourse, secondCourse, thirdCourse));

        persistEntities(Arrays.asList(studentOne,studentTwo,studentThree),Arrays.asList(firstCourse,secondCourse,thirdCourse));
    }

    private static Course createCourse(String courseName) {
        Course firstCourse = new Course();
        firstCourse.setName(courseName);
        return firstCourse;
    }

    private static Student createStudent(String firstName, String secondName) {
        Student studentOne = new Student();
        studentOne.setFirstName(firstName);
        studentOne.setLastName(secondName);
        return studentOne;
    }

    private static void persistEntities(List<Student> studentList, List<Course> courses) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        try {
            studentList.forEach(student -> entityManager.persist(student));
            courses.forEach(course -> entityManager.persist(course));
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityTransaction.rollback();
        } finally {
            entityManager.close();
            emf.close();
        }

    }


}
