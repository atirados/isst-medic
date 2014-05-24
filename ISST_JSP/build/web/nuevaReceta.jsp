<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RME - Receta M�dica Electr�nica</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/datepicker.css">
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
            <li><a href="nomenclator.jsp"><span class="glyphicon glyphicon-star"> </span> Nomencl�tor</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">FAQ</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-4">

          <div class="alert alert-warning" id="confirmacionBorrarFormulario" style="display:none;">
             <a href="#" data-hide="alert" type="button" class="close">&times;</a>
             �Seguro que desea reiniciar el formulario?
             
               <button type="btn" id="borrarFormulario" class="btn btn-warning">Aceptar</button>
             
           </div>

           <div class="alert alert-success" id="alertFormularioBorrado" style="display:none;">
             <a href="#" data-hide="alert" type="button" class="close">&times;</a>
             Formulario borrado correctamente
           </div>

          <h3>Nueva Receta</h3>
        </div>
      </div>
      <div class="row">
        <div class="col-md-6 col-md-offset-3">
          <form class="form-horizontal" role="form" autocomplete="off" action="NuevaRecetaServlet">
            <div class="form-group">
              <label for="inombreMedico" class="col-sm-2 control-label">M�dico</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="nombreMedico" id="nombreMedico" placeholder="Nombre">
              </div>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="numColegiado" id="numColegiado" placeholder="N�m. Colegiado">
              </div>
            </div>
            <div class="form-group">
              <label for="nombrePaciente" class="col-sm-2 control-label">Paciente</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="nombrePaciente" id="nombrePaciente" placeholder="Nombre">
              </div>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="numTarjetaSanitaria" id="numTarjetaSanitaria" placeholder="Tarjeta Sanitaria">
              </div>
            </div>
            <div class="form-group">
              <label for="datepick" class="col-sm-2 control-label">Fecha</label>
              <div class="col-sm-5">
                <div class="input-group date">
                  <input type="text" class="form-control" id="datepick" name="fecha">
                  <span class="input-group-addon"><span id="datepick" class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
              </div>
            </div>
            <div class="form-group">
              <label for="nombreMedicamento" class="col-sm-2 control-label">Medicamento</label>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="nombreMedicamento" id="nombreMedicamento" placeholder="Nombre">
              </div>
              <div class="col-sm-5">
                <input type="text" class="form-control" name="abrevMedicamento" id="abrevMedicamento" placeholder="Abreviatura">
              </div>
            </div>
            <div class="form-group">
              <label for="posologia" class="col-sm-2 control-label">Posolog�a</label>
              <div class="col-sm-10">
                <textarea class="form-control" id="posologia" name="posologia" rows="2"></textarea>
              </div>
            </div>
            <div class="form-group form-inline">
              <label for="recetaSimple" class="col-sm-2 control-label">Tipo</label>
              <div class="col-sm-6">
                <div class="radio">
                  <label>
                    <input type="radio" name="tipoReceta" id="recetaSimple" value="recetaSimple" checked>
                    Simple
                  </label>
                </div>
                <div class="radio">
                  <label>
                    <input type="radio" name="tipoReceta" id="recetaCronica" value="recetaCronica">
                    Cr�nica
                  </label>
                </div>
                <div class="radio">
                  <label>
                    <input type="radio" name="tipoReceta" id="recetaPeriodica" value="recetaPeriodica">
                    Peri�dica
                  </label>
                </div>
              </div>
            </div>

            <div id="divCronica" style="display:none;">
              <div class="form-group">
                <label for="datepick" class="col-sm-2 control-label">Periodo</label>
                <div class="col-sm-3">
                  <div class="input-group date">
                    <input type="text" name="periodoRecetaCronica" class="form-control" id="periodoRecetaCronica">
                    <span class="input-group-addon">D�as</span>
                  </div>
                </div>
              </div>
            </div>

            <div id="divPeriodica" style="display:none;">
              <div class="form-group">
                <label for="datepick" class="col-sm-2 control-label">Periodo</label>
                <div class="col-sm-3">
                  <div class="input-group date">
                    <input type="text" name="periodoRecetaPeriodica" class="form-control" id="periodoRecetaPeriodica">
                    <span class="input-group-addon">D�as</span>
                  </div>
                </div>
              </div>
              <div class="form-group">
                <label for="datepick" class="col-sm-2 control-label">Hasta</label>
                <div class="col-sm-5">
                  <div class="input-group date">
                    <input type="date" name="fechaFinRecetaPeriodica" class="form-control" id="datepick2">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                  </div>
                </div>
              </div>
            </div>


            <div class="form-group">
              <label for="alternativas" class="col-sm-2 control-label">Alternativas</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="alternativas" id="alternativas" placeholder="Medicamento(s)">
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Guardar Receta</button>
                <a id="btnReiniciarFormulario" class="btn btn-danger">Reiniciar formulario</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    

    <div class="row">
    <div id="footer" class="container">
      <nav class="navbar navbar-default navbar-fixed-bottom">
          <div class="navbar-inner navbar-content-center col-md-8 col-md-offset-2">
              <p class="text-muted text-center credit center">Ingenier�a de Tecnolog�as y Servicios de Telecomunicaci�n (ISST) - Curso 2013/14 - <a href="#myModal" data-toggle="modal" data-target="#myModal"> Cr�ditos</a></p>
          </div>
          <div class="col-md-2">
            <a href="http://www.etsit.upm.es" target="blank"><img src="images/etsit.png" height="35px"></img></a>
            <a href="http://www.dit.upm.es" target="blank"><img src="images/dit.png" height="35px"></img></a>
          </div>
      </nav>
    </div>
  </div>

  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <a type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
              <h4 class="modal-title" id="myModalLabel"><strong>Cr�ditos</strong></h4>
            </div>
            <div class="modal-body text-center">
              <h3>Trabajo realizado por</h3>
              <acronym title="Scrum Master"><p>Adri�n Tirados Mata</p></acronym>
              <p>Nicol�s de la Flor Juli�n</p>
              <p>Pablo �lvarez Garc�a</p>
              <p>Ver�nica G�mez Mu�oz</p>
              <p>Carlos del Amo Bevia</p>
              <p>Mario Moreno Zarco</p>
              <p>Marco Nattero Santiago</p><br>
              <p>
              Para la asignatura <acronym title="Ingenier�a de Tecnolog�as y Servicios de Telecomunicaci�n">ISST</acronym> (4� curso, especialidad Telem�tica) del Grado en Ingenier�a de Tecnolog�as y Servicios de Telecomunicaci�n de la ETSI de Telecomunicaci�n (UPM)
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
    <script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
    <script type="text/javascript" src="js/nuevaReceta.js"></script>
    <script>
    $(".alert").alert();

      $(function () {
                $('#datepick').datepicker({
                  format: "dd/mm/yyyy",
                  start:"-3d"
                });
            });
      $(function () {
                $('#datepick2').datepicker({
                  format: "dd/mm/yyyy"
                });
            });
    </script>
  </body>
</html>
