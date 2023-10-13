class NonSerializableClass1 {
    private String name;

    public NonSerializableClass1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NotSerializableClass1{" + "name='" + name + '\'' + '}';
    }
}
