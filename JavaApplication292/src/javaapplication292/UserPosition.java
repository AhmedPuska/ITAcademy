package javaapplication292;

public class UserPosition {

    public int userid;
    public UserPoint position;

    public static UserPosition parse(String input) {
        UserPosition uPos = new UserPosition();
        UserPoint uPoint = new UserPoint();
        String[] userData = input.split(",");
        uPos.userid = Integer.parseInt(userData[0].split(":")[1]);
        uPoint.x = Float.parseFloat(userData[1].split(":")[1]);
        uPoint.y = Float.parseFloat(userData[2].split(":")[1]);
        uPos.position = uPoint;

        return uPos;
    }

    @Override
    public String toString() {
        return "id: " + this.userid + " x: " + this.position.x + " y: " + this.position.y;
    }

}
