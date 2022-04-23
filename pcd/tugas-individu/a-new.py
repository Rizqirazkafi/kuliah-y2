from PIL import Image
import os

def main():
    size = width, height = 320,240
    image=Image.new("RGB", size, "white")
    image.show()
    del image

if (__name__ == "__main__"):

    main()