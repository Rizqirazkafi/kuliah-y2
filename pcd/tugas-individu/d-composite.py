from PIL import Image, ImageOps

def main():
    file = "images/kson.jpg"
    image_a = Image.open(file)
    image_b = ImageOps.solarize(image_a)

    Image.composite(image_a, image_b, "RGBA").show()
   
if (__name__ == "__main__"):
    main()