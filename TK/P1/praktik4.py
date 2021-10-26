from numpy import array,zeros
A = array([[3.,8.,5.],[6.,4.,7.]]) # A berukuran 2x3
B = array([[1.,3.],[5.,9.],[2.,4.]]) # B berukuran 3x2

n=2 #jumlah baris matrik A
m=3 #jumlah kolom matrik A sekaligus jumlah baris matrik B
p=2 #jumlah kolom matrik B
E = zeros((n,p))
print(A)
print(B)
print(E)
for i in range(0,n):
    print(E)
    for j in range(0,p):
        print(E)
        for k in range(0,m):
            E[i][j]=E[i][j]+A[i][k]*B[k][j]
            print(E)
print(E)
