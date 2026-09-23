public class BulbAdapter implements SmartDevice{
    private final LegacyBulb bulb;
    private static final int K = 9;
    public  BulbAdapter(LegacyBulb bulb){
        if(bulb==null){
            throw new IllegalArgumentException("LegacyBulb must not be null")
        }
        this.bulb=bulb;
    }

    @Override
    public void turnOn(){
        bulb.setBrightness(255);
    }
    @Override
    public void turnOff()
}
