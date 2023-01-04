package com.example.ex;

public class Task {
    /*
     * Create a class Task, objects of which represent tasks to be done. Objects
     * contain
     * private field descr of type String with a description of a task and (also
     * private) field
     * next of type Task with the reference to the next task (or null). In the
     * class, define
     * constructors and methods
     */
    private String descr;
    private Task next = null;

    public Task(String d, Task n) {
        this.descr = d;
        this.next = n;
    }

    public Task(String d) {
        this.descr = d;
    }

    // method setNextTask sets the field next to the value of the passed reference
    // t;
    public void setNextTask(Task t) {
        this.next = t;
    }

    // method printTasks prints in one line descriptions of this task and of all the
    // tasks that follow it;
    public void printTasks() {
        System.out.print(this.descr);
        if (this.next != null)
            this.next.printTasks();
    }

    /*
     * static function printTasks prints in one line descriptions of the task
     * represented
     * by head and of all the tasks that follow it (the function may reuse the
     * method
     * of the same name that has already been written);
     */
    public static void printTasks(Task head) {
        System.out.print(head.descr);
        if (head.next != null)
            Task.printTasks(head.next);
    }

    /*
     * recursive method printTasksRev is analogous to printTasks, but prints
     * descriptions in the reverse order, from the latest task to the one on which
     * it has
     * been invoked;
     */
    public void printTasksRev() {
        if (this.next != null)
            this.next.printTasksRev();
        System.out.print(this.descr);
    }

    /*
     * static function printTasksRev printing descriptions in the reverse order,
     * from
     * the latest task to the one represented by head (the function may reuse the
     * method of the same name that has already been written).
     */
    public static void printTasksRev(Task head) {
        if (head.next != null)
            Task.printTasksRev(head.next);
        System.out.print(head.descr);
    }
}
