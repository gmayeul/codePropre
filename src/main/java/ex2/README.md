# Erreurs de conception

* en utilisant le polymorphisme, pr�ciser le type de compte devient inutile
* le taux de r�mun�ration est un attribut sp�cifique aux livrets A ; cet attribut doit donc �tre plac� dans la classe ```LivretA``` et non ```CompteBancaire```
* la m�thode ```debiter``` doit �tre s�par�e en deux pour �viter d'utiliser le type de compte comme un "flag" ; on doit avoir une m�thode ```debiter``` dans la classe ```CompteBancaire``` et une m�thode ```debiter``` dans la classe ```LivretA```