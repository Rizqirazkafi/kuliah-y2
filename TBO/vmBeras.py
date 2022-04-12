print("======== VENDING MACHINE BERAS ========\n")
pil = False
while pil is False:
    print("======== Pilih Jenis Beras :")
    print("1. Pandan Wangi     (Rp 9.500/kg) ")
    print("2. Raja Lele        (Rp.10.000/kg)")
    print("3. Setra Ramos      (Rp 9.000/kg)")
    print("4. IR 42            (Rp 8.600/kg) ")
    print("5. Solok            (Rp 9.200/kg) ")
    beras = int(input("(1-5): "))
    if beras == 1:
        bname = "Pandan Wangi"
        price = 9500
        pil = True
    elif beras == 2:
        bname = "Raja Lele"
        price = 10000
        pil = True
    elif beras == 3:
        bname = "Setra Ramos"
        price = 9000
        pil = True
    elif beras == 4:
        bname = "IR 42"
        price = 8600
        pil = True
    elif beras == 5:
        bname = "Solok"
        price = 9200
        pil = True
    else : 
        print("Nilai yang anda masukkan salah!")
        print("Silahkan pilih kembali (1-5): ")
        pil = False
print("Anda memilih beras : " + bname +"\n")
amt = False
while amt == False:
    print("======== Paket beras : ")
    print("1. 1 KG")
    print("2. 5 KG")
    print("3.10 KG")
    amtCat = int(input("Paket beras : ")) 
    if amtCat == 1:
        tot = price
        pak = "1Kg"
        amt = True
    elif amtCat == 2:
        tot = price * 5
        pak = "5Kg"
        amt = True
    elif amtCat == 3:
        tot = price * 10
        pak = "10Kg"
        amt = True
    else : 
        print("Pilihan yang anda masukkan salah.")
        print("Coba lagi!")
        amt = False
finalState = False
while finalState == False:
    print("\nRincian belanja: ")
    print("Beras : " + bname )
    print("Paket : " + pak)
    print("Total : Rp" + str(tot)+"\n")
    print ("Pilih metode pembayaran : ")
    print("1. Tunai")
    print("2. E-money ")
    mp = int(input("(1/2) : "))
    if mp == 1:
        kembali = 0
        cash = 0
        while cash < tot:
            cash = int(input("Masukkan jumlah uang: Rp."))
            kembali = cash - tot 
            if cash < tot:
                print("Mohon maaf, jumlah uang anda tidak mencukupi")
            else : finalState = True
        eMoney = False
    elif mp == 2:
        cash = input("Masukkan nomor e-money: ")
        eMoney = True
        finalState = True
    else :
        print("Pilihan anda salah. Coba lagi!")
        finalState = False

print("Transaksi berhasil!")
print("Rincian belanja: ")
print("Beras : " + bname )
print("Paket : " + pak)
print("Total : Rp" + str(tot)+"\n")
if eMoney == True:
    sald = 2504000 - tot
    print ("Sisa saldo anda : Rp." + str(sald))
else :
    print("Bayar : Rp" + str(cash))
    print("Kembali : Rp " + str(kembali))
