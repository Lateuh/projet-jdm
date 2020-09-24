console.log("LAAAAA");
function makeHttpObject() {
	  try {console.log("Bien ICI"); return new XMLHttpRequest();}
	  catch (error) {}
	  try {console.log("Bien ICI2");return new ActiveXObject("Msxml2.XMLHTTP");}
	  catch (error) {}
	  try {console.log("Bien ICI3");return new ActiveXObject("Microsoft.XMLHTTP");}
	  catch (error) {}

	  throw new Error("Could not create HTTP request object.");
	}

	var request = makeHttpObject();
	request.open("GET", "Access-Control-Allow-Origin: http://www.jeuxdemots.org/rezo-dump.php?gotermsubmit=Chercher&gotermrel=chat", true);
	request.send(null);
	request.onreadystatechange = function() {
	  if (request.readyState == 4){
		console.log(request.responseText);
		console.log("Bien ICI4");
	}
	    console.log("Bien ICI5");
	};