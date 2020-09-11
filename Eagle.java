public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }
    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("\n%s takes off in the sky.%n", this.getName());
        }

    }

    @Override
    public int ascend(int altitude) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + altitude, 200);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.println("It glides into the air.");
        }
    }

    @Override
    public int descend(int altitude) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - altitude, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 1 ) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't lands.%n", this.getName());

        }
    }
}
