import cv2

img = cv2.imread('./MonsterHunterWorld.jpg')

# give the negative effect to the image and show it for 3 second
img = cv2.bitwise_not(img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# log transformation the image and show it for 3 second
img = cv2.log(img + 1)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# power-law transformation the image and show it for 3 second
img = cv2.pow(img, 0.5)
cv2.imshow('image', img)
cv2.waitKey(3000)

# piecewise transformation the image and show it for 3 second
img = cv2.pyrDown(img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# bit-plane slicing the image and show it for 3 second
img = cv2.bitwise_not(img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# substraction the image and show it for 3 second
img = cv2.subtract(img, img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# use and operation to combine the image and show it for 3 second
img = cv2.bitwise_and(img, img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# use or operation to combine the image and show it for 3 second
img = cv2.bitwise_or(img, img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()

# use xor operation to get the image and show it for 3 second
img = cv2.bitwise_xor(img, img)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()