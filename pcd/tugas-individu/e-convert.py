from PIL import Image, ImageOps

def main():
    file = "images/kson.jpg"
    image = Image.open(file)

    image.convert("1").show()
    # image.convert("L").show()
    # image.convert("RGB").show()
    # image.convert("RGBA").show()
    # image.convert("CMYK").show()
if (__name__ == "__main__"):
    main()