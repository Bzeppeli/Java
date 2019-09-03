<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes Cadastrados</title>
</head>
<body>
	<h2>Lista de Clientes Cadastrados</h2>
	
	<c:if test="${not empty clientes}">
		<table>
			<tr>
			
				<td>Nome</td>
				<td>CPF</td>
				<td>Telefone</td>
				<td>Endere�o</td>
				<td>Descri��o</td>
				<td>Profiss�o</td>
				<td>RG</td>
				<td>Sal�rio</td>
				<td>Data de Nascimento</td>
				
			</tr>
			
			<c:forEach var="listValue" items="${cliente}">
			
				<td>${listValue.nome}</td>
				<td>${listValue.cpf}</td>
				<td>${listValue.telefone}</td>
				<td>${listValue.endereco}</td>
				<td>${listValue.descriacao}</td>
				<td>${listValue.profissao}</td>
				<td>${listValue.rg}</td>
				<td>${listValue.salario}</td>
				<td><fmt:formatDate pattern = "dd/MM/yyyy" value="${listValue.dataNascimento}"/><td>
				
			</c:forEach>
			
			
		</table>
		
		
	</c:if>
	
<a href="/cliente/cliente">Cadastro</a>

</body>
</html>