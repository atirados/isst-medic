USE a7141543_pruebas;

DROP TABLE IF EXISTS loginMedicos;
CREATE TABLE loginMedicos
(
	login	varchar(255) NOT NULL,
	pass	varchar(255) NOT NULL,

	PRIMARY KEY	(login)
);



DROP TABLE IF EXISTS tablaMedicos;
CREATE TABLE tablaMedicos
(
	numeroColegiadoMedico	int unsigned NOT NULL,
	nombre	varchar(255) NOT NULL,
	apellidos	varchar(255) NOT NULL,

	PRIMARY KEY	(numeroColegiadoMedico)
);

DROP TABLE IF EXISTS tablaFarmaceuticos;
CREATE TABLE tablaFarmaceuticos
(
	nombre	varchar(255) NOT NULL,
	apellidos	varchar(255) NOT NULL,
	numeroColegiadoFarmaceutico	int unsigned NOT NULL,

	PRIMARY KEY	(numeroColegiadoFarmaceutico)
);

DROP TABLE IF EXISTS tablaMedicamentos;
CREATE TABLE tablaMedicamentos
(
	codigoNacional int unsigned NOT NULL,
	nombreProducto varchar(255) NOT NULL,
	tipoFarmaco varchar(255) DEFAULT NULL,
	nombreGenericoEfecto varchar(255) NOT NULL,
	codigoLaboratorio int unsigned NOT NULL,
	nombreLaboratorio varchar(255) NOT NULL, 
	estado varchar(4) NOT NULL DEFAULT 'ALTA',
	fechaAlta varchar(10) NOT NULL,
	fechaBaja varchar(10) DEFAULT NULL,
	aportacionBeneficiario decimal(10,2) unsigned DEFAULT NULL,
	principioActivo varchar(255) DEFAULT NULL,
	precioIva decimal(10,2) unsigned NOT NULL,
	precioReferencia decimal(10,2) unsigned DEFAULT NULL,
	precioAgrupacion decimal(10,2) unsigned DEFAULT NULL,
	nombreAgrupacion varchar(255) DEFAULT NULL,
	diagnosticoHospitalario varchar(255) DEFAULT NULL,
	largaDuracion varchar(255) DEFAULT NULL,
	controlMedico varchar(255) DEFAULT NULL,
	medicamentoHuerfano varchar(2) NOT NULL,
	deduccionDecreto varchar(255) DEFAULT NULL,

	PRIMARY KEY	(codigoNacional)
);
