from PIL import Image, ImageOps

def main():
    file = "images/kson.jpg"
    image_a = Image.open(file)
    image_b = ImageOps.solarize(image_a)

    image_blended = Image.blend(image_a, image_b, 0.5)
    image_blended.show()
if (__name__ == "__main__"):
    main()