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
if __name__ == "__main__":
    img = openImg("images/kson.jpg")
    # negative 
    negativeImage = negative(img)
    cv2.imshow("negative", negativeImage)
    # power low transformation
    powerLogTransformImg = np.power(negativeImage, 0.5)
    cv2.imshow("power", powerLogTransformImg)
    # piecewise Linear Transform
    piecewiseLinearTransformImage = np.piecewise(img)
    cv2.imshow("piecewise", piecewiseLinearTransformImage)
    cv2.waitKey(0)
    cv2.destroyAllWindows()
