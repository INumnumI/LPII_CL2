<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>

<html>
<body bgcolor="#c5dec9">
<h2 align="center">Registrar Producto</h2>

<form method="post" action="ControladorProducto">
<table border="2" align="center">

<tr>
	<td>Nombre</td>
	<td><input type="text" name="nombrecl2"></td>
</tr>

<tr>
	<td>Precio</td>
	<td><input type="text" name="preciocompcl2"></td>
</tr>

<tr>
	<td>PrecioVen</td>
	<td><input type="text" name="precioventacl2"></td>
</tr>

<tr>
	<td>Estado</td>
	<td><input type="text" name="estadocl2"></td>
</tr>

<tr>
	<td>Descip</td>
	<td><input type="text" name="descripcl2"></td>
</tr>

<tr>
	<td colspan="2" align="center">
	<input type="submit" value="Registrar">
	</td>
</tr>
</table>
</form>

<h2 align="center">
	Listado de Productos
</h2>

<table align="center" border="2">
<tr>
	<th>codigo</th>
	<th>Nom.</th>
	<th>pv</th>
	<th>pc</th>
	<th>Est.</th>
	<th>Des</th>
</tr>

<!--escriptables-->
<%
//recuperamos los datos del controlador
List<TblProductocl2> listado=(List<TblProductocl2>)request.getAttribute("listado");
//aplicamos una condicion
if(listado!=null){
	//aplicamos un bucle for...
	for(TblProductocl2 tblpro:listado){
%>
<tr>
	<td><%=tblpro.getIdproductocl2() %></td>
	<td><%=tblpro.getNombrecl2() %></td>
	<td><%=tblpro.getPrecioventacl2() %></td>
	<td><%=tblpro.getPreciocompcl2() %></td>
	<td><%=tblpro.getEstadocl2() %></td>
	<td><%=tblpro.getDescripcl2() %></td>
</tr>

<%
	} //cerramos el bucle for...
} //cerramos la condicion
%>

</table>


</body>
</html>
