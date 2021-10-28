from numpy import array

A = array([
    [1,1,0,3,4],
    [2,1,-1,1,1],
    [3,-1,-1,2,-3],
    [-1,2,3,-1,4]
    ])
#print(A)
for i in range(A.shape[0]-1):
    Ai =i+1
    m=A[Ai][0]/A[0][0]
    for j in range(A.shape[1]):
        A[Ai][j]= A[Ai][j]-m*A[0][j]

print(A)
