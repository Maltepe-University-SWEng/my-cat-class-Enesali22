package tr.edu.maltepe.oop;
import javax.sound.sampled.*;
import java.io.File;

// Cat.java
public class Cat {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Method called 'meow'
    public void meow() {
        System.out.println(name + " (" + name + ") miyavlıyor!");
        try {
            File soundFile = new File("C:\\Users\\USER\\IdeaProjects\\my-cat-class-Enesali22\\a.wav"); // Ses dosyası proje klasöründe olmalı
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Ses çalınamadı: " + e.getMessage());
        }
    }
}
