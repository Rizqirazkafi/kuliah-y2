import cv2

img = cv2.imread('./MonsterHunterWorld.jpg')

img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
cv2.imshow('image', img)
cv2.waitKey(3000)
cv2.destroyAllWindows()