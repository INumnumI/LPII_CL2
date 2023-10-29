package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TblProductocl2;

public class CrudProductoImp {
	
	public void RegistrarProducto(TblProductocl2 tbpro) {
		//Conexion con la unidad de persistencia
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2_JOSECHANG");
		EntityManager emanager=factory.createEntityManager();
		//Inicializar
		emanager.getTransaction().begin();
		//Registrar
		emanager.persist(tbpro);
		//Confirmar
		emanager.getTransaction().commit();
		//Cerrar
		emanager.close();	
	}
	
	public List<TblProductocl2> ListadoProducto() {
		//Conexion con la unidad de persistencia
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("LPII_CL2_JOSECHANG");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		//Listado
		List<TblProductocl2> listado=em.createQuery("select e from TblProductocl2 e",TblProductocl2.class).getResultList();
		//Confirmar
		em.getTransaction().commit();
		//Cerrar
		em.close();
				
		return listado;
	}

}
