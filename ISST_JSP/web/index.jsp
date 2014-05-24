<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>RME - Receta M�dica Electr�nica</title>

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
            <li class="active"><a href="#"><span class="glyphicon glyphicon-user"> </span> Login</a></li>
            <li><a href="#myModal" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-tasks"> </span> Cr�ditos</a></li>
            <li><a href=""><span class="glyphicon glyphicon-leaf"> </span> About</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">FAQ</a></li>
          </ul>
        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
      <div class="jumbotron"    >
        <h1>RME</h1>
        <h4>Bienvenido al nuevo sistema de Receta M�dica Electr�nica</h4>
        <!--<p><a class="btn btn-primary btn-lg" role="button">Learn more</a></p>-->
        <div class="row">
          <div class="col-md-6 col-md-offset-3">
            <form class="form-horizontal" role="form" action="IndexServlet" autocomplete="off">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">M�dico</label>
                <div class="col-sm-10">
                  <input type="text" name="numColegiado" class="form-control" id="inputEmail3" placeholder="Num. de Colegiado">
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">Contrase�a</label>
                <div class="col-sm-10">
                  <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Contrase�a">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-success">Acceder</button>
                </div>
              </div>
            </form>

          </div>
        </div>
      </div>
    </div>

    <div id="footer" class="container">
      <nav class="navbar navbar-default navbar-fixed-bottom">
          <div class="navbar-inner navbar-content-center col-md-8 col-md-offset-2">
              <p class="text-muted text-center credit center">Ingenier�a de Tecnolog�as y Servicios de Telecomunicaci�n (ISST) - Curso 2013/14 - <a href="#myModal" data-toggle="modal" data-target="#myModal">Cr�ditos</a></p>
          </div>
          <div class="col-md-2">
            <a href="http://www.etsit.upm.es" target="blank"><img src="images/etsit.png" height="35px"></img></a>
            <a href="http://www.dit.upm.es" target="blank"><img src="images/dit.png" height="35px"></img></a>
          </div>
      </nav>

      <!-- MODAL -->
      <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
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
                <a target="blank" href="www.etsit.upm.es"><img src="images/etsit.png" height="35px"></img></a>
                <a target="blank" href="www.dit.upm.es"><img src="images/dit.png" height="35px"></img></a>
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

