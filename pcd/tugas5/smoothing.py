import numpy as np
from matplotlib import pyplot as plt
from pylab import *
import cv2
ion() 
ori_img = plt.imread('images/kson.jpg')
 
def box_kernel(size):
    k = np.ones((size, size), np.float32) / (size ** 2)
    return k
 
kernel_size = 5
filtered_img = cv2.filter2D(ori_img, -1, box_kernel(kernel_size))
 
plt.subplot(121), plt.imshow(ori_img), plt.title('Original Image')
plt.xticks([]), plt.yticks([])
plt.subplot(122), plt.imshow(filtered_img), plt.title('Smoothed Image')
plt.xticks([]), plt.yticks([])
plt.show()
