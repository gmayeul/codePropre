# Erreurs de conception

* en utilisant le polymorphisme, préciser le type de compte devient inutile
* le taux de rémunération est un attribut spécifique aux livrets A ; cet attribut doit donc être placé dans la classe ```LivretA``` et non ```CompteBancaire```
* la méthode ```debiter``` doit être séparée en deux pour éviter d'utiliser le type de compte comme un "flag" ; on doit avoir une méthode ```debiter``` dans la classe ```CompteBancaire``` et une méthode ```debiter``` dans la classe ```LivretA```