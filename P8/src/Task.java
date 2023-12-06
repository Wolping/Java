class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public void completeTask() {
        this.completed = true;
    }

    public void undoCompleteTask() {
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }
}