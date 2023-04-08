public class ATMStateMachine {
    private ATMState atmState;
    private ATMState noCashState;
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState hasPinState;
    private int cash;

    public ATMStateMachine() {
        noCardState = new NoCardState(this);
        noCashState = new NoCashState(this);
        hasCardState = new HasCardState(this);
        hasPinState = new HasPinState(this);
        atmState = noCardState;
        if (cash == 0) {
            atmState = noCashState;
        }
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void getCash() {
        atmState.getCash();
    }

    public void putCash() {
        atmState.putCash();
    }

    public void inputPin(String str) {
        atmState.inputPin(str);
    }

    public void changeState(ATMState newState) {
        atmState = newState;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getNoCardState() {
        return  noCardState;
    }

    public ATMState getHasPinState() {
        return hasPinState;
    }
}
