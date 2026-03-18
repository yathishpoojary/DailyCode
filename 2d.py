import numpy as np

# create 2d array from it

A = np.array([[1,2,4],
              [4,5,6],
              [7,8,9]])

print("matrix A ",A);

slice_A = A[:,:1]

print("After Slice ",slice_A);

# Vectorized addition

B = A +12

print(" B ",B)

# Multiplication

C = np.dot(A,B)

print (" C ", C)