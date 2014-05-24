<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RME - Receta Médica Electrónica</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <nav class="navbar navbar-default" role="navigation">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp"><img class="img-responsive" src="images/logo2.png"></img></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li class=""><a href="home.jsp"><span class="glyphicon glyphicon-home"> </span>
 Inicio </a></li>
            <li class="dropdown active">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-credit-card"> </span> Recetas <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="nuevaReceta.jsp">Nueva Receta</a></li>
                <li><a href="verRecetas.jsp">Ver Recetas</a></li>
              </ul>
            </li>
            <li><a href="nomenclator.jsp"><span class="glyphicon glyphicon-star"> </span> Nomenclátor</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">FAQ</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-4 text-center">
          <h3>Ver Recetas</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div id="recetasDiv"><br>
                <table class="table" id="recetasTable">
                    <tr>
                        <td>
                            <strong>Médico</strong>
                        </td>
                        <td>
                            <span id="nombreMedico"><%= servlet.MostrarRecetasServlet.nombreMedico %></span><br>
                            (<span id="numColegiado" value=""></span><%= servlet.MostrarRecetasServlet.numeroColegiado %>)
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Paciente</strong>
                        </td>
                        <td>
                            <span id="nombrePaciente"><%= servlet.MostrarRecetasServlet.paciente %></span><br>
                            <span id="numTarjetaSanitaria"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Fecha<strong>
                        </td>
                        <td>
                            <span id="fecha"><%= servlet.MostrarRecetasServlet.fecha %></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Medicamento</strong>
                        </td>
                        <td>
                            <span id="nombreMedicamento"><%= servlet.MostrarRecetasServlet.medicamento %></span><br>
                            <span id="abrevMedicamento"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Posología</strong>
                        </td>
                        <td>
                            <span id="posologia"><%= servlet.MostrarRecetasServlet.posologia %></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Tipo de receta</strong>
                        </td>
                        <td>
                            <span id="tipoReceta"><%= servlet.MostrarRecetasServlet.tipoReceta %></span><br>
                            Cada <span id="periodo"></span> días<br>
                            Hasta <span id="fechaFinRecetaPeriodica"></span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <strong>Alternativas</strong>
                        </td>
                        <td>
                            <span id="alternativas"><%= servlet.MostrarRecetasServlet.alternativa %></span>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
      </div>
    </div>

    <div id="footer" class="container">
      <nav class="navbar navbar-default navbar-fixed-bottom">
          <div class="navbar-inner navbar-content-center col-md-8 col-md-offset-2">
              <p class="text-muted text-center credit center">Ingeniería de Tecnologías y Servicios de Telecomunicación (ISST) - Curso 2013/14 - <a href="#myModal" data-toggle="modal" data-target="#myModal"> Créditos</a></p>
          </div>
          <div class="col-md-2">
            <a href="http://www.etsit.upm.es" target="blank"><img src="images/etsit.png" height="35px"></img></a>
            <a href="http://www.dit.upm.es" target="blank"><img src="images/dit.png" height="35px"></img></a>
          </div>
      </nav>

      <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
              <h4 class="modal-title" id="myModalLabel"><strong>Créditos</strong></h4>
            </div>
            <div class="modal-body text-center">
              <h3>Trabajo realizado por</h3>
              <acronym title="Scrum Master"><p>Adrián Tirados Mata</p></acronym>
              <p>Nicolás de la Flor Julián</p>
              <p>Pablo Álvarez García</p>
              <p>Verónica Gómez Muñoz</p>
              <p>Carlos del Amo Bevia</p>
              <p>Mario Moreno Zarco</p>
              <p>Marco Nattero Santiago</p><br>
              <p>
              Para la asignatura <acronym title="Ingeniería de Tecnologías y Servicios de Telecomunicación">ISST</acronym> (4º curso, especialidad Telemática) del Grado en Ingeniería de Tecnologías y Servicios de Telecomunicación de la ETSI de Telecomunicación (UPM)
              </p>
              <div class="col-md-8 col-md-offset-2">
                <a target="blank" href="http://www.etsit.upm.es"><img src="images/etsit.png" height="35px"></img></a>
                <a target="blank" href="http://www.dit.upm.es"><img src="images/dit.png" height="35px"></img></a>
              </div><br>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
            </div>
          </div>
        </div>
      </div>
  </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
