package main;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Alumno;
import model.Curso;
import model.Matricula;
import model.MatriculaPK;

public class Programa {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("MatriculasJPA");
		EntityManager em = 
				emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(2);
		alumno.setNombreAlumno("Paula");
		em.persist(alumno);
		
		Curso crs = new Curso();
		crs.setIdCurso(2000);
		crs.setNombreCurso("JAVA EJB");
		em.persist(crs);
		
	
		
		MatriculaPK pk = new MatriculaPK();
		pk.setIdAlumno(alumno.getIdAlumno());
		pk.setIdCurso(crs.getIdCurso());
		
		Matricula mtr = new Matricula();
		mtr.setAlumno(alumno);
		mtr.setCurso(crs);
		mtr.setFechaInicio(new Date());
		
		em.persist(mtr);
		em.getTransaction().commit();
		
		//alumno = em.find(Alumno.class, 1); só imprime a direção do objeto
		
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
}
