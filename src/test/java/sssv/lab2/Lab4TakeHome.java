package sssv.lab2;

import java.time.LocalDate;

import domain.Nota;
import domain.Student;
import domain.Tema;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;
import repository.NotaXMLRepo;
import repository.StudentXMLRepo;
import repository.TemaXMLRepo;
import service.Service;
import validation.NotaValidator;
import validation.StudentValidator;
import validation.TemaValidator;

public class Lab4TakeHome {

	public static Test suite() {
		TestSuite suite = new TestSuite(Lab4TakeHome.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(AppTest.suite());
		suite.addTest(Lab4InClass.suite());
		//$JUnit-END$
		return suite;
	}
    @org.junit.jupiter.api.Test
    public void testAddStudent()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
    	String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);
        
        Student newStudent=new Student("1001", "newName", 9356, "newEmail");
        Student addedStudent=service.addStudent(newStudent);
        Assert.assertNotNull(addedStudent);

    }
    @org.junit.jupiter.api.Test
    public void testAddTema()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
    	String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);
        
        Tema newTema=new Tema("1001", "dsadas", 123, 456);
        Tema addedTema=service.addTema(newTema);
        Assert.assertNotNull(addedTema);
        Student newStudent=new Student("1002", "newName", 9356, "newEmail");
        Student addedStudent=service.addStudent(newStudent);
        Assert.assertNotNull(addedStudent);

    }
    @org.junit.jupiter.api.Test
    public void testAddNota()
    {
        StudentValidator studentValidator = new StudentValidator();
        TemaValidator temaValidator = new TemaValidator();
    	String filenameStudent = "fisiere/Studenti.xml";
        String filenameTema = "fisiere/Teme.xml";
        String filenameNota = "fisiere/Note.xml";

        StudentXMLRepo studentXMLRepository = new StudentXMLRepo(filenameStudent);
        TemaXMLRepo temaXMLRepository = new TemaXMLRepo(filenameTema);
        NotaValidator notaValidator = new NotaValidator(studentXMLRepository, temaXMLRepository);
        NotaXMLRepo notaXMLRepository = new NotaXMLRepo(filenameNota);
        Service service = new Service(studentXMLRepository, studentValidator, temaXMLRepository, temaValidator, notaXMLRepository, notaValidator);
        
        
        Tema newTema=new Tema("1004", "dsadas", 123, 456);
        Tema addedTema=service.addTema(newTema);
        Assert.assertNotNull(addedTema);
        Student newStudent=new Student("1004", "newName", 9356, "newEmail");
        Student addedStudent=service.addStudent(newStudent);
        Assert.assertNotNull(addedStudent);
        Nota newNota=new Nota("123", "1004", "1004", 9, LocalDate.now());
        Double addedNota=service.addNota(newNota, "nu");
        Assert.assertNotNull(addedNota);


    }

}
