package adapter;

public class SpeedConverter implements MovableAdapter{
    private Movable sportCar;

    public SpeedConverter(Movable sportCar) {
        this.sportCar = sportCar;
    }

    double convertKMHtoMPH(double speedInKMH){
        return speedInKMH/1.61;
    }

    @Override
    public double getMaxSpeed() {
        return convertKMHtoMPH(sportCar.getMaxSpeed());
    }
}
