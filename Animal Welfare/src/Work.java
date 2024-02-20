class Work<T> {
    private String name;
    private T details;

    Work(String name, T details) {
        this.name = name;
        this.details = details;
    }

    String getName() {
        return name;
    }

    T getDetails() {
        return details;
    }
}

