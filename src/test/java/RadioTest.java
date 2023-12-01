import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void moreStationThanThereIs() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessStationThanThereIs() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessVolumeThanThereIs() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreVolumeThanThereIs() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchesNextStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchesPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchesPrevFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchesNextLastStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 12;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreThanThereIs() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLessThanThereIs() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void whenSwitchesStationZero(){
        Radio radio=new Radio(10);
        radio.setCurrentStation(9);
        radio.next();
        int expected=0;
        int actual=radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }


}