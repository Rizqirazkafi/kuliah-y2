from numpy import array,zeros
import copy
import numpy as np
# Deklarasi Matriks
A = np.array([
    [1,1,0,3,4],
    [2,1,-1,1,1],
    [3,-1,-1,2,-3],
    [-1,2,3,-1,4]
    ])

# Jumlah value dari sebuah dimensi matriks
n = A.shape[0]

# Membuat variable untuk menampung hasil solusi
x = np.zeros(n)

# Triangularisasi
ATri = copy.copy(A)
for i in range(n):
    if ATri[i][i] == 0.0:
        print("Value tidak boleh 0!")
        raise
    for j in range(i+1,n):
        ratio = ATri[j][i]/ATri[i][i]
        for k in range(n+1):
            ATri[j][k] = ATri[j][k]-ratio*ATri[i][k]
print(ATri)
