
def menu():
   opciones = ["Suma","Resta","Multiplicación","División", "Salir"]
   for i in range(0,5, 1):
      print(f"{i+1}. {opciones[i]}")
   opc = int(input("Ingrese el proceso a realizar? "))
   match opc:
      case 1:
         suma()

def suma():
   print("SUMA")
menu()