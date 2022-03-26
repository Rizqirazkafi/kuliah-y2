import cv2

im = cv2.imread('images/kson.jpg')
im2 = cv2.imread('images/kson_gray.jpg')

subIm = cv2.subtract(im,im2)
cv2.imwrite('images/ksonSub.jpg', subIm)
