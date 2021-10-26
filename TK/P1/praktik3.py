from numpy import array,zeros

A = array([[3.,8.,5.],[6.,4.,7.]]) # A berukuran 2x3
C = array([[9.,5.,3.],[7.,2.,1.]]) # C berukuran 2x3

n=2
m=3
D = zeros((n,m))
for i in range(0,n):
    for j in range(0,m):
        D[i][j]=A[i][j]+C[i][j]
print(D)
