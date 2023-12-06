class Caretaker {
    private Stack<TaskListSnapshot> snapshots = new Stack<>();

    public void saveSnapshot(TaskListSnapshot snapshot) {
        snapshots.push(snapshot);
    }

    public TaskListSnapshot restoreSnapshot() {
        if (!snapshots.isEmpty()) {
            return snapshots.pop();
        }
        return null;
    }
}