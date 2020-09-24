<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InteractionMots</title>
</head>
<body>
	<p><c:out value="Bonjour !" /></p>
	<br>
	
	<c:forEach var="current" items="${listeTR}" >

    <p>${current}</p>

 </c:forEach>
 
 
 
 
 <script type="text/javascript" src="<c:url value='/js-sources/accueil.js'/>"></script>
 
</body>
</html>