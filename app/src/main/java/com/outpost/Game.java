package com.outpost;

import java.io.Console;

import com.outpost.colony.Colony;
import com.outpost.engine.GameLoop;
import com.outpost.ui.ConsoleUI;

public class Game {
    private final Colony colony;
    private final ConsoleUI ui;
    private final GameLoop loop;

    public Game() {
        this.colony = new Colony();
        this.ui = new ConsoleUI();
        this.loop = new GameLoop();
    }

    public void start() {

    }
}
