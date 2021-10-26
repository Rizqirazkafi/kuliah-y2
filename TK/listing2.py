from numpy import array

A = array([
    [1,1,0,3,4],
    [2,1,-1,1,1],
    [3,-1,-1,2,-3],
    [-1,2,3,-1,4]
    ])
#print(A)
int i
int b
for i in range(3):
    m=A[i][0]/A[0][0]
    for b in range(4):
        A[i][b]=A[i][b]-m*A[0][b]
print(A)

