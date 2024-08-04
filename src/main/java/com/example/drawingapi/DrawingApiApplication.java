package com.example.drawingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.DescriptorRead;
import java.io.IOException;

@SpringBootApplication
public class DrawingApiApplication {
    static Draw draw = new Draw();
    public static void main(String[] args) throws IOException {
        draw.draw();
    }

}
