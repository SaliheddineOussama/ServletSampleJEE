<%@page import="web.CreditModel"%>
<%
	CreditModel model = (CreditModel) request.getAttribute("modelCalcul");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simulateur Crédit</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<p class="spacer"></p>
	<div class="container">
	<div class="col-md-6 col-xm-12 col-sm-6 col-md-offset-3">
		<div class="panel panel-primary">
		<div class="panel-heading">Simulateur Crédit</div>
			<div class="panel-body">
				<form method="POST" action="calculMensualite.do">
						<div class="form-group">
							<label class="form-label"> Montant : </label>
							<input class="form-control" type="test" name="montant" value="<%=model.getMontant()%>" />
						</div>
						<div class="form-group">
							<label class="form-label"> Taux : </label>
							<input class="form-control" type="text" name="taux" value="<%=model.getTaux()%>" />
						</div>				
						<div class="form-group">
							<label class="form-label"> Durée : </label>
							<input class="form-control" type="test" name="duree" value="<%=model.getDuree()%>" />
						</div>				
						<button class="btn btn-danger">Calculer</button>
				</form>
				<div>
					<label class="spacer">Mensualité à payer est de : </label> <label><%=model.getMensualite()%></label>
				</div>
			 </div>
		</div>
	</div>
	</div>
</body>
</html>