class Inheritance {
    public static void main(String[] args) {
        Animal[] animal = {

                new Dog(),
                new Birds(),
        };
        for (int i = 0; i < animal.length; i++) {
            animal[i].ate();
            System.out.println();
            animal[i].color();
        }
        // Manager manger = new Manager();
        // manger.ageStudent();
        // manger.nameStudent();
        // manger.classStudent();
    }
}