#!/usr/bin/env python
from PIL import Image 

def main():
    file = 'images/bp.jpg'
    im = Image.open(file)
    im.show()

if (__name__ == "__main__"):
    main()