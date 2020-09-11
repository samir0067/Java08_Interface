public class Penguin extends Bird implements Swim {

    private boolean swimming;
    private int depths;

    public Penguin(String name) {
        super(name);
        this.swimming = false;
        this.depths = 0;
    }

    @Override
    public String sing() {
        return "Quack!";
    }

    public int getDepths() {
        return depths;
    }

    public boolean isSwimming() {
        return swimming;
    }

    /**
     * plonge, doit être au sol
     */
    @Override
    public void dive() {
        if (!this.swimming && this.depths == 0) {
            this.swimming = true;
            System.out.printf("%s dives into the water.%n", this.getName());
        }
    }

    /**
     * nager vers le bas
     * @param meters La profondeur augmente
     * @return profondeur
     */
    @Override
    public int swimDown(int meters) {
        if (this.swimming) {
            this.depths = Math.min(this.depths + meters, 325);
            System.out.printf("%s swims downward, depths : %d%n", this.getName(), this.depths);
        }
        return this.depths;
    }

    /**
     * nager vers le haut
     * @param meters La profondeur diminuent
     * @return profondeur
     */
    @Override
    public int swimUp(int meters) {
        if (this.swimming) {
            this.depths = Math.max(this.depths - meters, 0);
            System.out.printf("%s swims upward, depths : %d%n", this.getName(), this.depths);
        }
        return this.depths;
    }

    /**
     * sort de l'eau, doit être à la surface
     */
    @Override
    public void getOut() {
        if (this.swimming && this.depths == 0) {
            System.out.printf("%s gets out of the water.%n", this.getName());
        } else {
            System.out.printf("%s is too deep, it can't get out.%n", this.getName());
        }
    }
}
