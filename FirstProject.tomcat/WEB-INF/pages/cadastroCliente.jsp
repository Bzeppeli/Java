<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
	<title>cadastro de Cliente</title>
</head>
<body>


<h2>Formul�rio de Cadastro de Cliente</h2>
<form:form method="POST" action="/cliente/addCliente">
   <table>
    <tr>
        <td><form:label path="nome">Nome></form:label></td>
        <td><form:input path="nome" /></td>
    </tr>
    <tr>
        <td><form:label path="cpf">CPF:</form:label></td>
        <td><form:input path="cpf" /></td>
    </tr>
    <tr>
        <td><form:label path="rg">RG:</form:label></td>
        <td><form:input path="rg" /></td>
    </tr>    
    <tr>
        <td><form:label path="endereco">Endere�o:</form:label></td>
        <td><form:textarea path="endereco" /></td>
    </tr>
    <tr>
        <td><form:label path="salario">Sal�rio:</form:label></td>
        <td><form:input path="salario" /></td>
    </tr>        
    <tr>
        <td><form:label path="telefone">Telefone:</form:label></td>
        <td><form:textarea path="telefone" /></td>
    </tr>
    <tr>
        <td><form:label path="profissao">Profiss�o:</form:label></td>
        <td><form:textarea path="profissao" /></td>
    </tr>    
    <tr>
        <td><form:label path="descricao">Descri��o</form:label></td>
        <td><form:textarea path="descricao" /></td>
    </tr>
     <tr>
        <td><form:label path="dataNascimento">Data de Nascimento:</form:label></td>
        <td><form:input path="dataNascimento" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<a href="/cliente/listaClientes">Lista</a>
</body>
</html>