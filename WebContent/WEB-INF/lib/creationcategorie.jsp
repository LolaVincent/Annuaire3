<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Creer une categorie</title>
</head>
<body>
	<form  method="post" action="CreationCategorie">
		<label for="sujet">Sujet : </label>
		<input type="text" name="sujet" id="sujet" ></input>
		<br>
        <input type="submit" value ="envoyer"/>
    </form>
    <a href="<c:url value="/admin"/>">Retour à l'accueil</a>
</body>
</html>