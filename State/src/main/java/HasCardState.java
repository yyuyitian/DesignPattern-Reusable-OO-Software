public class HasCardState implements ATMState {
    private ATMStateMachine stateMachine;

    public HasCardState(ATMStateMachine machine) {
        this.stateMachine = machine;
    }


    @Override
    public void insertCard() {
        System.out.println("you already have card in it, do not put it again");
    }

    @Override
    public void ejectCard() {
        System.out.println("here it your card");
        stateMachine.changeState(stateMachine.getNoCardState());
    }

    @Override
    public void inputPin(String str) {
        if (str.equals("12345678")) {
            System.out.println("you get the right password");
            stateMachine.changeState(stateMachine.getHasPinState());
        } else {
            System.out.println("you get the wrong password");
        }
    }

    @Override
    public void getCash() {

    }

    @Override
    public void putCash() {

    }
}
