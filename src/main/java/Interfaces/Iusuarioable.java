package Interfaces;
import java.util.List;

import model.TblUsuariocl2;

public interface Iusuarioable {
	
        public List<TblUsuariocl2> ListadoUsuario();
        public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblusu);
        public String ValidarUsuario(TblUsuariocl2 tblusu);

}