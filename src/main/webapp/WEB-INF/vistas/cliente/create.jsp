<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>
<t:layout>
    <jsp:attribute name="scripts">
        <jsp:include page="scripts.jsp"></jsp:include>
    </jsp:attribute>
    <jsp:body>
        <div class="container">
            <th:form class="form-horizontal" action="${context}/cliente/add" method="POST" modelAttribute="cliente">
                <jsp:include page="createeditpartial.jsp"></jsp:include>
            </th:form>
        </div>
    </jsp:body>
</t:layout>
