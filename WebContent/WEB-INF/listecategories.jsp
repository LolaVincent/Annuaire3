<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des categories</title>
</head>
<body>
	<table>
	    <tr>
	        <th>Categorie</th>
	        <th>Actions<th>                    
	    </tr>
	    <c:forEach items="${categories}" var="categorie">
			<tr>
				<td>${categorie.getSujet()}</td>
				<td>
					<a href="<c:url value="/SuppressionCategorie"><c:param name="categorie_id" value="${ categorie.getId() }" /></c:url>">
		            	Supprimer
		         	</a><br>
		         	<a href="<c:url value="/ModificationCategorie"><c:param name="categorie_id" value="${ categorie.getId() }" /></c:url>">
		            	Modifier
		         	</a>
		     	</td>
			</tr>      
		</c:forEach>
	</table>
	<a href="<c:url value="/admin"/>">Retour à l'accueil</a>
</body>
</html>