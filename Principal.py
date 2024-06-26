import MenuAutores_Libros
import json 
import Funciones
with open("biblioteca.json","r") as archivo:
    Biblioteca=archivo.read()
MenuAutores_Libros.MenuLibro()
MenuAutores_Libros.MenuMantenedorAutores()
opcion=int(input("Seleccione una opcion: "))
if opcion==1:
    Funciones.AgregarAutor(Biblioteca)
if opcion==2:
    Funciones.EditarAutor(Biblioteca)
if opcion==3:
    Funciones.EliminarAutor(Biblioteca)
if opcion==4:
    Funciones.ListarAutores(Biblioteca)
if opcion==5:
    MenuAutores_Libros.MenuLibro()
with open("Reportes_biblioteca_mundo_libro.json","w") as archivo2:
    archivo2.writelines("************************************************")
    archivo2.writelines("*  Autor        Cantidad de libros prestados   *")
    archivo2.writelines("************************************************")
    for Nombres in Biblioteca["Autor"]["Nombre"]:
        archivo2.write(Nombres)
        

