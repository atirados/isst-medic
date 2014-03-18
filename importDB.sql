USE recetaMedica;

LOAD DATA LOCAL INFILE '/home/genesis/Desktop/medicamentos.csv'
INTO TABLE tablaMedicamentos
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
(codigoNacional, nombreProducto, tipoFarmaco, nombreGenericoEfecto, codigoLaboratorio, nombreLaboratorio, estado, fechaAlta, fechaBaja, aportacionBeneficiario, principioActivo, precioIva, precioReferencia, precioAgrupacion, nombreAgrupacion, diagnosticoHospitalario, largaDuracion, controlMedico, medicamentoHuerfano, deduccionDecreto);
