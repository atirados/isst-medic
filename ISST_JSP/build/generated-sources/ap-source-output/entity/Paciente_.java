package entity;

import entity.Receta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-24T11:26:55")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile ListAttribute<Paciente, Receta> recetas;
    public static volatile SingularAttribute<Paciente, Integer> tarjetaSanitaria;

}