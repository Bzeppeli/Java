<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibe detalhes do Cliente</title>
</head>
<body>

<h2>Detalhes do Cliente Cadastrado</h2>
   <table>
    <tr>
        <td>Nome:</td>
        <td>${nome}</td>
    </tr>
    <tr>
        <td>CPF:</td>
        <td>${cpf}</td>
    </tr>
    <tr>
        <td>RG:</td>
        <td>${rg}</td>
    </tr>    
    <tr>
        <td>Salário:</td>
        <td>${salario}</td>
    </tr>    
    <tr>
        <td>Endereço:</td>
        <td>${endereco}</td>
    </tr>
    <tr>
        <td>Profissão:</td>
        <td>${profissao}</td>
    </tr>    
    <tr>
        <td>Telefone:</td>
        <td>${telefone}</td>
    </tr>
    <tr>
        <td>Descrição:</td>
        <td>${descricao}</td>
    </tr>
    <tr>
        <td>Data de Nascimento:</td>
        <td>${dataNascimento}</td>
    </tr>    
</table>  
<a href="/cliente/cliente">Cadastro</a>
<a href="/cliente/listaClientes">Lista</a>

</body>
</html>