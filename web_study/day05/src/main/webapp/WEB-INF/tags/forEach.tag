<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="items" type="java.util.List" required="true" %>
<%@ attribute name="var" required="true" rtexprvalue="false" %>
<%@ variable name-from-attribute="var" alias="itme" variable-class="java.lang.String" scope="NESTED" %>

<%for (Object item : items) {%>
        <c:set var="item" value="<%=item%>" />
        <jsp:doBody />
<%}%>

<%
    List<String> fruits = Arrays.asList("Apple", "Orange","Melon");
    pageContext.setAttribute("fruits",fruits);
%>

<util:forEach var="fruit" items="${fruits}">
    <h1>${fruit}</h1>
</util:forEach>
