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

public class Lab4InClass{

	public static Test suite() {
		TestSuite suite = new TestSuite(Lab4InClass.class.getName());
		//$JUnit-BEGIN$
		suite.addTest(AppTest.suite());
		//$JUnit-END$
		return suite;
	}
    @org.junit.jupiter.api.Test
    public void testApp()
    {
        Assert.assertTrue( true );
        
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
        
        Student newStudent=new Student("1000", "newName", 9356, "newEmail");
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
        
        Tema newTema=new Tema("1000", "dsadas", 123, 456);
        Tema addedTema=service.addTema(newTema);
        Assert.assertNotNull(addedTema);

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
        
        Nota newNota=new Nota("123", "1000", "1000", 10, LocalDate.now());
        Double addedNota=service.addNota(newNota, "nu");
        Assert.assertNotNull(addedNota);
    }
    @org.junit.jupiter.api.Test
    public void testBigBang()
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
        Student newStudent=new Student("1001", "newName", 9356, "newEmail");
        Student addedStudent=service.addStudent(newStudent);
        Assert.assertNotNull(addedStudent);
        Nota newNota=new Nota("123", "1001", "1001", 10, LocalDate.now());
        Double addedNota=service.addNota(newNota, "nu");
        Assert.assertNotNull(addedNota);
    }
}
