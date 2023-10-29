package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombrecl2=request.getParameter("nombrecl2");
		String precioventacl2 =request.getParameter("precioventacl2");
		String preciocompcl2=request.getParameter(("preciocompcl2"));
		String estadocl2=request.getParameter("estadocl2");
		String descripcl2=request.getParameter("descripcl2");
			
		//realizamos las respectivas instancias
		TblProductocl2 tblpro=new TblProductocl2();
		CrudProductoImp crud=new CrudProductoImp();
		//Asignamos valores
		tblpro.setNombrecl2(nombrecl2);
		tblpro.setPrecioventacl2(Double.parseDouble(precioventacl2));
		tblpro.setPreciocompcl2(Double.parseDouble(preciocompcl2));
		tblpro.setEstadocl2(estadocl2);
		tblpro.setDescripcl2(descripcl2);
		
		//Invocamos al metodo registrar
		crud.RegistrarProducto(tblpro);
		
		//Recuperamos el listado
		List<TblProductocl2> listado=crud.ListadoProducto();
		//Enviamos el listado hacia las vista
		request.setAttribute("listado", listado);
		
		//Redirecionamos
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
