import cv2
im = cv2.imread('images/kson.jpg')
im2 = cv2.imread('images/kson_negative.jpg')
im3 = cv2.bitwise_and(im, im2)
cv2.imwrite('images/kson_and.jpg', im3)
im3 = cv2.bitwise_or(im, im2)
cv2.imwrite('images/kson_or.jpg', im3)
im3 = cv2.bitwise_xor(im, im2)
cv2.imwrite('images/kson_xor.jpg', im3)

