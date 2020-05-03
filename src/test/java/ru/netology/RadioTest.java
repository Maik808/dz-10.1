package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    void shouldSetNextChannel() {
        Radio radio = new Radio(6,9);
        radio.increaseChannal();
        assertEquals(7, radio.getCurrentChannal());
    }

    @Test
    void shouldSetPreviousChannal() {
        Radio radio = new Radio(6,9);
        radio.decreaseChannal();
        assertEquals(5, radio.getCurrentChannal());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFromMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void previousChannelFromMin() {
        Radio radio = new Radio(0,80,90,9,20,9);
        radio.decreaseChannal();
        assertEquals(19, radio.getCurrentChannal());
    }

    @Test
    public void setDesiredChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannal(5);
        assertEquals(5, radio.getCurrentChannal());
    }
    @Test
    public void increaseChannelFromMax() {
        Radio radio = new Radio();
        radio.setCurrentChannal(10);
        radio.increaseChannal();
        assertEquals(0, radio.getCurrentChannal());
    }

    @Test
    public void increaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeFromValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(250);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void increaseChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannal(20);
        radio.increaseChannal();
        assertEquals(0, radio.getCurrentChannal());
    }

    @Test
    public void previousChannelFromValue() {
        Radio radio = new Radio();
        radio.setCurrentChannal(20);
        radio.decreaseChannal();
        assertEquals(8, radio.getCurrentChannal());
    }
    @Test
    public void previousChannelFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentChannal(-20);
        radio.decreaseChannal();
        assertEquals(9, radio.getCurrentChannal());
    }

    @Test
    public void decreaseVolumeFromMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}
