<%-- 
    Document   : cadastroaplicacoes
    Created on : 5 de abr. de 2021, 21:37:59
    Author     : joaob
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="vacinacao" uri="br.recife.edu.ifpe.customtags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aplicação</title>
    </head>
    <body>
        <vacinacao:carregavacinas/>
        <vacinacao:carregaprofissionais/>
        
        <p>Profissional</p>
        <select name="vacina" id="vacina">
            <c:forEach var="p" items="${profissionais}">
                <option value="${p.codigo}">${p.nome}</option>
            </c:forEach>
        </select><br/>
        <p>Profissional</p>
        <select name="vacina" id="vacina">
            <c:forEach var="v" items="${vacinas}">
                <option value="${v.codigo}">${v.nome}</option>
            </c:forEach>
        </select>
    </body>
</html>
