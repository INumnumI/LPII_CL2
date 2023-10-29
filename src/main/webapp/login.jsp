<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="#c5dec9">
        <h2>Ingresa al Sistema</h2>
        <form action="ControladorUsuario" method="post" >
            <table border="2" align="center">
                <tr>
                    <td><label for="usuario">Usuario:</label></td>
                    <td><input type="text" id="usuario" name="usuario" required></td>
                </tr>
                <tr>
                    <td><label for="contrasena">Password:</label></td>
                    <td><input type="password" id="contrasena" name="contrasena" required></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Entrar" name="tipo">
        </form>
</body>
</html>