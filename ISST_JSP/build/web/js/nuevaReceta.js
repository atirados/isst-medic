
//Gesti��n del cerrado de alertas
$(function(){
	$("[data-hide]").on("click", function(){
    	$(this).closest("." + $(this).attr("data-hide")).hide();
	});
});

//Al hacer click en "Reiniciar Formulario"
$("#btnReiniciarFormulario").click( function (){
	//Muestra una alerta
	$("#confirmacionBorrarFormulario").show();
});

$("#borrarFormulario").click(function(){
	$("#nombreMedico").val("");
	$("#numColegiado").val("");
	$("#nombrePaciente").val("");
	$("#numTarjetaSanitaria").val("");
	$("#nombreMedicamento").val("");
	$("#abrevMedicamento").val("");
	$("#datepick").val("");
	$("#posologia").val("");
	$("#alternativas").val("");
	$("#periodoRecetaPeriodica").val("");
	$("#datepick2").val("");
	$("#periodoRecetaCronica").val("");

	$("#confirmacionBorrarFormulario").hide();
	$("#alertFormularioBorrado").show();
});

$("input[name='tipoReceta']").change(function(){
	$("#divCronica").hide();
	$("#divPeriodica").hide();

	var tipoReceta = $(this).val();
    if(tipoReceta == "recetaCronica"){
    	$("#divCronica").show();
    	return;
    }
    if(tipoReceta == "recetaPeriodica"){
    	$("#divPeriodica").show();
    	return;
    }
    else{
    	
    }
});

function enviarReceta(){

}