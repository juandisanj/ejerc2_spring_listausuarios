<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h1><spring:message code="ordenador.list" /></h1>
	<ul>
		<c:forEach items="${listOrdenadores}" var="ordenador">
			<li>
				<c:out value="${ordenador.getId()}" />
				<c:out value="${ordenador.getMarca()}" />
				<c:out value="${ordenador.getModelo()}" />
				<c:out value="${ordenador.getClave()}" />
			</li>
		</c:forEach>
	</ul>
	
	<a href="<spring:url value="/user_create.html" />"><spring:message code="user.create"/></a>
	<a href="<spring:url value="/ordenador_create.html" />"><spring:message code="ordenador.create" /></a>
</body>
</html>