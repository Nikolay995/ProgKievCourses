package Task3_4_Exceptions_Interfaces;

import Task3_4_Exceptions_Interfaces.Operations.Operations;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.createGroup();
        Operations.readUserInput();
    }
}
