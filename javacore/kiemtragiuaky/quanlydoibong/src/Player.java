public class Player {

    int number;
    String fullname;
    Position position;

    public Player(int number, String fullname, Position position) {
        this.number = number;
        this.fullname = fullname;
        this.position = position;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Số áo: " + number + ", Tên cầu thủ: " + fullname + ", Vị trí: " + position;
    }

}