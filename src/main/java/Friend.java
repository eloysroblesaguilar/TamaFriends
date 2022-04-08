import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Friend {
    @Column
    private String name;
    @Column
    private int health;
    @Column
    private int hunger;
    @Column
    private int cleanliness;
    @Column
    private int bowels;
    @Id
    @Column
    private Long id;

    public Friend() {
    }

    public Friend(String name, int health, int hunger, int cleanliness, int bowels) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.cleanliness = cleanliness;
        this.bowels = bowels;
    }

    public Friend(String name, int health, int hunger, int cleanliness, int bowels, Long id) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
        this.cleanliness = cleanliness;
        this.bowels = bowels;
        this.id = id;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getBowels() {
        return bowels;
    }

    public void setBowels(int bowels) {
        this.bowels = bowels;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
