package src;

public class App {
    private static Database database = new Database();
    private static Input input = new Input();

    public static void main(String[] args) throws Exception {

        menu();

    }

    public static void banner() {
        System.out.println("===================================");
        System.out.println("===[ APLIKASI PEMESANAN DEVICE ]===");
        System.out.println("===================================");
    }

    public static void menu() {
        clear();
        banner();
        System.out.println("==[ MENU");
        System.out.println("[1] Laptop");
        System.out.println("[0] Keluar");
        Integer selectedMenu = input.getInt("Pilih Menu : ");
        switch (selectedMenu) {
            case 1:
                laptop();
                break;

            default:
                System.exit(0);
        }
    }

    public static void clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
        }
    }

    public static void laptop() {
        clear();
        banner();
        System.out.println("==Laptop");
        Laptop[] listLaptop = database.getLaptop();
        if (listLaptop.length == 0) {
            System.out.println("Tidak ada device");
        }
        for (int i = 0; i < listLaptop.length; i++) {
            Laptop laptop = listLaptop[i];
            System.out.println("[" + (i + 1) + "]" + laptop.getMerek());
        }

        // menu
        System.out.println();
        System.out.println("==[ MENU");
        System.out.println("[1] Tambah");
        System.out.println("[2] Hapus");
        System.out.println("[0] Main Menu");
        Integer selectedMenu = input.getInt("Pilih Menu : ");
        clear();
        banner();
        switch (selectedMenu) {
            case 1:
                System.out.println("==[ Tambah Device");
                Laptop laptop = new Laptop();
                String merek = input.get("Merek Laptop : ");
                String proc = input.get("Processor Laptop : ");
                Integer Ram = input.getInt("RAM (GB) : ");
                Integer diskSizeinGB = input.getInt("Disk Size (GB) : ");
                laptop.setMerek(merek);
                laptop.setProc(proc);
                laptop.setRAM(Ram);
                laptop.setdiskSizeinGB(diskSizeinGB);
                database.addLaptop(laptop);
                laptop();
                break;
            case 2:
                System.out.println("==[ Hapus Device");
                Integer number = input.getInt("Nomor Device Yang Ingin Dihapus : ");
                try {
                    database.laptop.remove(number - 1);
                } catch (Exception e) {
                    System.out.println("Gagal menghapus");
                }
                laptop();
                break;

            default:
                menu();
        }
    }

}
