import numpy as np

x = np.array([10,30,50,70,90])
y = np.array([0,40,80,120,160])

def linear_interpolation(x_1, x_2, y_1, y_2, x_out):
    return (y_1 + ((y_2 - y_1) / (x_2 - x_1)) * (x_out - x_1))

def lagrange_interpolation(x,y,xp,n):
    yp = 0
    for i in range(n):
        p = 1
        for j in range(n):
            if i != j:
                p = p*(xp - x[j])/(x[i] - x[j])
        yp = yp + p * y[i]
    return yp

print("Linear:" , linear_interpolation(x[1],x[0],y[1],y[0],20))
print("Lagrange:", lagrange_interpolation(x,y,20,5))
