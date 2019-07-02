package com.example.demo.ch3.conditional;

/**
 * @author icourt
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
