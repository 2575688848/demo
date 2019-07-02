package com.example.demo.ch3.conditional;

/**
 * @author icourt
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
