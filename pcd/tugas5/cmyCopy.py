#!/usr/bin/env python
from PIL import Image 
import numpy as np
def main():
    im = Image.open("images/kson.jpg")
    pixel_map = im.load()
    w,h = im.size
    for i in range(w):
        for j in range(h):
            r,g,b=im.getpixel((i,j))
            # CMY formula
            c = 1 - r/255
            m = 1 - g/255
            y = 1 - b/255

            # set pixel value
            pixel_map[i,j] = (int(c), int(m), int(y))
    im.show()
if (__name__ == "__main__"):
    main()
   
