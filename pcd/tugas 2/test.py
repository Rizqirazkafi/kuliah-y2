from PIL import Image, ImageOps
im = ImageOps.grayscale(Image.open("mini.png"))

def get_image_data(path: str):
    im = Image.open(path)
    im_gray = ImageOps.grayscale(im)
    N, M = im_gray.size
    im_gray.show()
    im_level = str((im_gray.getbands()))
    if im_level == "('L',)":
        l = 256
    elif im_level == "('R', 'G', 'B')":
        l = 256*3

    print("Image :" , path)
    print(f"Image Size (N X M): {N}px x {M}px")
    print("Image Gray Level (L) : ", l, " bit")

get_image_data("kson-croped.png")
