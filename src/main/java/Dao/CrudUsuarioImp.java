package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TblUsuariocl2;

public class CrudUsuarioImp {
	
    	public String ValidarUsuario(TblUsuariocl2 tblusu) {
    	//Conexion con la unidad de persistencia
                EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_JOSECHANG");
                //Gestionar
                EntityManager emanager=conex.createEntityManager();
                //Iniciar
                emanager.getTransaction().begin();

                //Relacionamos
                Query consulta=emanager.createQuery("SELECT u FROM TblUsuariocl2 u  "
                        + "where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
                //Pasamos parametros
                consulta.setParameter("x",tblusu.getUsuariocl2());
                consulta.setParameter("y",tblusu.getPasswordcl2());
                String mensaje="";
                TblUsuariocl2 u;
                try{
                    u=(TblUsuariocl2) consulta.getSingleResult();
                    mensaje="existe";
                }catch(Exception ex){
                    u=null;
                    mensaje="no existe";

                }

        return mensaje;
    }
}