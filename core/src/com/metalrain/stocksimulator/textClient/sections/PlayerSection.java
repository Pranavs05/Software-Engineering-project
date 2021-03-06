package com.metalrain.stocksimulator.textClient.sections;

import com.metalrain.stocksimulator.textClient.ITextClientSection;
import com.metalrain.stocksimulator.textClient.TextClient;

import java.util.Scanner;

/**
 * Created by Adam Hammer on 6/22/2015.
 */
public class PlayerSection implements ITextClientSection{

    private final TextClient client;

    public PlayerSection(TextClient textClient) {
        this.client = textClient;
    }

    @Override
    public String getName() {
        return "Player";
    }

    @Override
    public String getDescription() {
        return "Player Description/State";
    }

    @Override
    public void invoke(String command, Scanner scanner) {
        client.getState().printUserData();

    }
}
