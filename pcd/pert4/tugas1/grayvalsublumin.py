from PIL import Image

im = Image.open('images/kson.jpg')
pixel_map = im.load()

w,h = im.size

for i in range(w):
    for j in range(h):
        r,g,b= im.getpixel((i,j))

        #graysclae formula
        gs = (0.21*r + 0.71*g + 0.07*b)
        
        # set pixel value
        pixel_map[i,j] = (int(gs), int(gs), int(gs))

im.save("images/kson_gsLum.jpg")
