public abstract class Character implements Movable, Comparable<Object> {

    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected final String RPGClass;
    protected int capacity;

    public Character(String name, String RPGClass) {
        this(name, RPGClass, 0);
    }

    public Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(Object object) {
        if (!(object instanceof Character)) {
            return 0;
        }

        Character other = (Character) object;

        if (this.getClass() == other.getClass()) {
            return Integer.compare(this.capacity, other.capacity);
        }

        if (this instanceof Mage && other instanceof Warrior) {
            Warrior warrior = (Warrior) other;

            if (this.capacity != 0
                    && warrior.capacity % this.capacity == 0) {
                return -1;
            }

            return 1;
        }

        if (this instanceof Warrior && other instanceof Mage) {
            return -other.compareTo(this);
        }

        return 0;
    }

    public void attack(String weapon) {
        System.out.println(name + ": Rrrrrrrrr....");
    }

    public final void unsheathe() {
        System.out.println(name + ": unsheathes his weapon.");
    }

    @Override
    public void moveRight() {
        System.out.println(name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back");
    }
}