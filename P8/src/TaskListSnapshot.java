class TaskListSnapshot {
    private List<Task> tasks;

    public TaskListSnapshot(List<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}