import numpy as np

A = np.array([[1,1],
             [1,1]])
B = np.array([[2,3],
              [4,5]])

print("A ",A)
print("B",B)

C = np.dot(A,B)

print("C ",C)