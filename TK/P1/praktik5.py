from numpy import array,zeros

A1 = array([[3,8,5],[6,4,7]])
x = array([[2],[3],[4]])
n=2
m=3
E = zeros((n,1))
print(E)
for i in range(0,n):
    print(E)
    for k in range(0,m):
        E[i][0] = E[i][0]+A1[i][k]*x[k][0]
        print(E)
print(E)
