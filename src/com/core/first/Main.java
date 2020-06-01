package com.core.first;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            TaskController.menuCircle();
        }
        catch (IOException e)
        {
            System.out.println("Something Wrong");
        }

    }
}
