package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minChannal = 0;
    private int maxChannal = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentChannal;
    private int currentVolume;


    public Radio(int currentChannal, int maxChannal) {
        this.currentChannal = currentChannal;
        this.maxChannal = maxChannal;
    }

    public int getCurrentChannal() {
        return currentChannal;
    }

    public void setCurrentChannal(int currentChannal) {
        if (currentChannal > maxChannal) {
            this.currentChannal = maxChannal;
            return;
        }
        if (currentChannal < minChannal) {
            this.currentChannal = minChannal;
            return;
        }
        this.currentChannal = currentChannal;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void increaseChannal() {
        if (currentChannal == maxChannal) {
            this.currentChannal = minChannal;
            return;
        }
        currentChannal++;
    }

    public void decreaseChannal() {
        if (currentChannal == minChannal) {
            this.currentChannal = maxChannal;
            return;
        }
        currentChannal--;
    }
}
