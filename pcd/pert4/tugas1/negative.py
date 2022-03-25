import cv2
import numpy as  np

def openImg(img: str):
    return cv2.imread(img)

def showImg(img: np.ndarray, title: str = "image"):
    cv2.imshow(title, img)
    cv2.waitKey(0)
    cv2.destroyAllWindows()

def negative(img: np.ndarray):
    # make image negative
    return 255 - img

# main

img = openImg("images/kson.jpg")
img = negative(img)
showImg(img)
