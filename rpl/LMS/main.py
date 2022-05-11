import sys
print("Selamat datang di Lab Management System! \n")

def login(username, password):
        username = input("Username :")
        password = input("Password :")
        if username == "admin" and password == "admin" : 
            print("Success")
        else : 
            print("\n Username atau password salah.")
            print("Silahkan coba lagi! \n")

action = ""

while action != "n":
    action = input("Masuk ke program? [Y/n]: ")
    if action == "n" :
        print("Keluar dari program")
        break
    print("Masukkan username dan password! \n")
    username, password= "", ""
    while username != "admin" and password != "admin":
        login(username, password)
