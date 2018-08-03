import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try {

          Student student = new Student() ;
          student.setNumber(12);
          student.setName("ali");
          student.setfName("Azimi");
          Address address = new Address();
          address.setCity("tehran");
          address.setStreet("jey");
          student.setAddress(address);

          SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();;
          Session session = factory.openSession();
          session.beginTransaction();
          session.save(student);
          session.getTransaction().commit();
          session.close();

//        Student stu = null;
//        Session session = factory.openSession();
//        session.beginTransaction();
//        stu = (Student) session.get(Student.class,831460324);
//        System.out.println(stu.getfName());

    }
    catch (Exception ex){
            System.exit(1);
    }
    finally {
            System.exit(0);
        }
}
}
