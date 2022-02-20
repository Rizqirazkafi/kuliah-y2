from PIL import Image
from numpy import asarray
image = Image.open('image.jpg')
np_img = asarray(image)
print(np_img)
