package job;
/**
 *
 * @author USER
 */
public class Job {

    private int Id;
    private String Name;
    private int NumUnits;

    public Job(int Id, String Name, int NumUnits) {
        this.Id = Id;
        this.Name = Name;
        this.NumUnits = NumUnits;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getNumUnits() {
        return NumUnits;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNumUnits(int NumUnits) {
        this.NumUnits = NumUnits;
    }

    @Override
    public String toString() {
        return "Job{" + "Id=" + Id + ", Name=" + Name + ", NumUnits=" + NumUnits + '}';
    }
}
