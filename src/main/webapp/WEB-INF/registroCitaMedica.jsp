<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Registro Cita Medica</title>
</head>
<body>
    <div class="container">
        <c:if test="${msgError != null}">
            <c:out value="${msgError}"></c:out>
        </c:if>
        <h1 class="text-center">Registro Cita Medica</h1>
        <form:form action="/registro/cita_medica" method="post" modelAttribute="citaMedica">
            <form:label class="form-label" path="hora">Hora:</form:label>
            <form:input class="form-control" path="hora"></form:input>
            <br>
            <form:label class="form-label" path="areaMedica">Area Medica:</form:label>
            <form:input class="form-control" path="areaMedica"></form:input>
            <br>
            
            <input class="btn btn-primary" type="submit" value="Enviar">
        </form:form>
    </div>
</body>
</html>