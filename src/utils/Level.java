package utils;

public enum Level {
    KEM("KÉM"),
    YEU("YẾU"),
    TRUNG_BINH("TRUNG BÌNH"),
    KHA("KHÁ"),
    GIOI("GIỎI"),
    XUAT_SAC("XUẤT SẮC");

    private final String vietnamese;

    Level(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    @Override
    public String toString() {
        return vietnamese;
    }
}
