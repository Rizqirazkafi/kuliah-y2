from PIL import Image, ImageOps

def main():
    file = "images/kson.jpg"
    image = Image.open(file)

    image.crop((10,10,100,100)).show()
    # ((x start, y start, x end, y end))
if (__name__ == "__main__"):
    main()