abstract class Logistics {
    public abstract Transport createTransport();


}

class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistic extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class Main {

    public static void main(String[] args) {
        Logistics r = new RoadLogistics();
        Logistics s = new SeaLogistic();

        System.out.println(r.createTransport().deliver());
        System.out.println(s.createTransport().deliver());
    }

}