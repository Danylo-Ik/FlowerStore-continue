package ua.edu.ucu.apps.lab7.flower;

public enum FlowerType {
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");

    private final String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
