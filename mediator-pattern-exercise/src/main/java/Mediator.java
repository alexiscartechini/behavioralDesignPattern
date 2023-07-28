public class Mediator {

    private Plane plane;
    private PlanesOnGround planesOnGround;
    private Runway runway;
    private PlanesInFlight planesInFlight;

    public Mediator() {
        plane = new Plane(1);
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
        planesInFlight = new PlanesInFlight();
    }

    public void takeOff() {
        if(!plane.isInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }
}
