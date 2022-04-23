from PIL import Image

def main():
    file = "images/kson.jpg"
    image=Image.open(file)
    image.show()

if (__name__ == "__main__"):
    main()