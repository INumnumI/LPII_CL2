package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudUsuarioImp;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
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
		
		String login = request.getParameter("usuario");
        String clave = request.getParameter("contrasena");

        model.TblUsuariocl2 tblusu = new model.TblUsuariocl2();
        CrudUsuarioImp crud = new CrudUsuarioImp();

        tblusu.setUsuariocl2(login);
        tblusu.setPasswordcl2(clave);

        String usuarioVerificado = crud.ValidarUsuario(tblusu);

        if (usuarioVerificado != null) {
        	String mensaje = "Usuario es correcto";
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            String mensaje = "Error en login y/o clave";
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
	}

}
