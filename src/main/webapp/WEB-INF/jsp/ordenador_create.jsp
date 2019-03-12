<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>
		<spring:message code="ordenador.create" />
	</h1>
	<a href="<spring:url value="/ordenador_list.html" />"><spring:message
			code="ordenador.list" /></a>
	<form:form method="POST" action="/ordenador_create.html"
		modelAttribute="ordenadorForm">
		<form:errors path="" element="div" />
			<div>
				<form:label path="id">
					<spring:message code="ordenador.id" />
				</form:label>
				<form:input path="id" />
				<form:errors path="id" />
			</div>
			<div>
				<form:label path="marca">
					<spring:message code="ordenador.marca" />
				</form:label>
				<form:input path="marca" />
				<form:errors path="marca" />
			</div>
			<div>
				<form:label path="modelo">
					<spring:message code="ordenador.modelo" />
				</form:label>
				<form:input path="modelo" />
				<form:errors path="modelo" />
			</div>
			<div>
				<form:label path="password1">
					<spring:message code="ordenador.password1" />
				</form:label>
				<form:input path="password1" />
				<form:errors path="password1" />
			</div>
			<div>
				<form:label path="password2">
					<spring:message code="ordenador.password2" />
				</form:label>
				<form:input path="password2" />
				<form:errors path="password2" />
			</div>	
			<div>
				<input type="submit" />
			</div>
	</form:form>
</body>
</html>