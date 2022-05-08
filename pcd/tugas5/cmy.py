import numpy as np
import matplotlib.pyplot as plt
import cv2
 
# Import image
img = plt.imread("images/kson.jpg")
 
# Create float
bgr = img.astype(float)/255.
 
# Extract channels
with np.errstate(invalid='ignore', divide='ignore'):
    C = (1-bgr[...,2])
    M = (1-bgr[...,1])
    Y = (1-bgr[...,0])
 
# Convert the input BGR image to CMYK colorspace
CMY = (np.dstack((C,M,Y)) * 255).astype(np.uint8)
 
# Split CMYK channels
Y, M, C = cv2.split(CMY)
 
np.isfinite(C).all()
np.isfinite(M).all()
np.isfinite(Y).all()
 
plt.figure()
plt.subplot(3,2,1)
plt.imshow(C)
plt.title('C')
plt.subplot(3,2,2)
plt.imshow(M)
plt.title('M')
plt.subplot(3,2,3)
plt.imshow(Y)
plt.title('Y')
plt.subplot(3,2,5)
plt.imshow(img)
plt.title('RGB Original')
plt.subplot(3,2,6)
plt.imshow(CMY)
plt.title('CMY')
 
plt.show()

