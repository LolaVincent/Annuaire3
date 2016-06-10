<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des annonces</title>
</head>
<body>
<table>
	<tr>
		<td> Annonce </td>
		<td> Action </td>
	</tr>
	<c:forEach items="${annonces}" var="annonce">
		<tr>
			<td>${annonce.nom}</td>
		
			<td><a href="<c:url value="/VoirAnnonce"><c:param name="annonce_nom" value="${ annonce.nom}" /></c:url>">
		                Voir
		         </a><br>
			<a href="<c:url value="/SuppressionAnnonce"><c:param name="annonce_nom" value="${ annonce.nom }" /></c:url>">
		                Supprimer
		         </a><br>
		         <a href="<c:url value="/ModificationAnnonce"><c:param name="annonce_nom" value="${ annonce.nom }" /></c:url>">
		                Modifier
		         </a>
		     </td>
		</tr>
		         
	</c:forEach>
		
</table>
<a href="<c:url value="/admin"></c:url>">Retour à l'accueil</a>
</body>
</html>