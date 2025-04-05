package designpatterns.behavioral.state;

interface TrafficLightState {
    void change(TrafficLight light);
}

class RedLight implements TrafficLightState {
    public void change(TrafficLight light) {
        light.setState(new GreenLight());
    }
}

class GreenLight implements TrafficLightState {
    public void change(TrafficLight light) {
        light.setState(new YellowLight());
    }
}

class YellowLight implements TrafficLightState {
    public void change(TrafficLight light) {
        light.setState(new RedLight());
    }
}

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(TrafficLightState initialState) {
        this.state = initialState;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.change(this);
    }
}
