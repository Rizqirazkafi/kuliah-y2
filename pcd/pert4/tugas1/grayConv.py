from PIL import Image, ImageOps

im = ImageOps.grayscale(Image.open("images/kson.jpg"))
im.save("images/kson_gray.jpg")

