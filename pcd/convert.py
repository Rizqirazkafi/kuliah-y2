from PIL import Image
from numpy import asarray
image = Image.open('image.jpg')
croppedIm = image.crop((0,0,5,5))
croppedIm.show()
croppedIm.save('croppedIm.jpg')
width, height = croppedIm.size
resizedCrIm=croppedIm.resize((width*80, height*80), resample=0)
resizedCrIm.save('RCI.jpg')
np_img = asarray(croppedIm)
print(np_img)
