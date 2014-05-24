package entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-24T11:26:55")
@StaticMetamodel(Receta.class)
public class Receta_ { 

    public static volatile SingularAttribute<Receta, String> fechaExpedicion;
    public static volatile SingularAttribute<Receta, String> recetaId;
    public static volatile SingularAttribute<Receta, String> nombrePaciente;
    public static volatile SingularAttribute<Receta, String> nombreMedicamento;
    public static volatile SingularAttribute<Receta, String> posologia;
    public static volatile SingularAttribute<Receta, String> tipo;
    public static volatile SingularAttribute<Receta, String> medicamentoAlternativo;
    public static volatile SingularAttribute<Receta, Integer> tarjetaSanitaria;
    public static volatile SingularAttribute<Receta, String> nombreMedico;
    public static volatile SingularAttribute<Receta, Integer> numeroColegiado;

}