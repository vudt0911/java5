public enum ProductType {
    FOOD("Thức ăn"), HOUSEHOLD("Đồ gia dụng"), BEAUTYPRODUCT("Mỹ phẩm"), FASHION("Thời trang");

    private String value;

    private ProductType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
