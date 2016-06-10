<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Creation d'une annonce</title>
</head>
<body>
<table>
<form  method="post" action="CreationAnnonce">
		<tr><td><label for="nom">Nom : </label></td>
		<td><input type="text" name="nom" id="nom" ></input></td></tr>
		<tr><td><label for="adresse"><br>Adresse : </label></td>
		<td><input type="text" name="adresse" id="adresse"></input></td></tr>
		<tr><td><label for="numero"><br>Téléphone :</label></td>
		<td><input type="text" name="numero" id="numero"></input></td></tr>
		<br>
		<tr><td><label for="categorie">Catégorie : </label></td>
		<td><select name="categorie" id="categorie">
			<c:forEach items="${ categories }" var="categorie">
				<option value="${ categorie.getId() }">${categorie.getSujet() }</option>
			</c:forEach>
		</select></td></tr>
        <tr><td><input type="submit" value ="envoyer"/></td></tr>
    </form>
    <tr><td><a href="<c:url value="/admin"/>">Retour à l'accueil</a></td></tr>
    </table>
    </body>
</html>