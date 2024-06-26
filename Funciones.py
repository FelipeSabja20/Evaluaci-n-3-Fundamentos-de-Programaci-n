import json
import MenuAutores_Libros
def AgregarAutor(Biblioteca):
    AutorAgregar=input("Ingrese el autor que desea agregar: ")
    Biblioteca.update(AutorAgregar)
def EditarAutor(Biblioteca):
    AutorEditar=input("Ingrese el autor que desea editar: ")
    NombreAsignar=input("Ingrese el nombre que desea asignar: ")
    NacionalidadAsignar=input("Ingrese la nacionalidad que desea asignar: ")
    for i in range(len(Biblioteca["Autor"])):
        if i==AutorEditar:
            Biblioteca["Autor"][i]["Nombre"]=NombreAsignar
            Biblioteca["Autor"][i]["Nacionalidad"]=NacionalidadAsignar
            break
def EliminarAutor(Biblioteca):
    Posicion=0
    IdEliminar=int("Ingrese el id a eliminar: ")
    for ID in Biblioteca["AutorID"]:
        if ID==IdEliminar:
            Biblioteca.pop(Posicion)
        Posicion+=1
def ListarAutores(Biblioteca):    
    with open("biblioteca.json","w") as archivo:
        json.dump(archivo)
    leerBiblioteca={
        Biblioteca["Autor"]
    }
