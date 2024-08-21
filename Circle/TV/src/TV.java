public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV() {
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int newChannel) {
        if (this.on && newChannel >= 1 && newChannel <= 120) {
            this.channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (this.on && newVolume >= 1 && newVolume <= 7) {
            this.volumeLevel = newVolume;
        }
    }

    public void channelUp() {
        if (this.on && this.channel < 120) {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.on && this.channel > 1) {
            this.channel--;
        }
    }

    public void volumeUp() {
        if (this.on && this.volumeLevel < 7) {
            this.volumeLevel++;
        }
    }

    public void volumeDown() {
        if (this.on && this.volumeLevel > 0) {
            this.volumeLevel--;
        }
    }
}
