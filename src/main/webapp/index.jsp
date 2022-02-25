<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>Simulador de Investimento</div>
<form action="inv_001.jsp" method="post">
<table>
<tr><td>CPF</td>
<td><input type="text" name="cpf" required></td></tr>
<tr><td>Nome</td>
<td><input type="text" name="nome" required></td></tr>
<tr><td>Valor a investir</td>
<td><input type="text" name="valinv" required></td></tr>
<tr><td>Taxa</td>
<td><input type="text" name="taxa" required></td></tr>
<tr><td>Período (min:12 e max:36 meses)</td>
<td><input type="number" name="periodo" min="12" max="36"></td></tr>
<tr><th colspan=2><input type="submit" name="env" value="Enviar"></th></tr>
</table>
</form>
</body>
</html>
