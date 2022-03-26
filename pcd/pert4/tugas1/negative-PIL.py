from PIL import Image, ImageOps

im = Image.open('images/kson.jpg')
im_invert = ImageOps.invert(im)
im_invert.save('images/kson_negative.jpg', quality=95)
