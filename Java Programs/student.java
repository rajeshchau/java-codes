class student { // class
    String name; // variable
    int marks; // variable

    void results() { // method
        System.out.println("I am happy to announce that" + " " + name + " " + "got" + " " + marks);
    }

    public static void main(String[] args) {
        student stu = new student();
        stu.name = "rajesh";
        stu.marks = 97;
        stu.results(); // calling the class method

    }

}
